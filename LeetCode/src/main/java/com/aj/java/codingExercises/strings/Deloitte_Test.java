package com.aj.java.codingExercises.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deloitte_Test {
    public static void main(String[] args) {
        // ["Test","XYZ","Hello","Java","India"]
        // Extract first Vowel from each string and create a new string

        List<String> inputStringList = Arrays.asList("Test", "XYZ", "Hello", "Java", "India");

        // Data -> stream of words -> stream of char -> filter vowels -> collect


        // str ="abcemloq";
        // Extract vowels and form a string
        // Data -> stream of char -> filter vowels -> collect
        String inputString ="abcemloq";
       // inputString.chars().mapToObj(ch -> (char)ch).filter(ch -> ch == ;

        Pattern pattern = Pattern.compile("[AEIOUaeiou]");
        Matcher matcher = pattern.matcher(inputString);
        System.out.println(matcher.group());

        // s="abcdpqrbdpar"
        // output = b

        String input = "abcdpqrbdpar";
        HashSet<String> visitedChar = new HashSet<String>();
        //input.
    }

    private static Optional<Character> extractVowelFromWord(String word) {
        for (char ch : word.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                return Optional.of(ch);
            }
        }
        return Optional.empty();
    }
}
