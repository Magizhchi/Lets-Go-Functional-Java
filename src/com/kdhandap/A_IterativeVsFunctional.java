package com.kdhandap;

import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class A_IterativeVsFunctional {
    /* Lets now compare the traditional iterative and the much nicer functional way of java
     */
    public static void main(String[] args) {
        // Given a list of numbers, return the list of all faactors

        List<Integer> numbers = Arrays.asList(2,5,17,16,21);
        System.out.println("Iterative  :" + factorsOfIterative(numbers));
        System.out.println("Functional :" + factorsOfRecursive(numbers));
    }

    private static Set<Integer> factorsOfRecursive(List<Integer> numbers) {
        return numbers.stream()
                      .flatMap(e -> factorsOfRecursive(e).stream())
                      .collect(toSet());
    }

    private static List<Integer> factorsOfRecursive(int number) {
        return IntStream.rangeClosed(1, number)
                        .filter( i -> number % i == 0)
                        .boxed()
                        .collect(toList());
    }

    private static Set<Integer> factorsOfIterative(List<Integer> numbers) {
        Set<Integer> factors = new HashSet<>();
        for (int number : numbers){
            factors.addAll(factorsOfIterative(number));
        }
        return factors;
    }

    private static List<Integer> factorsOfIterative(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int j = 1; j <= number; j++) {
            if (number % j == 0)
                factors.add(j);
        }
        return factors;
    }
}
