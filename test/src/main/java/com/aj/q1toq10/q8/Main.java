package com.aj.q1toq10.q8;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Ques 8: Given a word, find the occurrence (frequency) of each character

        String input = "Mississippi";

       input.chars()
               .mapToObj(c -> (char)c)
               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().forEach(System.out::println);
    }
}
