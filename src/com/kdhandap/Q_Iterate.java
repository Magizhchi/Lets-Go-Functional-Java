package com.kdhandap;

import java.util.stream.Stream;

/**
 * Created by karth on 2/1/2017.
 */
// //Using the Generate Method
//class Generator{
//    private int next;
//
//    public Generator(int start){
//        next = start;
//    }
//
//    public int nextValue(){
//        return next++;
//    }
//}
public class Q_Iterate {
    /* Lets say we wanted to create a sequence of numbers starting with 15 like 15, 16, 17, 18,......
    We can do this using the generate function and a custom class like how we saw in the previous lesson but we surely can do better cant we.
     In this lesson we will compare both the ways of doing this. the commented portion of code will correspond to the generate Method and the other will correspond to the iterate method
     */
    public static void main(String[] args) {
//        //Using the Generate method
//        Generator generator = new Generator(15);
//        Stream.generate(generator::nextValue)
//              .limit(10)
//              .forEach(System.out::println);

        // The Iterate Function Takes in two Values, the first is the starting value and the next is the function that should be applied to the next value
        Stream.iterate(15, e -> e+1)
              .limit(10)
              .forEach(System.out::println);

    }
}
