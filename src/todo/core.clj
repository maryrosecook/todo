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
  (keyword (read-line)))

(defn say-hi
  []
  (println "hi"))

(defn new-todo-command
  [state]
  (conj state (user-input-todo)))

(defn command->fn
  [command]
  (let [command->fn-mapping {:say-hi say-hi}]
    (command->fn-mapping command)))

(defn interaction-loop
  [state]
  (let [command (user-input-command)]
    (if (not= command :exit)
      (do
        ((command->fn command))
        (recur state)))))

(defn -main
  [& args]
  (interaction-loop {}))
