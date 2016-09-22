package com.kdhandap;

import java.util.*;

public class A_IterativeVsFunctional {
    /* Lets now compare the traditional iterative and the much nicer functional way of java
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,5,17,16,21);
        System.out.println("Iterative" + factorsOfIterative(numbers));
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
