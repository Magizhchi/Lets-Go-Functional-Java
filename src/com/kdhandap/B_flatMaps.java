package com.kdhandap;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/*
A Stream is a collection of Objects, It can be mapped to another object type using the .map function
Lets say that the map function converts the given object to a list of objects.
Now we end up with a stream of list<T>

We can easily remove this hierarchy and end up with just a stream of objects <T> a using a flatmap in place of a map

 */
public class B_flatMaps {
    public static void main(String[] args) {
        List<Company> companies = Arrays.asList(
                new Company("sam", "alpha@sam.com"),
                new Company("foxtrot", "romeo@foxtrot.com, panda@foxtrot.com"),
                new Company("charlie", "charlie@echo.com, delta@echo.com")
        );
        List<List<String>> companiesEmail = companies.stream()
                                                     .map(e -> e.getContactEmails())
                                                     .collect(toList());
        System.out.println(".map() -> "+ companiesEmail);

        System.out.println("------------------------------");

        List<String> contactEmails =  companies.stream()
                                             .flatMap(e -> e.getContactEmails().stream())
                                             .collect(toList());
        System.out.println(".flatMap() -> "+ contactEmails);
    }
}

class Company {
    private String name;
    private List<String> contactEmails;

    public Company(String theName, String emails){
        name = theName;
        contactEmails = Arrays.asList(emails);
    }

    public List<String> getContactEmails() {
        return contactEmails;
    }
}
