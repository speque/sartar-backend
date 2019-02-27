(ns sartar-clan-questionnaire.core-test
  (:require [ring.mock.request :as mock]
            [cheshire.core :as json]
            [ring.logger :as logger]
            [clojure.test :refer :all]
            [testit.core :refer :all]
            [sartar-clan-questionnaire.core :refer [app]]))

(deftest test-core
  (let [response (app (mock/request :get "/"))]
    (facts "GETting / returns the questionnaire questions"
           (:status response) => 200
           (get (:headers response) "Content-Type") => "application/json; charset=utf-8")) ;; TODO check body

  (fact "POSTing to / returns the questionnaire results"
        (let [response (app (->
                             (mock/request :post "/")
                             (mock/content-type "application/json")
                             (mock/body (json/generate-string {:answers [1 0 1 0 0] :inputs [nil nil nil nil nil]}))))]
          (:status response)) => 200))
