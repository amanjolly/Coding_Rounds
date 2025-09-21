package com.aj.java.codingExercises.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Deloitte_Test {
    public static void main(String[] args) {
        // ["Test","XYZ","Hello","Java","India"]
        // Extract first Vowel from each string and create a new string

        List<String> inputStringList = Arrays.asList("Test", "XYZ", "Hello", "Java", "India");

        // Data -> stream of words -> stream of char -> filter vowels -> collect


        // str ="abcemloq";
        // Extract vowels and form a string
        // Data -> stream of char -> filter vowels -> collect
        String inputString = "abcemloq";
        String collectedVowels = inputString.chars().mapToObj(ch -> (char) ch)
                .map(String::valueOf)
                .map(Deloitte_Test::extractVowelFromWord)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.joining());
        System.out.println(collectedVowels);


        String input = "abcdpqrbdpar";
        HashSet<String> visitedChar = new HashSet<>();
        //input.
    }

    private static Optional<String> extractVowelFromWord(String word) {
        for (char ch : word.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                return Optional.of(String.valueOf(ch));
            }
        }
        return Optional.empty();
    }
}
