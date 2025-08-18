package com.aj.java.codingExercises.arrayLists.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ques1 {
    public static void main(String[] args) {
        //Remove elements greater then the given value
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30, 35));
        int x = 20;
        removeElementsGreaterThen(x,arrayList);
        System.out.println(arrayList);
    }

    private static void removeElementsGreaterThen(int x, ArrayList<Integer> arrayList) {
        arrayList.removeIf(integer -> integer > x);
    }
}
