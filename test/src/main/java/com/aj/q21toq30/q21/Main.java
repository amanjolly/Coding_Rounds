package com.aj.q21toq30.q21;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Ques 21: Given the string array group the strings based on the middle character
        // I/P String[] strArray ={"ewe", "jji", "jhj", "kwk", "aha"}
        // O/P {w=["ewe", "kwk"], h=["jhj", "aha"], j=["jji"]
        String[] strArray ={"ewjc", "jji", "jhj", "kwk", "aha"};

        Map<Character, List<String>> characterListMap = Arrays.stream(strArray)
                .collect(Collectors.groupingBy(str -> str.charAt(str.length() / 2)));
        System.out.println(characterListMap);
    }
}
