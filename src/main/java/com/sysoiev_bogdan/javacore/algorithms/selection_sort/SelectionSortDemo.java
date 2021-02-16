package com.sysoiev_bogdan.javacore.algorithms.selection_sort;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] arr = {22, 33, 11, 3, 2, 45, 67, 0};
        System.out.println("Before sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("After sorting:");
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void selectionSort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
