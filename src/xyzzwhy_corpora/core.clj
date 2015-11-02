(ns xyzzwhy-corpora.core
  (:require [environ.core :refer [env]]
            [monger.core :as mg]))

(def ^:private corpus {})
(defonce db (atom nil))

(defn initialize-db-connection!
  [& {:keys [uri]}]
  (reset! db (:db (mg/connect-via-uri (or uri (env :corpora-database-uri))))))

(defn- pluralize
  [c]
  (let [c' (name c)]
    (if (.endsWith c' "s")
      c'
      (str c' "s"))))

(defn- initialize-corpus-from-namespace
  [c n]
  (reduce #(conj %1 @(-> (ns-resolve n (symbol %2)) deref future))
          c
          (-> (ns-resolve n 'classes) deref)))

(defn- get-class
  [c]
  (-> c pluralize keyword corpus))

(defn -main
  [& args]
  (initialize-db-connection!)

  )
