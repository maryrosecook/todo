(ns todo.core
  (:gen-class))

(defn get-todo
  []
  (print "New todo: ")
  (flush)
  (read-line))

(defn get-command
  []
  (print "Enter command: ")
  (flush)
  (read-line))

(defn -main
  [& args])
