(ns genetic-clojure.test.core
  (:use [genetic-clojure.core] :reload)
  (:use [clojure.test]))

(deftest target-in-alphabet-test
  "Checks that every char in target has a matching char in alphabet"
  (is (every?
       (fn [target-char]
         (some #(= target-char %) alphabet))
       target)))

(deftest target-test
  "Our tests depend on a hardcoded target string- test that they match"
  (is (= "Hello Clojure World!" target)))

(deftest fitness-test
  (is (= 0 (fitness "Hello Clojure World!")))
  (is (= 1 (fitness "Iello Clojure World!")))
  (is (= 5 (fitness "Iallo Clojure World!"))))

(deftest breed-test
  (is (= "bb" (breed "aa" "bb" 0)))
  (is (= "ab" (breed "aa" "bb" 1)))
  (is (= "abb" (breed "aaa" "bbb" 1))))

(deftest difference-between-chars-test
  (is (= 0 (difference-between-chars \a \a)))
  (is (= 1 (difference-between-chars \a \b)))
  (is (= 1 (difference-between-chars \b \a)))
  (is (= 1 (difference-between-chars \A \B)))
  (is (= 32 (difference-between-chars \a \A))))

(deftest sort-by-fitness-test
  (is (= ["Hello Clojure World!" "asdkljsadfkljsdfkj"]
           (sort-by-fitness ["asdkljsadfkljsdfkj" "Hello Clojure World!"]))))
