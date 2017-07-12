(ns todo.core
  (:gen-class))

(defn user-input-todo
  []
  (print "New todo: ")
  (flush)
  (read-line))

(defn user-input-command
  []
  (print "Enter command: ")
  (flush)
  (read-line))

(defn say-hi
  []
  (println "hi"))

(defn command->fn
  [command]
  (let [command->fn-mapping {:say-hi say-hi}]
    (command->fn-mapping (keyword command))))

(defn user-input-command-and-run
  []
  ((command->fn (user-input-command))))

(defn -main
  [& args])
