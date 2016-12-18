package com.kdhandap;

import java.util.Optional;
import java.util.stream.Stream;

public class K_Single_Value_Streams_Usage {
    // In the previous example we saw how to create a Stream of just a single value, Now let us see a small example as to how we can use this.

    // Lets Consider a function that will get the return the double of a number if the given number is even
    public static Optional<Integer> getDoubleOfIfEven(int value){
//        Iterative way
//        if (value % 2 == 0)
//            return Optional.of(value * 2);
//        else
//            return Optional.empty();

//        But what if we wanted to achieve a truly functional way to write this same piece of code,
//        We could use the Stream.of Function to do the same for us.

        return Stream.of(value)
                     .filter(e -> e % 2 == 0)
                     .map(e -> e * 2)
                     .findFirst();

        // The above function can lead to a Very troublesome little bugger lets see more about it in the next lesson.
    }
    public static void main(String[] args) {
        System.out.println(getDoubleOfIfEven(12));
        System.out.println(getDoubleOfIfEven(11));
    }
}
