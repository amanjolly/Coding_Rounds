package com.aj.java.codingExercises.arrayLists.practice;

import java.util.*;
import java.util.stream.IntStream;

public class Ques2 {
    public static void main(String[] args) {
        // Given an ArrayList<Integer>, find the indices of the maximum and minimum elements.
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(4, 2, 9, 5, 12, 1));
        System.out.println(Arrays.toString(findMinMaxIndex(integerArrayList)));
        System.out.println(Arrays.toString(findMinMaxIndexUsingParallelStreams(integerArrayList)));

    }

    private static int[] findMinMaxIndex(ArrayList<Integer> integerArrayList) {
        int[] minMaxIndex = new int[]{-1, -1};
        if (Objects.isNull(integerArrayList) || integerArrayList.isEmpty()) {
            return minMaxIndex;
        }
        int maxInt = integerArrayList.get(0);
        int minInt = integerArrayList.get(0);
        int maxIndex = 0;
        int minIndex = 0;

        for (int currentInt : integerArrayList) { // We can also use simple for loop and start processing from 2nd index
            if (currentInt >= maxInt) {
                maxInt = currentInt;
                minMaxIndex[0] = integerArrayList.indexOf(maxInt);
            }
            if (currentInt <= minInt) {
                minInt = currentInt;
                minMaxIndex[1] = integerArrayList.indexOf(minInt);
            }
        }
        System.out.printf("MaxInt is %d at index %d \n", maxInt, minMaxIndex[0]);
        System.out.printf("MinInt is %d at index %d \n", minInt, minMaxIndex[1]);
        return minMaxIndex;
    }

    private static int[] findMinMaxIndexUsingParallelStreams(List<Integer> integerList) {
        int[] minMaxIndex = new int[]{-1, -1};
        // Handle an empty or single-element list
        if (integerList == null || integerList.isEmpty()) {
            return minMaxIndex; // Or throw an exception
        }
        Optional<Integer> minIntegerIndex =
                IntStream.range(0, integerList.size()).parallel().boxed().max(Comparator.comparingInt(integerList::get));
        minIntegerIndex.ifPresent(integer -> minMaxIndex[0] = integer);
        Optional<Integer> maxIntegerIndex =
                IntStream.range(0, integerList.size()).parallel().boxed().min(Comparator.comparingInt(integerList::get));
        maxIntegerIndex.ifPresent(integer -> minMaxIndex[1] = integer);
        return minMaxIndex;
    }
}
