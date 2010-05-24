(defproject clj-puzz "0.1.0-SNAPSHOT"
  :description "jpuzz in clojure"
  :dependencies [[org.clojure/clojure "1.2.0-master-SNAPSHOT"]
                 [org.clojure/clojure-contrib "1.2.0-SNAPSHOT"]
                 [penumbra "0.6.0-SNAPSHOT"]]
  :native-dependencies [[penumbra/lwjgl "2.4.2"]]
  :dev-dependencies [[swank-clojure "1.2.1"]
                     [native-deps "1.0.0"]])
