package com.aj.q11toq20.q16;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Ques 16: Group /Pair anagrams from a list of Strings, For 1 word consider only one
        // anagram?
        List<String> strings = Arrays.asList("pan", "nap", "Cafe", "face", "meat", "tree", "Team");
        Collection<List<String>> anagramStringList = strings.stream().collect(Collectors.groupingBy(
                x -> Arrays.stream(x.toLowerCase().split("")).sorted()
                        .collect(Collectors.toList()))).values();
        System.out.println(anagramStringList);


        List<String> words = Arrays.asList("listen", "Silent", "Enlist", "rat", "tar", "art",
                "god", "dog");
        // Group words by sorted character key
        Map<String, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(
                        word -> word.toLowerCase().chars()
                                .sorted()
                                .mapToObj(c -> String.valueOf((char) c))
                                .collect(Collectors.joining())
                ));
        System.out.println(grouped);


        // Filter out groups with less than 2 words (not enough to form a pair)
        List<List<String>> anagramPairs = grouped.values().stream()
                .filter(group -> group.size() > 1)
                .flatMap(group -> generatePairs(group).stream())
                .toList();

        // Print pairs
        anagramPairs.forEach(System.out::println);
    }

    // Helper method to generate all unique pairs from a list
    private static List<List<String>> generatePairs(List<String> group) {
        List<List<String>> pairs = new ArrayList<>();
        for (int i = 0; i < group.size(); i++) {
            for (int j = i + 1; j < group.size(); j++) {
                pairs.add(Arrays.asList(group.get(i), group.get(j)));
            }
        }
        return pairs;
    }

}
