(ns genetic-clojure.core
  (:use [clojure.contrib.math]))

(def alphabet
     "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!? ")

(def target
     "Hello Clojure World!")

(defn difference-between-chars
  "Returns the distance between the int representations of two chars"
  [a b]
  (abs (- (int a) (int b))))

(defn fitness
  "Determines the fitness of a given chromo based on how far each of its
  characters are from the target string"
  [chromo]
  (reduce + (map difference-between-chars chromo target)))

(defn breed
  "Breeds two chromos together by splitting them in a random place and
  switching the halves. Returns a vector of the two new strings"
  ([s1 s2]
     ;; No position was passed in- let's generate a random one
     (breed s1 s2 (rand-int (count s1))))
  ([s1 s2 position]
     (map (fn [a b]
            (apply str (concat (take position a) (drop position b))))
          [s1, s2] [s2, s1])))

(defn random-char
  "Returns a random char in our alphabet"
  []
  (rand-nth alphabet))

(defn create-random-chromo
  "Creates a string of the given length composed of random letters"
  [length]
  (apply str (take length (repeatedly random-char))))

(defn generate-random-sample
  []
  (repeatedly 100 #(create-random-chromo (count target))))

(defn sort-by-fitness
  [list]
  (sort-by #(fitness %) list))

(defn tourny-select-chromo
  "Takes a list of chromos, selects two at random, and returns the one with
  best fitness"
  [list]
  (first (sort-by-fitness (take 2 (repeatedly #(rand-nth list))))))
