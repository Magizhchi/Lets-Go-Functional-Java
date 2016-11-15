package com.kdhandap;

import java.util.HashMap;
import java.util.Map;

public class I_Iterating_Over_Maps {
    private static Map<String,Integer> scores = new HashMap<>();
    /* A Map is a collection of <Key,Value> pairs, which gives us 3 different ways to iterate over them
    *   1) Iterating over Keys
    *   2) Iterating over Values
    *   3) Iterating over Keys,Values
    * */
    public static void main(String[] args) {
        scores.put("Batman", 8);
        scores.put("SuperMan", 4);
        scores.put("Hulk", 10);
        scores.put("AntMan", -1);

//        Imperative Style's
//        for (String name : scores.keySet()) {
//            System.out.println(name);
//        }
//
//        for (int value : scores.values()) {
//            System.out.println(value);
//        }
//
//        for (String name: scores.keySet()) {
//            System.out.println(name + "----" + scores.get(name));
//        }

//        Functional Style

        scores.keySet()
              .forEach(System.out::println);

        scores.values()
              .forEach(System.out::println);

        scores.forEach((name, score) -> System.out.println(name + "----" + score));

    }
}
