package com.sysoiev_bogdan.javacore.algorithms.binary_search;

import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {22, 33, 21, 311, 2, 2828, 67, 0};
        Arrays.sort(arr);
        System.out.println("After sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nbinary search");
        binarySearch(arr, 311);

    }

    private static void binarySearch(int[] array, int value) {
        int first = array[0];
        int last = array.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (array[mid] < value) {
                first = mid + 1;
            } else if (array[mid] == value) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }
}
