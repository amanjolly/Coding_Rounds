package com.aj.q21toq30.q30;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Ques 30 Convert a list of strings to uppercase
        List<String> stringList = Arrays.asList("breaking bad", "game of thrones", "big bang " +
                "theory");
        // O/P [BREAKING BAD, GAME OF THRONES, BIG BANG THEORY]
        List<String> upperCaseStrings = stringList.stream().map(String::toUpperCase).toList();
        System.out.println(upperCaseStrings);
    }
}
