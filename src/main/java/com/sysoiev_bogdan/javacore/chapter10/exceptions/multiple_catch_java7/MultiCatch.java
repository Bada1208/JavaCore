package com.sysoiev_bogdan.javacore.chapter10.exceptions.multiple_catch_java7;

public class MultiCatch {

    public static void main(String[] args) {
        int a = 10, b = 0;
        int vals[] = {1, 2, 3};
        try {
            //int c = a / b;
            vals[10] = 4;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
