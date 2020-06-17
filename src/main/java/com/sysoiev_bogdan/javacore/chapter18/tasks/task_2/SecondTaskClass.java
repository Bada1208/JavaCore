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
public class SecondTaskClass {
    static void checkDublicates(int array[]) {
        boolean isDublicate = false;
        int result = 1;
        int element = 0;
        Arrays.sort(array);
        System.out.println("Array: " + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                result++;
                isDublicate = true;
                element = array[i];
            }
        }
        if (isDublicate == true) {
            System.out.println("Result: " + isDublicate);
            System.out.println("Число " + element + " повторяется " + result + " раза");
        } else {
            isDublicate = false;
            System.out.println("Result: " + isDublicate);
            System.out.println("Дубликатов нет");
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 333, 5, 67, 9, 9, 9, 9, 9};
        checkDublicates(arr);
    }
}
