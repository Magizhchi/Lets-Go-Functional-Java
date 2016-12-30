package com.kdhandap;

import java.util.Arrays;
import java.util.List;

/**
 * Created by karth on 1/8/2017.
 */
public class N_Limit {
    /*
        In the previous example we saw how we can skip a number of elements and work with the rest,
         Now let us see how we can 'limit' the stream to a given set of elements and work with the rest
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,1,3,45,61,15,19,20,12);

        // Let us now double the values in the list and find out the sum of the first 7 values
        System.out.println(numbers.stream()
                                  .mapToInt(e -> e*2)
                                  .limit(7)
                                  .sum());

        // Now we might get a question as to where we should place the limit function , should it be before or after the map function
        // well the answer is - 'It really doesn't matter'
        // Lets discuss about this in the further lessons.
    }
}
