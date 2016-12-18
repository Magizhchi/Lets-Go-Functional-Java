package com.kdhandap;

import java.io.File;
import java.util.stream.Stream;

public class J_Primitive_Array {
    /*
    In this Example we will be seeing how create a stream out of primitive arrays and convert them to a functional Style
    For this we will be using the of() method in Stream
     */
    public static void main(String[] args) {
        File file = new File("/Users/karthikk");

        File[] children = file.listFiles();

        // The null check here is a necessary evil.
        if (children != null){
            Stream.of(children)
                    .forEach(System.out::println);
        }

        // However we can also create streams out of a single Value or argument
        // This might seem a bit unintuitive at First but refer to the next Lesson to understand a scenario where this might be useful.
        Stream.of(5)
              .forEach(System.out::println);
    }
}
