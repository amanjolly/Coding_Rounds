package com.aj.java.codingExercises.arrayLists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Publicis_Test {
    public static void main(String[] args) {
        //Ques : You have two arrayLists one has 20 numbers second has indexes
        // you need to remove the values from the first based on the indexes from the second
        ArrayList<Integer> firstArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, null, 5, 6, 7, null, 9, 10));
        ArrayList<Integer> indexArrayList = new ArrayList<>(Arrays.asList(3, 5, 6, 7,9));
        indexArrayList.sort(Comparator.reverseOrder());// ensures that the indices don’t change as you remove elements,
        // which could cause incorrect deletions if the list size decreases before reaching lower indices.
        System.out.println(indexArrayList);
        for (Integer i : indexArrayList) {
                firstArrayList.remove(i);
        }
        System.out.println(firstArrayList);
    }
}