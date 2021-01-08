package com.sysoiev_bogdan.javacore.algorithms.fibonacci;

public class FibonacciDemo {

    public static void main(String[] args) {

//первые два числа равны либо 1 и 1, либо 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел
        System.out.println(fibonacci(5));//8=0,1,1,2,3,5

    }

    public static int fibonacci(int n) {
        return n <= 1 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }

}