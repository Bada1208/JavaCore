package com.sysoiev_bogdan.javacore.chapter10.exceptions.finally_operator;

public class FinallyOperatorClass {
    static void proc() {
        try {
            throw new RuntimeException("demonstration");
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Exception was catched");
        }
    }

    public static void main(String[] args) {
        proc();
    }
}
