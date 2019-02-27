(defproject sartar-clan-questionnaire "0.1.0-SNAPSHOT"
  :description "Sartar: Kingdom of Hearoes clan questionnaire"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/spec.alpha "0.2.176"]
                 [compojure "1.6.1"]
                 [ring-cors "0.1.13"]
                 [ring-logger "1.0.1"]
                 [ring/ring-json "0.4.0"]
                 [orchestra "2019.02.06-1"]
                 [com.walmartlabs/lacinia "0.32.0"]]
  :target-path "target/%s"
  :profiles {
    :dev {:dependencies [[midje "1.9.6"]
                         [ring/ring-mock "0.3.2"]
                         [org.clojure/test.check "0.9.0"]]}
    :uberjar {:aot :all}
  }
  :plugins [[lein-ring "0.9.7"]
            [lein-cljfmt "0.6.0"]
            [lein-midje "3.2.1"]]
  :ring {:handler sartar-clan-questionnaire.core/app})
