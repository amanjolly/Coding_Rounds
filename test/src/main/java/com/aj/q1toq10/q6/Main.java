package com.aj.q1toq10.q6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Ques 6: Given a sentence, find the words with a specified number of vowels say 2 vowels?
        String inputString1 = "I am learning Java Streams API";

        Arrays.stream(inputString1.split(" "))
                .filter(str -> str.replaceAll("[^aeiouAEIOU]", "").length() == 2)
                .forEach(System.out::println);
    }
}
