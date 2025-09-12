package com.aj.q1toq10.q4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //Ques4: Find the length of the second (Nth) highest length word in the given sentence
        String inputString = "I am learninG learning Stream APIs";
        Arrays.stream(inputString.split(" "))
                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
