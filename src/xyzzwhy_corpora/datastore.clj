(ns xyzzwhy-corpora.datastore
  (:require [environ.core :refer env]
            [rethinkdb.query :as r]
            [xyzzwhy-corpora.io :as io]))


(defonce db-name "xyzzwhy_corpora")


;;
;; Datastore Functions
;;
(defn- ->table-name
  [classmap]
  (-> classmap
      :classname
      name
      str
      (str/replace "-" "_")))

(defn- add-fragments
  [classmap]
  ;;(with-open [conn (r/connect (env :xyzzwhy-corpora-db))]
  (with-open [conn (r/connect)]
    (-> (r/db db-name)
        (r/table (->table-name classmap))
        (r/insert (:fragments classmap))
        (r/run conn))))

(declare list-classes) ;; Unsure if this is idomatic
(defn- class-exists?
  [classmap]
  (some (partial = (:classname classmap)) (list-classes)))

(defn- create-database
  []
  (with-open [conn (r/connect)]
    (r/run (r/db-create db-name) conn)))

(defn- create-class
  [classmap]
  ;;(with-open [conn (r/connect (env :xyzzwhy-corpora-db))]
  (with-open [conn (r/connect)]
    (-> (r/db db-name)
        (r/table-create (->table-name classmap))
        (r/run conn)))
  classmap)

(defn- delete-class
  [classmap]
  (when (class-exists? classmap)
    (with-open [conn (r/connect)]
      (-> (r/db db-name)
          (r/table-drop (->table-name classmap))
          (r/run conn))))
  classmap)

(defn- list-classes
  []
  (with-open [conn (r/connect)]
    (-> (r/db db-name)
        (r/table-list)
        (r/run conn))))

(def reset-class (comp add-fragments create-class delete-class io/read-class-file))
