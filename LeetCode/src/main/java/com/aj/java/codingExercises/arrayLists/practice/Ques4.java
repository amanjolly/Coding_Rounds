package com.aj.java.codingExercises.arrayLists.practice;

import java.util.*;
import java.util.stream.Collectors;

public class Ques4 {
    public static void main(String[] args) {
        // Ques Given an ArrayList<Integer>, remove all duplicate elements, and ensure that the list remains in the original order.

        //Example:
        //Input: [1, 2, 3, 2, 4, 1, 5]
        //Output: [1, 2, 3, 4, 5]
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5));
        List<Integer> arrayListWithoutDuplicates =
                arrayList.stream().distinct().collect(Collectors.toList());
        System.out.println(arrayListWithoutDuplicates);
        arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5));
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(arrayList);
        System.out.println(linkedHashSet);
        arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5));
        removeDuplicates(arrayList);
        System.out.println(arrayList);
        arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5));
        removerDuplicatesOptimized(arrayList);
        System.out.println(arrayList);
    }

    private static void removeDuplicates(ArrayList<Integer> arrayList) {

        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (Integer num : arrayList) {
            if (!seen.contains(num)) {
                seen.add(num);
                uniqueList.add(num);
            }
        }

        // Clear the original list and add the unique elements back
        arrayList.clear();
        arrayList.addAll(uniqueList);
    }

    private static void removerDuplicatesOptimized(ArrayList<Integer> arrayList) {

        HashSet<Integer> seen = new HashSet<>();

        // Iterate through the list from the beginning
        for (int i = 0; i < arrayList.size(); i++) {
            // If the element is already in the HashSet, remove it
            if (!seen.add(arrayList.get(i))) {
                arrayList.remove(i);
                i--;  // Adjust index after removal
            }
        }
    }
}
