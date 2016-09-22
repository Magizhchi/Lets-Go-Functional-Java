package com.kdhandap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C_Example_PythogoreanTriples {
    /*
    * Now lets look at another simple example to illustrate the difference between the iterative and functional approach
    * We will be using the an euclid formula here - https://en.wikipedia.org/wiki/Pythagorean_triple#Generating_a_triple
    * This exercise will give us a nice contrast between both the approaches
    */
    private static List<Integer> getTriple(int m, int n) {
        List<Integer> pythogoreanTriple = new ArrayList<>();
        pythogoreanTriple.add(m*m - n*n);
        pythogoreanTriple.add(2*m*n);
        pythogoreanTriple.add(m*m + n*n);
        return pythogoreanTriple;
    }

    public static void main(String[] args) {
        // Find all values that satisfy the equation a^2 + b^2 = c^2

        computeIterative(5);
        System.out.println("----------------------");
        computeFunctional(5);
    }

    private static void computeFunctional(int maxValues) {
        IntStream.rangeClosed(2, maxValues)
                 .boxed()
                 .flatMap(m -> getTripleForM(m))
                 .limit(maxValues)
                 .forEach(System.out::println);
    }

    private static Stream<List<Integer>> getTripleForM(int m) {
        return IntStream.range(1,m)
                        .boxed()
                        .map(n -> getTriple(m,n));
    }

    private static void computeIterative(int maxValues) {
        int count = 1;
        for (int m = 2; ; m++) {
            for (int n = 1; n < m; n++) {
                System.out.println(getTriple(m,n));
                count++;
                if (count > maxValues) break;
            }
            if (count > maxValues) break;
        }
    }
}
