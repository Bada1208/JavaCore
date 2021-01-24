package com.sysoiev_bogdan.javacore.generics;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class _UpperBoundedWildCards {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(1.0, 2.0);
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Number> list2 = Arrays.asList(1, 2.0);
        print(list);
        print(list1);
        print(list2);
    }

    //? unbounded wildcard
    //<? extends Number> means all classes under the Number class
    static void print(List<? extends Number> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}
