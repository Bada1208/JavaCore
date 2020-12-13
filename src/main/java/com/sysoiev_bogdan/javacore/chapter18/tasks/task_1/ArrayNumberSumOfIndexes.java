package com.sysoiev_bogdan.javacore.chapter18.tasks.task_1;

import java.util.HashSet;
import java.util.Set;

/**
 * Задание 1
 * <p>
 * Дан массив целых чисел. Необходимо реализовать метод, который возвращает индексы массива,
 * значения которых в сумме дают число переданное в массив.
 * <p>
 * Предполагается, что массив содержит только уникальные числа и всегда имеет искомые числа.
 * Один и тот же элемент не может быть использован дважды.
 * <p>
 * array = [3, 8, 15, 17], Number = 23
 * result = [1,2]
 * <p>
 * Т.е. индексы 1 и 2 (значение 8 и 15) в сумме дают искомое число 23
 */
public class ArrayNumberSumOfIndexes {
    static Set<Integer> indexSum(int array[], int indexSum) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] + array[j] == indexSum) {
                    set.add(i);
                    set.add(j);
                }

            }
        }
        return set;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8};
        System.out.println(indexSum(arr, 13));
    }
}
