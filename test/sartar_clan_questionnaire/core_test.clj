(ns sartar-clan-questionnaire.core-test
  (:use midje.sweet)
  (:require [ring.mock.request :as mock]
            [cheshire.core :as json]
            [ring.logger :as logger]
            [sartar-clan-questionnaire.core :refer [app]]))

(facts "about core"
  (fact "get request to / returns the questionnaire questions"
    (let [response (app (mock/request :get "/"))]
      (:status response) => 200
      (get (:headers response) "Content-Type") => "application/json; charset=utf-8")) ;; TODO check body

  (fact "post request to / returns the questionnaire results"
    (let [response (app (->
                          (mock/request :post "/")
                          (mock/content-type "application/json")
                          (mock/body (json/generate-string {:answers [1 0 1 0 0]}))))]
      (:status response) => 200)))
