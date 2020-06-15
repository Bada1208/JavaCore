package com.sysoiev_bogdan.javacore.chapter18.collections.iterator;

import java.util.ArrayList;

public class ForeachClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(121);
        list.add(1);
        list.add(12);
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        int sum = 0;
        for (Integer in : list) {
            sum += in;
        }
        System.out.println("\nSum : " + sum);
    }
}
