package com.sysoiev_bogdan.javacore.chapter10.exceptions.own_exception;

public class MyException extends Throwable {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException : " + detail;
    }
}
