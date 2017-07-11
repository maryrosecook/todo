(ns todo.core-test
  (:require [clojure.test :refer :all]
            [todo.core :refer :all]))

(deftest test-get-todo
  (testing "Asks for 'New todo: '"
    (is (= "New todo: "
           (with-in-str "Get milk"
             (with-out-str (get-todo))))))

  (testing "Returns text input"
    (is (= "Get milk"
           (with-in-str "Get milk"
             (get-todo))))))

(deftest test-get-command
  (testing "Asks for 'Enter command: '"
    (is (= "Enter command: "
           (with-in-str "new"
             (with-out-str (get-command))))))

  (testing "Returns command"
    (is (= "new"
           (with-in-str "new"
             (get-command))))))

(deftest test-can-run-main
  (-main))
