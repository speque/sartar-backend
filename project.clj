(defproject sartar-clan-questionnaire "0.1.0-SNAPSHOT"
  :description "Sartar: Kingdom of Hearoes clan questionnaire"
  :url "https://github.com/speque/sartar-backend"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/spec.alpha "0.2.176"]
                 [compojure "1.6.1"]
                 [ring-cors "0.1.13"]
                 [ring-logger "1.0.1"]
                 [ring/ring-json "0.5.0"]
                 [orchestra "2019.02.06-1"]
                 [com.walmartlabs/lacinia "0.35.0"]]
  :target-path "target/%s"
  :profiles {
              :dev {:dependencies [[metosin/testit "0.4.0"]
                                   [ring/ring-mock "0.4.0"]]}
              :uberjar {:aot :all}
              :kaocha {:dependencies [[lambdaisland/kaocha "0.0-565"]]}
            }
  :plugins [[lein-ring "0.9.7"]
            [lein-cljfmt "0.6.0"]]
  :aliases {"kaocha" ["with-profile" "+kaocha" "run" "-m" "kaocha.runner"]}
  :ring {:handler sartar-clan-questionnaire.core/app})
