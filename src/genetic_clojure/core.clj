(ns genetic-clojure.core)

(def alphabet
     '("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
     "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B",
     "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
     "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "!", "?"))

(defn fitness
  "Determines the fitness of a given chromo based on how far it is from the
  target string"
  [chromo]
  -1)

(defn breed
  "Breeds two chromos together by splitting them in a random place and
  switching the halves"
  [s1 s2 position]
  '("not", "implemented"))

(defn random-char
  "Returns a random char in our alphabet"
  []
  (rand-nth alphabet))

(defn create-random-chromo
  "Creates a string of the given length composed of random letters"
  [length]
  (take length (repeatedly random-char)))


