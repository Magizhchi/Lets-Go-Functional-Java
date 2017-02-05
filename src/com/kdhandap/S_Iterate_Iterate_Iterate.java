package com.kdhandap;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by karth on 2/5/2017.
 */
public class S_Iterate_Iterate_Iterate {
    /* The iterate function is of great use in creating infinite streams, It also helps us to change the way about how we create and use streams.
    Here let us write a function that will print 10 primes starting from 1
    Here we will compare and contrast the iterative and functional way to write this
     */

    public static void main(String[] args) {
        /*Compare the commented portion of the code(iterative) and the other part(functional)
        we must agree that the functional style sure does offer an concise and neat way to write the same piece of code.
         */
        computePrimes(1).limit(10)
                                .forEach(System.out::println);
//        List<Integer> primes = computePrimes(1, 10);
//        System.out.println(primes);
    }

    private static Stream<Integer> computePrimes(int starting) {
        return Stream.iterate(starting, e -> e+1)
                     .filter(S_Iterate_Iterate_Iterate::isPrime);
//        int count = 10
//        List<Integer> result = new ArrayList<>();
//        int found = 0;
//        for (int i = starting; found < count; i++) {
//            if (isPrime(i)){
//                found++;
//                result.add(i);
//            }
//        }
//        return result;
    }

    private static boolean isPrime(int number) {
        return number > 1 && IntStream.range(2, number)
                                      .noneMatch(e -> number % e == 0);
//        boolean divisible = false;
//        for (int i = 2; i < number; i++) {
//             if ( number % i == 0) {
//                 divisible = true;
//                 break;
//             }
//        }
//        return number > 1 && !divisible;
    }
}
