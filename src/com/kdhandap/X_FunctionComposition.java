package com.kdhandap;

import java.util.function.Function;

/**
 * Created by karth on 5/15/2017.
 */
public class X_FunctionComposition {
    /*
    In this lesson lets explore how we can do function composition with lambdas. Java 8 gives us two powerful methods andThen() and compose() for chaining together multiple functions.
     */
    public static void main(String[] args) {
        Function<Integer, Integer> inc = number -> number + 1;
        Function<Integer, Integer> doubled = number -> number * 2;

        print(5, "incremented", inc);
        print(5, "doubled", doubled);

        // Now if we want two chain these two commands we could perform the following

        print(5, "incremented and doubled", inc.andThen(doubled));
        // the above function will get executed from left to right.

        print(5, "doubled and incremented", inc.compose(doubled));
        // the above function will get executed from right to left

        /*
        Note : Let take a look at the Function<> object
        It's signature is Function<InputType, OutputType>
        We have to take care while joining functions that the OutputType of the First applied function should match the input type of the second function.
         */

    }

    private static void print(int number, String msg, Function<Integer, Integer> function) {
        System.out.println(number +" "+ msg +" is " + function.apply(number));
    }
}
