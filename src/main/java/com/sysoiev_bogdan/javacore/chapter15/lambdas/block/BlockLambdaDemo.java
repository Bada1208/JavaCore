package com.sysoiev_bogdan.javacore.chapter15.lambdas.block;

public class BlockLambdaDemo {

    public static void main(String[] args) {
        ConsoleInterface console = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.print(i + " ");
            }
        };
        console.input();
    }
}
