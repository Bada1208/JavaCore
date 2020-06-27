package com.sysoiev_bogdan.javacore.chapter10.exceptions.own_exception;

public class ExceptionDemo {
    static void compute(int a) throws MyException {
        if (a > 10) throw new MyException(a);
    }

    public static void main(String[] args) {
        try {
            compute(9);
            compute(20);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
