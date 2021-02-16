package com.sysoiev_bogdan.javacore.algorithms.fibonacci;

public class FibonacciDemo {
    public static void main(String[] args) {
//первые два числа равны либо 1 и 1, либо 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел
        System.out.println(fibonacciRecursive(5));//8=0,1,1,2,3,5
        System.out.println(fibonacciBestSolution(5));
    }

    public static int fibonacciRecursive(int n) {
        return n <= 1 ? 1 : fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciBestSolution(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i <= n; i++) {
            int c = a + b;
//переставляем a, b <- b, c
            a = b;
            b = c;
        }
        return a;
    }
}