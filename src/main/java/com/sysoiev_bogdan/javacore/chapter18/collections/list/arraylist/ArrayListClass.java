package com.sysoiev_bogdan.javacore.chapter18.collections.list.arraylist;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        System.out.println("Beginner size stringArrayList : " + stringArrayList.size());
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("E");
        stringArrayList.add(1, "F");
        System.out.println("Size after adding new elements :" + stringArrayList.size());
        stringArrayList.remove("E");
        stringArrayList.remove(0);
        System.out.println("Size after removing elements : " + stringArrayList.size());
        System.out.println("stringArrayList content : " + stringArrayList);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        System.out.println("integerArrayList content : " + integerArrayList);
        Integer[] integerArray = new Integer[integerArrayList.size()];
        integerArray = integerArrayList.toArray(integerArray);

        int sum = 0;
        for (Integer i : integerArray) {
            sum += i;
        }
        System.out.println("Sum : " + sum);
    }
}
