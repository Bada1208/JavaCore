package com.sysoiev_bogdan.javacore.algorithms.insertion_sort;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] arr = {22, 33, 11, 311, 2, 2828, 67, 0};
        System.out.println("Before sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("After sorting:");
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while ((j > -1) && (array[j] > key)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
