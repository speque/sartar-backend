(ns sartar-clan-questionnaire.migrations
  (:require [sartar-clan-questionnaire.config :refer [config]]))

(def migrations-config {:store         :database
                        :migration-dir "migrations"
                        :db            (:db config)})
