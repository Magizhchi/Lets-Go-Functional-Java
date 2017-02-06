package com.kdhandap;

import java.util.stream.Stream;

/**
 * Created by karth on 2/6/2017.
 */
public class T_Ways_To_Total {
    // In this lesson let us look in to the different ways using which we can total a set of values
    // Each of the commented lines represent an alternative way to total the sum of Integer's
    public static void main(String[] args) {
        // return the sum of double of the first k even numbers starting with n
        System.out.println(compute(22, 100));
    }

    private static int compute(int starting, int count) {
        return Stream.iterate(starting, e -> e+1)
                    .filter(T_Ways_To_Total::isEven)
                    .limit(count)
                    .mapToInt(e -> e*2)
//                    .reduce(0, (total, e) -> total + e); // Starting with 0 reduce it to the sum of values
//                    .reduce(0, (total, e) -> Integer.sum(total, e)); // Using a function to total
//                    .reduce(0, Integer::sum);   // Using a method reference in place of the binary function
                    .sum(); // This will require a little bit more effort as we have to convert the stream to an IntStream, All the other functions written above dont need the mapToInt() Conversion, But it produces a concise code
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
