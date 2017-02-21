package com.kdhandap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by karth on 2/21/2017.
 */
public class V_StreamConcat {
    /* So far we have seen operation performed on a single stream, but what if we wanted to combine multiple streams into one.
    ArrayList in Java provides a nice way to do this using addAll(). But it is mutable and will change the exiting arrayList also it does not work on Lists created using Arrays.asList()
    So now lets look at a simple addAll using arrayList and then a Stream Concat.
     */
    public static void main(String[] args) {
//        List<String> marvel = Arrays.asList("IronMan", "Black Widow", "Hulk", "Thor");
//        List<String> dcComics = Arrays.asList("SuperMan", "Batman", "Flash", "Wonder Woman", "Green Arrow");
//
//        System.out.println(marvel.addAll(dcComics)); // This throws an Unsupported operation Exception as Arrays.asList creates a List backed by an UnModifiable array

        List<String> marvel = new ArrayList<String>(Arrays.asList("IronMan", "Black Widow", "Hulk", "Thor"));
        List<String> dcComics = new ArrayList<String>(Arrays.asList("SuperMan", "Batman", "Flash", "Wonder Woman", "Green Arrow"));

//        marvel.addAll(dcComics);
//        System.out.println(marvel); // The Marvel object has Mutated and changed in the operation.

        // The Below Stream Method does not mutate the marvel object
        System.out.println(Stream.concat(marvel.stream(), dcComics.stream())
                                 .collect(toList()));

    }

}
