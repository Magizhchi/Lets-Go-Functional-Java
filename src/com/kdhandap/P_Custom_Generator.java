package com.kdhandap;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

/**
 * Created by karth on 1/27/2017.
 */
class FibonacciSeries{
    private int previous = 0;
    private int current = 1;

    int next(){
        int result = current + previous;
        previous = current;
        current = result;
        return result;
    }
}

public class P_Custom_Generator {
    /* In the previous Lesson we saw how we can create an infinite stream of random integers using The Random Class
       But what if we wanted to create a known pattern. In this lesson lets see how we can create one of the most popular series in mathematics
       'The Fibonacci series' using generate()
     */
    public static void main(String[] args) {
        FibonacciSeries series = new FibonacciSeries();
        System.out.println(Stream.generate(series::next)
                                  .limit(10)
                                  .map(String::valueOf)
                                  .collect(joining(", ")));
    }
}
