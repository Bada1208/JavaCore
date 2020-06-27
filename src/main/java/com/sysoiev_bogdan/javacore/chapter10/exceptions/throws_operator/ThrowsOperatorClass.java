package com.sysoiev_bogdan.javacore.chapter10.exceptions.throws_operator;

public class ThrowsOperatorClass {
    static void demoproc() throws IllegalAccessException{
        throw new IllegalAccessException("demonstration");
    }
    public static void main(String[] args) {
        try {
            demoproc();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
