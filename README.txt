# Genetic Algorthm Hello World (in Clojure!)

## Introduction
  Uses an genetic algorithm to go from a list of random strings to our target.

  1. Creates a list of random strings with generate_random_chromosomes(),
  called 'samples.'

  2. Selects a subset of the samples to create a 'selected' group. First takes
  the top 1% samples (elitism), then uses tourny select to find the
  rest. Tourny select works by selecting two random samples, and using the
  one with the highest fitness score.

  3. Creates a 'solution' group by randomly taking two chromosomes from the
  selected group and breeding (combining) these together. Periodically, a
  mutiation factor is added to this new 'solution.' Repeat this process until
  we have a sufficent number of solutions.

  4. Repeat steps 2 and 3, with each generated solution set becoming the new
  generation of samples. Do this until a generation has a solution of fitness
  of 0 (matches our target).


## Usage 
  All of the parameters are hardcoded (I'm new to Clojure, leave me
  alone). Therefore, to run the genetic algorithm simply import the project
  and call the (run) function.

  (use 'genetic-clojure.core)
  (run)


## Changelog 
  v1.00: Initial release!


## Inspiration
  Idea and algorithm inspired completely by Howard Yeend's blog post 
  at http://www.puremango.co.uk/2010/12/genetic-algorithm-for-hello-world/ .
  I have also created a python version, available at 
  https://github.com/topher200/genetic-hello-world-python .


## License
  Copyright Topher Brown <topher200@gmail.com>, 2011. Released under the MIT 
  license.
