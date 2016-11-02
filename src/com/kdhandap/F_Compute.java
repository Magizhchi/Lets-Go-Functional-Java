package com.kdhandap;

import java.util.HashMap;
import java.util.Map;

public class F_Compute {
    /*In this example lets look into the compute feature. Often we might want to perform simple operations on the set like incrementing the value
    or setting it to a specific value for this purpose we can use the compute, computeIfAbsent, computeIfPresent functions in Java8
     In this example we have a simple function that will increment the value of a given set by 1
     */
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Batman", 11);
        scores.put("Superman", 8);

        incrementScores(scores, "Batman");
        System.out.println(scores);
    }

    private static void incrementScores(Map<String, Integer> scores, String name) {
//        This would be the iterative way to increment the scores
//        int currentScore = scores.get(name);
//        scores.put(name, currentScore+1);

//        Here I introduce the concept of BiFunction, A Bifunction is one which takes in two input variables so we take in two values here
//        So here we take in two values (key, value) -> and increment the value by one
//        Note for the below problem the variable 'theName' doesn't really matter.

        scores.compute(name, (theName, score)-> score+1);


//        Caveat - This function will throw an exception if the key doesn't previously exist fo this purpose we can use the below two functions
//        scores.computeIfPresent(name, (theName, score) -> score + 1);
//        scores.computeIfAbsent(name, score -> 1);
    }
}
