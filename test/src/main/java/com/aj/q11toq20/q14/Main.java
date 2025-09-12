package com.aj.q11toq20.q14;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Ques 14: Given a list of strings, create a list that contains only integers
        String[] strArr = {"abc", "123", "456", "xzy"};
        //Expected Output: {123, 456}
                    List<String> integerList = Arrays.stream(strArr).filter(str -> str.matches("[0-9]+"))
                            .toList();
        System.out.println(integerList);
    }
}
