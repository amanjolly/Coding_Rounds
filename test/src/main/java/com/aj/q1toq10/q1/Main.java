package com.aj.q1toq10.q1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //Ques 1: Given a sentence, find the word that has the highest length
        String input= "I am learnink learning Stream APIs";
        String[] strings = input.split(" ");
        Arrays.stream(strings)
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);

        System.out.println("Another Way");

        Arrays.stream(strings)
                .max(Comparator.comparing(String::length))
                .ifPresentOrElse(System.out::println,()-> System.out.println("Value not present"));
    }
}
