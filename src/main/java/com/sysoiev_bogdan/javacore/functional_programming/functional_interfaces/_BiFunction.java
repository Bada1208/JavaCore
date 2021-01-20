package com.sysoiev_bogdan.javacore.functional_programming.functional_interfaces;

import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String[] args) {
        System.out.println(incrementBy1AndMultiply(2, 10));
        System.out.println(incrementBy1AndMultiplyBiFunction.apply(2, 5));
    }

    static BiFunction<Integer, Integer, Integer> incrementBy1AndMultiplyBiFunction =
            (numToIncrementByOne, numToMultiply) -> (numToIncrementByOne + 1) * numToMultiply;

    static int incrementBy1AndMultiply(int number, int numToMultiply) {
        return (number + 1) * numToMultiply;
    }
}
