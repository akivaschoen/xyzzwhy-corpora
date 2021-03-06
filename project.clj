(defproject xyzzwhy-corpora "1.0.0-SNAPSHOT"
  :description "A utility for maintaining xyzzwhy's corpora."
  :url "https://github.com/akivaschoen/xyzzwhy-corpora"
  :license {:name "GNU General Public License"
            :url "http://www.gnu.org/licenses/gpl.html"}

  :dependencies
  [[org.clojure/clojure "1.8.0"]
   [xyzzwhy/datastore "1.0.0-SNAPSHOT"]]

  :plugins
  [[lein-environ "1.0.1"]]

  :main xyzzwhy-corpora.core

  :profiles
  {:uberjar
   [:prod-config
    {:env {:production true}
     :omit-source true
     :aot :all}]

   :dev
   [:dev-config
    {:env {:dev true}
     :plugins []
     :dependencies []}]})
