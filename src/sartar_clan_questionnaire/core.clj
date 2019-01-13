(ns sartar-clan-questionnaire.core
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]
            [com.walmartlabs.lacinia :refer [execute]]
            [com.walmartlabs.lacinia.util :refer [attach-resolvers]]
            [com.walmartlabs.lacinia.schema :as schema]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [orchestra.spec.test :as ost]
            [ring.middleware.json :refer [wrap-json-response wrap-json-body]]
            [ring.middleware.cors :refer [wrap-cors]]
            [ring.logger :as logger]
            [ring.util.response :refer [response]]
            [sartar-clan-questionnaire.questions :refer [questions filtered-questions]]
            [sartar-clan-questionnaire.resolver :refer [resolve-questionnaire]]))

(def questionnaire-schema
  (-> (io/resource "graphql_schema.edn")
      slurp
      edn/read-string
      (attach-resolvers {:query/questions filtered-questions})
      schema/compile))

(defroutes app-routes
  (POST "/graphql" request
    (response
      (let [query (get-in request [:body :query])]
        (execute questionnaire-schema query nil nil))))

  (GET "/" []
    (response {:questions (map (fn [question]
      (-> question
          (assoc :options (map #(select-keys % [:title :rune :explanation]) (:options question)))
          (dissoc :tag))
    ) questions)}))

  (POST "/" request
    (let [{:keys [answers inputs]} (:body request)]
      (response (resolve-questionnaire questions answers inputs))))

  (route/not-found "Not Found"))

(def app
  (->
    (wrap-json-response app-routes)
    (wrap-json-body {:keywords? true})
    (wrap-cors :access-control-allow-origin [(re-pattern "http://localhost:\\d+")]
               :access-control-allow-methods [:options :post :get]
               :access-control-allow-headers ["Content-Type"])
    logger/wrap-with-logger))

(ost/instrument)
