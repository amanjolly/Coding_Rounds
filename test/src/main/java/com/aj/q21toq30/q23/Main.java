package com.aj.q21toq30.q23;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Ques 23: Sort a list of strings in alphabetical order
        List<String> strList = List.of("Zudio", "Puma", "Addidas", "MAC", "H&M");
        //Expected O/P [Addidas, H&M, MAC, Puma, Zudio]

        List<String> sortedList = strList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
