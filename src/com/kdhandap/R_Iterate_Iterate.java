package com.kdhandap;

import java.util.stream.Stream;

/**
 * Created by karth on 2/4/2017.
 */
public class R_Iterate_Iterate {
    /*In the previous lesson on Generate method we explored how to create the fibonacci series.
    In this lesson let us see how we could achieve the same using The iterate method
    We will be cleverly using map and reduce to achieve the same
     */

    public static void main(String[] args) {
        int position = 7;

        // Here you notice that we are not maintaining any mutable states,
        // We are mapping each element to a {1,1} array and applying a reduce operation on it
        System.out.println(Stream.iterate(0, e-> e+1)
                                .limit(position)
                                .map(e -> new int[] {1,1})
                                .reduce(new int[] {1,0}, R_Iterate_Iterate::next)[1]);
    }

    private static int[] next(int[] series, int[] ignore) {
        return new int[] {series[1], series[0]+series[1]};
    }
}
