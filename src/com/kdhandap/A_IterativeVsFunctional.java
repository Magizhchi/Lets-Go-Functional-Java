package com.kdhandap;

import java.util.Arrays;
import java.util.List;

public class A_IterativeVsFunctional {
    /* Lets now compare the traditional iterative and the much nicer functional way of java
     */
    public static void main(String[] args) {
        System.out.println(factorsOf(1));
    }

    private static List<Integer> factorsOf(int i) {
        return Arrays.asList(1);
    }
}
