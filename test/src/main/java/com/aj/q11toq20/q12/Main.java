package com.aj.q11toq20.q12;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Ques: 12 Given a string find the first repeated character
        String str = "My Name is Aman";
        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1).skip(1)
                .findFirst()
                .ifPresent(e -> System.out.println(e.getKey()));
    }
}
