(ns sartar-clan-questionnaire.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [orchestra.spec.test :as ost]
            [ring.middleware.json :refer [wrap-json-response wrap-json-body]]
            [ring.middleware.cors :refer [wrap-cors]]
            [ring.logger :as logger]
            [ring.util.response :refer [response]]
            [sartar-clan-questionnaire.questions :refer [questions]]
            [sartar-clan-questionnaire.resolver :refer [resolve-questionnaire]]))

(defroutes app-routes
  (GET "/" []
    (response {:questions (map (fn [question]
      (-> question
          (assoc :options (map #(select-keys % [:title :rune]) (:options question)))
          (dissoc :tag))
    ) questions)}))
  (POST "/" request
    (response (resolve-questionnaire questions (get-in request [:body :answers]))))
  (route/not-found "Not Found"))

(def app
  (->
    (wrap-json-response app-routes)
    (wrap-json-body {:keywords? true})
    (wrap-cors :access-control-allow-origin [(re-pattern "http://localhost:3000")]
               :access-control-allow-methods [:options :post :get]
               :access-control-allow-headers ["Content-Type"])
    logger/wrap-with-logger))

(ost/instrument)
