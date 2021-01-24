package com.sysoiev_bogdan.javacore.generics;

public class _BoundedTypeParameter {
    public static void main(String[] args) {
        Integer[] numbers = {1254, 34, 23, 54, 66};
        System.out.println(countGreaterThan(numbers, 100));
        Double[] numbers1 = {1254.45, 34.3, 3.0, 4.0, 6.6};
        System.out.println(countGreaterThan(numbers1, 100.0));
    }

    interface A {
    }

    interface B {
    }
/**
 * <T extends Comparable<T> & A & B>
 * always use extends, no matter class or interface;
 * class always goes first, than interfaces;
 * cannot extend multiple classes;
 **/
    static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number) {
        int count = 0;
        for (T num : numbers) {
            if (num.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }
}
