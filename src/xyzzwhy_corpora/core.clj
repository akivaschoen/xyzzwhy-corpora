(ns xyzzwhy-corpora.core
  (:require [clojure.string :as str]
            [environ.core :refer [env]]
            [rethinkdb.query :as r]))

(defonce db-name "xyzzwhy_corpora")

(defn ->table-name
  [classname]
  (-> classname
      name
      str
      (str/replace "-" "_")))

(defn create-database
  []
  (with-open [conn (r/connect)]
    (r/run (r/db-create db-name) conn)))

(defn create-class
  [classname]
  ;;(with-open [conn (r/connect (env :xyzzwhy-corpora-db))]
  (with-open [conn (r/connect)]
    (-> (r/db db-name)
        (r/table-create (->table-name classname))
        (r/run conn))))

(defn add-fragments
  [classname fragments]
  ;;(with-open [conn (r/connect (env :xyzzwhy-corpora-db))]
  (with-open [conn (r/connect)]
    (-> (r/db db-name)
        (r/table (->table-name classname))
        (r/insert fragments)
        (r/run conn))))

(defn -main
  [& args]

  )
