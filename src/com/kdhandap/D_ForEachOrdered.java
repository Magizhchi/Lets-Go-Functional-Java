package com.kdhandap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class D_ForEachOrdered {
    /*
    * Now lets Expore the forEach Ordered Function and parallel Streams*/
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1,10,3,5,8,11);

        System.out.println("forEach and forEachOrdered work in the same way for a List<Objects>");
        iterateForEach(numbersList.stream());
        iterateForEachOrdered(numbersList.stream());

        System.out.println("A Set<Objects> does not impose any order hence the output we recieve will not be in the particular order we gave as input");
        System.out.println("Even here forEach and forEachOrdered behaves the same, as for each is only printing the order in which it receives the numbers and A Set inherently doesn't have any order");

        Set<Integer> numbersSet = new HashSet<>(numbersList);

        iterateForEach(numbersSet.stream());
        iterateForEachOrdered(numbersSet.stream());

        System.out.println("So what would forEachOrdered be useful for");
        System.out.println("With Java8 streams have concurrency built into it in the form of Parallel Streams, A forEachOrdered can be used here to preserve the initial ordering if required");

        iterateForEach(numbersList.parallelStream());
        iterateForEachOrdered(numbersList.parallelStream());

        System.out.println("Note: the forEach section above will return different outputs each Time as the processing is done concurrently");
        System.out.println(" In the forEachOrdered section the processing is forced to be sequential");
    }

    private static void iterateForEachOrdered(Stream<Integer> numbers) {
        System.out.println("----- For Each Ordered------");
        numbers.forEachOrdered(System.out::println);
    }

    private static void iterateForEach(Stream<Integer> numbers) {
        System.out.println("----- For Each------");
        numbers.forEach(System.out::println);
    }
}
