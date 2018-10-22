(defproject sartar-clan-questionnaire "0.1.0-SNAPSHOT"
  :description "Sartar: Kingdom of Hearoes clan questionnaire"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/spec.alpha "0.2.176"]
                 [compojure "1.6.1"]
                 [ring-cors "0.1.12"]
                 [ring-logger "1.0.1"]
                 [ring/ring-json "0.4.0"]
                 [orchestra "2018.09.10-1"]]
  :target-path "target/%s"
  :profiles {
    :dev {:dependencies [[midje "1.9.4"]
                         [ring/ring-mock "0.3.2"]
                         [org.clojure/test.check "0.9.0"]]}
    :uberjar {:aot :all}
  }
  :plugins [[lein-ring "0.9.7"]
            [lein-cljfmt "0.6.0"]
            [ring/ring-mock "0.3.2"]]
  :ring {:handler sartar-clan-questionnaire.core/app})
