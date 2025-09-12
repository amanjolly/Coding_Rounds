package com.aj.q21toq30.q29;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Ques 29: Find and print strings containing only digits.
        List<String> stringList = Arrays.asList("123","123abc","abc","45");
        // O/P [123,45]

        List<String> integerList = stringList.stream()
                .filter(str -> str.matches("[0-9]+"))
                .toList();
        System.out.println(integerList);
    }
}
