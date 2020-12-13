package com.sysoiev_bogdan.javacore.chapter18.tasks.task_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
    static boolean checkDuplicates(Integer array[]) {
        Set<Integer> hashset = new HashSet<>(Arrays.asList(array));
        return hashset.size() < array.length ? true : false;

    }

    public static void main(String[] args) {
        Integer[] arr = {2, 333, 5, 56, 67, 9};
        System.out.println(checkDuplicates(arr));
    }
}
