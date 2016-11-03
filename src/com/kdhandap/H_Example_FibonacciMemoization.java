package com.kdhandap;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class H_Example_FibonacciMemoization {
    /* Now let us try to use the compute functions we had seen before to tackle a very common problem in computer science
    Computation of fibonacci series for large numbers, often we end up recomputing the branches of the recursion tree
    The functions we saw is the previous example computeIfAbsent can be very helpful here.
     */

    private static Map<Integer,BigInteger> cache = new HashMap<>();

    public static void main(String[] args) {
        cache.put(0, new BigInteger("1"));
        cache.put(1, new BigInteger("1"));
        long start = System.nanoTime();
        System.out.println("Value is : " + fib(13));
        long end = System.nanoTime();
        System.out.println("Time taken is : "  + (end-start)/1.0e9);
    }

    private static BigInteger fib(int position) {
        IntStream.rangeClosed(0, position)
                    .forEach(i -> cache.computeIfAbsent(i, ignore -> fib(i-1).add(fib(i-2))));

//        This will fail at certain values like 13, because it is not a pure function
//        cache.computeIfAbsent(position, ignore -> fib(position-1).add(fib(position-2)));
        return cache.get(position);
    }
}
