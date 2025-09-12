package com.aj.q1toq10.q5;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Ques5:Given a sentence, find the occurrence of each word
        String inputStr = "I  am learning Streams API in java, JAVA";

        /*String[] strings = inputStr.replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+");
        System.out.println(Arrays.toString(strings));*/
        Map<String, Long> stringOccuranceMap =
                Arrays.stream(inputStr.replaceAll("[^a-zA-Z0-9\\s]", "")//remove punctuation using regex
                                .split("\\s+"))// removing extra space
                        .map(String::toLowerCase)
                        .collect(Collectors.groupingBy(String::valueOf, LinkedHashMap::new, Collectors.counting()));
        System.out.println(stringOccuranceMap);
        System.out.println("Another way");
        Map<String, Long> stringOccuranceMap1 =
                Arrays.stream(inputStr.replaceAll(",","").split("\\s+"))
                        .map(String::toLowerCase)
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(stringOccuranceMap1);
    }
}
