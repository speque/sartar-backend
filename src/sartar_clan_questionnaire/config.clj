(ns sartar-clan-questionnaire.config)

(def config
  {:db {:classname   "org.postgresql.Driver"
        :subprotocol "postgresql"
        :subname     "//localhost/sartar"
        :user        "dbadmin"
        :password    "ruuttipassu"}})
