package com.sysoiev_bogdan.javacore.generics;

import java.util.ArrayList;
import java.util.List;

public class _ClassCastException {
    public static void main(String[] args) {
       /* List numbers = new ArrayList();
        numbers.add(1);
        numbers.add("2");
        for (Object number : numbers) {
            System.out.println((String)number);//ClassCastException
        }*/
       /* Comparable comparable = 10;
        comparable.compareTo("10");*/
        Comparable<Integer> comparable = 10;
        System.out.println(comparable.compareTo(10));
    }
}
