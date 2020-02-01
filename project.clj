(defproject sartar-clan-questionnaire "0.1.0-SNAPSHOT"
  :description "Sartar: Kingdom of Hearoes clan questionnaire"
  :url "https://github.com/speque/sartar-backend"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/spec.alpha "0.2.176"]
                 [compojure "1.6.1"]
                 [migratus "1.2.7"]
                 [ring-cors "0.1.13"]
                 [ring-logger "1.0.1"]
                 [ring/ring-json "0.5.0"]
                 [org.postgresql/postgresql "42.2.9"]
                 [orchestra "2019.02.06-1"]
                 [com.walmartlabs/lacinia "0.35.0"]]
  :target-path "target/%s"
  :profiles {
              :dev {:dependencies [[metosin/testit "0.4.0"]
                                   [ring/ring-mock "0.4.0"]]}
              :uberjar {:aot :all}
              :kaocha {:dependencies [[lambdaisland/kaocha "0.0-581"]]}
            }
  :plugins [[lein-ring "0.12.5"]
            [lein-cljfmt "0.6.0"]
            [lein-ancient "0.6.15"]
            [migratus-lein "0.7.3"]]
  :aliases {"kaocha" ["with-profile" "+kaocha" "run" "-m" "kaocha.runner"]}
  :ring {:init sartar-clan-questionnaire.core/init
         :handler sartar-clan-questionnaire.core/app})
