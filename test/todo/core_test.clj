(ns todo.core-test
  (:require [clojure.test :refer :all]
            [todo.core :refer :all]))

(deftest test-user-input-todo
  (testing "Asks for 'New todo: '"
    (is (= "New todo: "
           (with-in-str "Get milk"
             (with-out-str (user-input-todo))))))

  (testing "Returns text input"
    (is (= "Get milk"
           (with-in-str "Get milk"
             (user-input-todo))))))

(deftest test-user-input-command
  (testing "Asks for 'Enter command: '"
    (is (= "Enter command: "
           (with-in-str "new"
             (with-out-str (user-input-command))))))

  (testing "Returns command"
    (is (= :new
           (with-in-str "new"
             (user-input-command))))))

(deftest test-command->fn
  (testing "Takes 'say-hi' and returns say-hi fn"
    (is (= say-hi
           (command->fn :say-hi)))))

(deftest test-interaction-loop
  (testing "Runs say-hi command and exit command"
    (is (= nil
           (with-in-str "exit"
             (interaction-loop))))))

(deftest test-can-run-main
  (-main))
