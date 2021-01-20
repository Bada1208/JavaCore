package com.sysoiev_bogdan.javacore.functional_programming.functional_interfaces;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(increment(0));
        int increment = incrementByOneFunction.apply(0);
        System.out.println(increment);
        int multiply = multiplyBy10Function.apply(increment);
        System.out.println(multiply);
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(2));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int increment(int number) {
        return ++number;
    }
}
