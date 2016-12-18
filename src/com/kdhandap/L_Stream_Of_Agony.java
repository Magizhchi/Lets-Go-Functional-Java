package com.kdhandap;


import java.util.Arrays;
import java.util.stream.Stream;

public class L_Stream_Of_Agony {
    /* So far everything has been nice with the Stream.of() method but as with everything in life this also can lead to quite a troublesome bugger
    We have worked with streams of String and integers but what would happen if we wanted to create a stream of a primitive array??
    Lets Find Out
     */
    public static void main(String[] args) {
        // A Stream of an Objects Array
        String[] batNames = new String[] {"Bruce", "Wayne"};
        Stream.of(batNames)
                .forEach(System.out::println);

        // A Stream of Discrete Objects
        Stream.of("Clark", "Kent")
                .forEach(System.out::println);

        // A Stream of a primitive Array
        // Now the Above code works Perfectly, But look what happens when we try to do the same for a primitive data Type
        int[] godNumber = new int[] {1,6,1,9};
        Stream.of(godNumber)
                .forEach(System.out::println);
        // Alas now the above piece of code returns the array Object itself ()

        // A Stream of Discrete Primitives
        Stream.of(1,4,1,7)
                .forEach(System.out::println);
        // Hmmm but this works fine, lets see what going on here

        /* The java documentation Specifies the two following method sgnatures for the stream.of() method
                Stream.of( T... args)
                Stream.of( T t)
          In case of the primitive array autoboxing did not happen and the varArgs Generic method was not chosen instead the Single Value Generic was used.
         */

        // A Stream of primitive Arrays using Arrays.stream()
        Arrays.stream(godNumber)
                .forEach(System.out::println);
        // To overcome the above shortcoming we can use the Arrays.stream() method instead

    }
}
