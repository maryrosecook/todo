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

(defn match-command-to-fn
  [command]
  (let [command->fn {:say-hi say-hi}]
    (println (type (command->fn (keyword command))))
    (command->fn (keyword command))))

(defn get-and-run-command
  []
  ((match-command-to-fn (get-command))))

(defn say-hi
  []
  (println "hi"))

(defn -main
  [& args])
