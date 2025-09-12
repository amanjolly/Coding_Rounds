package com.aj.q21toq30.q27;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Ques 27: Find the kth smallest element in a list of integers.
        List<Integer> integerList = Arrays.asList(7,1,6,2,1,3,4,5);
        //O/P for K=3 -> [2]
        int k = 3;
        Integer ans = integerList.stream().sorted().toList().get(k-1);
        System.out.println(ans);

        System.out.println("Another Way");

        integerList.stream().sorted().skip(k-1).findFirst().ifPresent(System.out::println);
    }
}
