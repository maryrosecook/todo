(ns todo.core
  (:gen-class))

(defn get-todo []
  (print "New todo: ")
  (flush)
  (read-line))

(defn -main
  [& args])
