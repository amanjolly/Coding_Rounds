package com.aj.q1toq10.q9;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Ques 9: Given an array of integers re-arrange the elements to form highest/lowest possible values
        // Corner case of all zeros is not considered here LeetCode : 179
        int[] intArray = {3, 30, 34, 5, 9};

        String lowestNumber = Arrays.stream(intArray)
                .boxed()
                .map(String::valueOf)
                .sorted((s1, s2) -> (s1 + s2).compareTo(s2 + s1))
                .collect(Collectors.joining());
        System.out.println("Lowest:: " + lowestNumber);

        String highestNumber = Arrays.stream(intArray)
                .boxed()
                .map(String::valueOf)
                .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
                .collect(Collectors.joining());

        System.out.println("\nHighest:: " + highestNumber);
    }
}