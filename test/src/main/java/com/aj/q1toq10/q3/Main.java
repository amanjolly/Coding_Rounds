package com.aj.q1toq10.q3;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //Ques3: Find the word that has the second (Nth) highest length in the given string?
        String inpuString= "I am learninG learning Stream APIs";

        Arrays.stream(inpuString.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(0)
                .findFirst()
                .ifPresent(System.out::println);

    }
}
