package com.kdhandap;

import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by karth on 1/26/2017.
 */
public class O_Random_Generator {
    /* An infinite Stream or unbounded stream can be created in java with the help of the generate() method
    This can be very useful in a scenario where we would like to create 'n' infinite values
     */

    public static <T> void printStream (Stream<T> stream){
        stream.limit(5)
              .forEach(System.out::println);
    }
    public static void main(String[] args) {
        System.out.println("Using the Generate Method");
        Random rand = new Random();
        Stream<Integer> randomStream = Stream.generate(() ->rand.nextInt());
//         In the above function notice the lamda function we have used, So far we have seen a reduce, a bi function and a function
//         the above one is called a supplier, A function that doesnt take any input values but produces a single output
        printStream(randomStream);

//         We could also create the stream using the Random class's inbuilt function.
        System.out.println("Using the Random class, inbuilt generator");
        printStream(rand.ints().boxed());
//        printStream(rand.longs().boxed());
//        printStream(rand.doubles().boxed());
    }
}
