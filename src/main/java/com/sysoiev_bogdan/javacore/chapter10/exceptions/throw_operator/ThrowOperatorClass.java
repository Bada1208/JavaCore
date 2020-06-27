package com.sysoiev_bogdan.javacore.chapter10.exceptions.throw_operator;

public class ThrowOperatorClass {
    static void demoproc() {
        try {
            throw new NullPointerException("demonstration");
        } catch (NullPointerException e) {
            e.printStackTrace();
            throw e;//повторно сгенерировать исключение
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
