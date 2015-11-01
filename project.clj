(defproject xyzzwhy-corpora "1.0.0-SNAPSHOT"
  :description "A utility for maintaining xyzzwhy's corpora."
  :url "https://github.com/akivaschoen/xyzzwhy-corpora"
  :license {:name "GNU General Public License"
            :url "http://www.gnu.org/licenses/gpl.html"}

  :dependencies
  [[org.clojure/clojure "1.7.0"]
   [com.novemberain/monger "3.0.1"]
   [environ "1.0.1"]]

  :profiles
  {:uberjar
   [:prod-config
    {:env {:production true}
     :omit-source true
     :aot :all}]

   :dev
   [:dev-config
    {:plugins []
     :dependencies []}]})
