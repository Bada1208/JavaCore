package com.sysoiev_bogdan.javacore.chapter18.tasks.task_2;

import java.util.Arrays;

/**
 * Задание 2
 * Дан массив целых чисел.
 * Необходимо реализовать метод, которые определяет, содержит ли данный массив дубликаты
 * <p>
 * Пример:
 * Array: [4,5,6,6,8]
 * Result: true
 * Число 6 повторяется 2 раза
 * <p>
 * Array: [4,5,6,7,8]
 * Result: false
 * Дубликатов нет
 */

public class HasArrayDuplicatesClass {
    static boolean checkDuplicates(int array[]) {
        boolean isDuplicate = false;
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) return isDuplicate = true;
        }
        return isDuplicate;
    }

    public static void main(String[] args) {
        int[] arr = {2, 333, 67, 5, 56, 67, 9};
        System.out.println(checkDuplicates(arr));
    }
}
