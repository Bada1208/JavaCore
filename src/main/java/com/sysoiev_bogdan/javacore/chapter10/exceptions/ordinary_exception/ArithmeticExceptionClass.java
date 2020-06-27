package com.sysoiev_bogdan.javacore.chapter10.exceptions.ordinary_exception;

import java.util.Random;

public class ArithmeticExceptionClass {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random random = new Random();
        for (int i = 0; i < 32000; i++) {
            try {
                b = random.nextInt();
                c = random.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Dividing by 0");
                a = 0;//a equals 0 and continue
            }
            System.out.println("a = " + a);
        }
    }
}
