package com.kdhandap;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Created by karth on 2/19/2017.
 */
public class U_IntStream_DoubleStream {
    /* In addition to the Generic Stream object in java we also have Specialized streams like IntStream and DoubleStream which provide a few really helpful functions
    Let us now look at some of these Functions
     */
    public static void main(String[] args) {
        // Special Methods in IntStream
        System.out.println("Total of the elements is " + IntStream.range(0, 10)
                                                                  .average()); // we can also have functions like sum(), Max(), Min()

        // Special Methods in DoubleStream(All methods of IntStream is also applicable for DoubleStream)
        System.out.println("Specialized Double Function "+ DoubleStream.iterate(0, e -> e+1)
                                                                        .limit(10)
                                                                        .summaryStatistics()); // We can go ahead and call getAverage() on the above method to get the average value and so on
    }
}
