package com.aj.java.codingExercises.strings;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zensar_Test {
    // Given a word find duplicate characters.
    // I/P amanjolly
    // O/P a,l
    public static void main(String[] args) {
        // Pseudo Code
        // String -> characters -> stream -> frequency map -> filter frequencies = 2
        String inputString = "amanjolly";
        Stream<Character> outputCharacters = inputString.chars().mapToObj(ch -> (char) ch);
        Map<Character, Long> characterMap = outputCharacters.collect(Collectors.groupingBy(ch -> ch,
                Collectors.counting()));
        System.out.println(characterMap);
        List<Character> duplicateEntries = characterMap.entrySet().stream().filter(e -> e.getValue() == 2).map(Map.Entry::getKey).toList();
        System.out.println(duplicateEntries);
    }
}
