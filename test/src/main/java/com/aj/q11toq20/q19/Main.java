package com.aj.q11toq20.q19;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Ques 19: Write a stream program to move all zero’s to the beginning of array
        //int[] arr = {5,0,1,0,8,0}
        //Expected O/P {0,0,0,5,1,8}
        int[] intArray = {5, 0, 1, 0, 8, 0};
        List<Integer> integerList = Arrays.stream(intArray).boxed().toList();
        Map<Boolean, List<Integer>> partitionMap = integerList.stream()
                .collect(Collectors.partitioningBy(x -> x != 0));
        Collection<List<Integer>> values = partitionMap.values();
        List<Integer> finalList = values.stream().flatMap(Collection::stream).toList();
        System.out.println(finalList);

    }
}
