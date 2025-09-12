package com.aj.q21toq30.q28;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Ques 28: Remove all non-numeric characters from a list
        List<String> stringList = Arrays.asList("a1b2c3","1a2b3c","123abc");
        // O/P [123,123,123]

        /*String string = "a1b2c3";
        String collect =
                Arrays.stream(string.split("")).filter(str -> str.matches("[^a-zA-Z]")).collect(Collectors.joining());
        System.out.println(collect);*/


        List<String> stringList1 =
                stringList.stream()
                        .map(str -> Arrays.stream(str.split(""))
                                .filter(ch -> ch.matches("[^a-zA-Z]"))
                                .collect(Collectors.joining()))
                        .toList();
        System.out.println(stringList1);

        System.out.println("Another way");

        Pattern pattern = Pattern.compile("[^0-9]");
        List<String> stringList2 = stringList.stream()
                .map(str -> pattern.matcher(str).replaceAll(""))
                .toList();
        System.out.println(stringList2);
    }
}
