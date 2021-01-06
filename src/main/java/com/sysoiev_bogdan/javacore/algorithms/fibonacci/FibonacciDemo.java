package com.sysoiev_bogdan.javacore.algorithms.fibonacci;

public class FibonacciDemo {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n) {
        return n <= 1 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }

}