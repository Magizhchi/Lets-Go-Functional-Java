package com.kdhandap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class G_Merge {

    /* In this example we will look at merge function which is a much nicer way to perform the computeIfAbsent and computeIfPresent together into one function
    We will take the same example as the previous one but will add a new Hero 'Hulk' to it at runtime.
     */
    private static Map<String, Integer> scores = new HashMap<>();

    public static void main(String[] args) {
        scores.put("Batman", 8);
        scores.put("Superman", 11);

        Arrays.asList("Batman", "Superman", "Hulk")
                .stream()
                .forEach(G_Merge::incrementScore);

        System.out.println(scores);
    }

    private static void incrementScore(String name) {
//        merge(key, defaultValue, (value, defaultValue)-> {});
//        If key doesn't exist a new entry is created with the key and defaultValue
//        If key exists then the bifunction at the end will get executed
        scores.merge(name, 1, (oldValue, defaultValue) -> oldValue + defaultValue);

//        Note: In the above function the second argument will get mapped to the to the second argument of the bifunction
    }
}
