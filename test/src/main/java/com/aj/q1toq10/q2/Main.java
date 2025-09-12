package com.aj.q1toq10.q2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Ques 2: Remove duplicates from the string and return in the same order
        String input1 = " I have duplicate duplicate words";
        String[] strings1 = input1.split(" ");
        Arrays.stream(strings1).distinct().forEach(System.out::println);
        String input2 = "dabcdabefg";
        input2.chars()
                .distinct()
                .mapToObj(value -> String.valueOf((char) value))
                .forEach(System.out::print);

        System.out.println("\nAnother way "+input2);

        input2.chars()
                .distinct()
                .mapToObj(x->(char)x)
                .forEach(System.out::print);

        System.out.println("\nAnother way "+input2);

        String stringwithoutduplicates = input2.chars()
                .distinct()
                .mapToObj(x -> String.valueOf((char) x))
                .collect(Collectors.joining());
        System.out.println(stringwithoutduplicates);
        System.out.println("\nAnother way "+input2);
        Arrays.stream(input2.split("")).distinct().forEach(System.out::print);
    }
}
