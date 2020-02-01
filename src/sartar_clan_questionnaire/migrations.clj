(ns sartar-clan-questionnaire.migrations)

(def config {:store         :database
             :migration-dir "migrations"
             :db            {:classname   "org.postgresql.Driver"
                             :subprotocol "postgresql"
                             :subname     "//localhost/sartar"
                             :user        "dbadmin"
                             :password    "ruuttipassu"}})
