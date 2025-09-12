package com.aj.q11toq20.q11;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Ques 11:Given a string, find the first non-repeated character
        String str = "Hello World";
        //Expected O/P : H
        Arrays.stream(str.split(""))
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .findFirst().ifPresent(System.out::println);
        System.out.println("Another way");
        Arrays.stream(str.split("")).distinct().findFirst().ifPresent(System.out::println);
        System.out.println("Yet Another way");
        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst().ifPresent(stringLongEntry -> System.out.println(stringLongEntry.getKey()));
    }
}