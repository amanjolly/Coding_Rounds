package com.aj.q11toq20.q13;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Ques 13: Given an array of integers, group the numbers by the range
        int[] intArray = {2, 3, 10, 14, 20, 28, 30, 36, 40, 44, 50, 54};
        //Expected O/P : {0=[2,3], 10=[10,14], 20=[20,28], 30=[30,36], 40=[40,44], 50=[50,54]}
        List<Integer> integerList = Arrays.stream(intArray)
                .boxed().toList();
        LinkedHashMap<Integer, List<Integer>> numberMap = integerList.stream()
                .collect(Collectors.groupingBy(x -> x / 10 * 10, LinkedHashMap::new, Collectors.toList()));
        System.out.println(numberMap);
    }
}
