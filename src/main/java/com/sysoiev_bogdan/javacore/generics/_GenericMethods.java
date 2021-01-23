package com.sysoiev_bogdan.javacore.generics;

public class _GenericMethods {
    public static void main(String[] args) {
        String[] names = {"Ali", "Valia"};
        Integer[] nums = {23, 56};
        print(names);
        print(nums);
    }

    static <T> void print(T[] array) {
        for (T s : array) {
            System.out.println(s.getClass().getName() + "->" + s);
        }
    }
}
