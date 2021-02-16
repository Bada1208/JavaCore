package com.sysoiev_bogdan.javacore.algorithms.linear_search;

import java.util.Arrays;

public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] arr = {22, 33, 11, 21, 311, 2, 2828, 67, 0};
        Arrays.sort(arr);
        System.out.println("After sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nlinear search");
        System.out.println(linearSearch(arr, 22));

    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return array[i];
            }
        }
        return -1;
    }

}
