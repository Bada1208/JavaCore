package com.sysoiev_bogdan.javacore.chapter18.collections.class_arrays;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = -5 * i;
        }
        display(arr);
        Arrays.sort(arr);
        System.out.println("sorted array : ");
        display(arr);
        System.out.println("fill array & display it : ");
        Arrays.fill(arr, 4, 8, 100);
        display(arr);
        System.out.println("sorted array : ");
        Arrays.sort(arr);
        display(arr);
        System.out.println("binary search result : " + Arrays.binarySearch(arr, 0));
    }

    static void display(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
