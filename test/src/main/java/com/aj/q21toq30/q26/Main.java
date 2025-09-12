package com.aj.q21toq30.q26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    //Ques 26: Find the union of two lists of integers
        List<Integer> integerList1 = Arrays.asList(1,2,3,4,5);
        List<Integer> integerList2 = Arrays.asList(6,7,8,9,10);
        // O/P [1,2,3,4,5,6,7,8,9,10]
        List<Integer> concatList = Stream.concat(integerList1.stream(), integerList2.stream()).toList();
        System.out.println(concatList);
    }
}
