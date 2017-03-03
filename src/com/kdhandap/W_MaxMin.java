package com.kdhandap;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by karth on 3/3/2017.
 */
public class W_MaxMin {
    /* Earlier we saw that max and min methods in IntStream and DoubleStream
    But what if we wanted to perform max and minoperations on a stream of objects
     */
    public static void main(String[] args) {
        Stream<Double> values = Arrays.asList(1.0, 2.0, 3.0).stream();

        use(values);
    }

    private static <T extends Comparable<T>> void use(Stream<T> stream) {
//        // Method 1
//        System.out.println(stream.max(
//                new Comparator<T>() {
//                    public int compare(T obj1, T obj2) {
//                        return obj1.compareTo(obj2);
//                    }
//                }));

//        // Method 2
//        System.out.println(stream.min((obj1, obj2) -> obj1.compareTo(obj2)));

        // Using Functions Reference
        System.out.println(stream.min(Comparable::compareTo));
    }
}
