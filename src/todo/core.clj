(ns todo.core
  (:gen-class))

(defn get-todo []
  (print "New todo: ")
  (flush)
  (read-line))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
