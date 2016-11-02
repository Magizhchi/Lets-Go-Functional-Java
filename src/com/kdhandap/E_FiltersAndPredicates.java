package com.kdhandap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;

public class E_FiltersAndPredicates {
    /*
    Filters Provide an Excellent way to select data similar to an if case
    We will look into filters and more in this example
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Using Filters to filter elements which are multiples of 3");
        System.out.println("---------");
        numbers.stream()
                .filter(e -> isMultipleof3(e))
                .forEach(System.out::println);

        // Now the above functions works good if we want multiples of 3 but what if we wanted the inverse of this function
        // To handle such instances we can introduce a predicate which can easily be negated

        Predicate<Integer> predicate = E_FiltersAndPredicates::isMultipleof3;

        System.out.println("Using predicates in place of lambda functions in filters");
        System.out.println("---------");
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);

        // Now we can get the inverse of the above function in multiple ways, lets discuss them for a while
        // We can simple call predicate.negate() method but that makes it a bit verbose and non-functional
        // To do better we can go ahead and create a generic not function that will negate the predicate for us, here we will do the same using the not function

        System.out.println("Using a generic not function we create to negate any given predicate");
        System.out.println("---------");
        numbers.stream()
                .filter(not(predicate))
                .forEach(System.out::println);

        // Great now thats really nice, but what if we wanted to split the list based on a given criteria
        // For Eg, Get a list of numbers divisible by 3 AND numbers not divisible by 3

        System.out.println("Partitioning using partitioningBy()");
        System.out.println("-----------");
        System.out.println(numbers.stream()
                                  .collect(partitioningBy(predicate)));

        System.out.println("\n\ngetting the numbers divisible by 3 using partitioningBy and get");
        System.out.println("------------");
        numbers.stream()
                .collect(partitioningBy(predicate))
                .get(true)
                .stream()
                .forEach(System.out::println);






        }

    private static <T> Predicate<T> not(Predicate<T> predicate) {
        return predicate.negate();
    }


    private static boolean isMultipleof3(int number) {
        return number % 3 == 0;
    }
}
