(ns xyzzwhy-corpora.datastore
  (:require [environ.core :refer env]
            [rethinkdb.query :as r]
            [xyzzwhy-corpora.io :as io]))


(defonce db-name "xyzzwhy_corpora")

(defn- ->table-name
  [c]
  (-> (if (map? c)
        (:classname c)
        c)
      name
      str
      (str/replace "-" "_")))

(defn- add-fragments
  [c]
  ;;(with-open [conn (r/connect (env :xyzzwhy-corpora-db))]
  (with-open [conn (r/connect)]
    (-> (r/db db-name)
        (r/table (->table-name c))
        (r/insert (:fragments classmap))
        (r/run conn))))

;; Existing in a pre-macro state (probably)
(defn- class-action
  [dsfn classmap]
  ((fn []
     (with-open [conn (r/connect)]
       (let [results (-> (r/db db-name)
                         (dsfn (->table-name classmap))
                         (r/run conn))]
         (println results)
         classmap)))))

(defn- class-query
  [dsfn]
  ((fn []
     (with-open [conn (r/connect)]
       (-> (r/db db-name)
           dsfn
           (r/run conn))))))

(defn- create-database
  []
  (with-open [conn (r/connect)]
    (r/run (r/db-create db-name) conn)))

(defn- add-class
  [c]
  (class-action r/table-create c))

(defn- delete-class
  [c]
  (class-action r/table-drop c))

(defn- list-classes
  []
  (class-query r/table-list))

(defn- class-exists?
  [classmap]
  (some (partial = (:classname classmap)) (list-classes)))

(def reset-class (comp add-fragments create-class delete-class io/read-class-file))
