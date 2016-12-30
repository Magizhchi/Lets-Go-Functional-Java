package com.kdhandap;

import java.util.Arrays;
import java.util.List;

/**
 * Created by karth on 12/29/2016.
 */
public class M_Skip {
    /* Lets consider this simple operation on a list
        Double the values, sort them and get the FIFTH Value in the list
        We have explored so far how to double a given set of values and sort them,
        We have also seen how we can Retrieve the first or the list element in the stream
        Now let us see how to get the nth element in any given stream.
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,12,10,4,6,8,2,11);

        System.out.println(numbers.stream()
                                    .map(e -> e*2)
                                    .sorted()
                                    .skip(4)        // It shows how nicely we can skip the values we don't need
                                    .findFirst()
                                    .orElse(0));    // The orElse method gives us a default value for the optional Argument.
    }
}
