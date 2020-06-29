package com.sysoiev_bogdan.javacore.chapter15.lambdas.ordinary;

public class LambdaDemo {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2) == 0;
        if (isEven.test(10)) System.out.println("Number 10 is even");
        if (!isEven.test(11)) System.out.println("Number 11 is odd");

        NumericTest isNonNegative = (n) -> n >= 0;
        if (isNonNegative.test(10)) System.out.println("Number 10 is non negative");

    }
}
