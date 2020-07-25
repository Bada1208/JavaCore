package com.sysoiev_bogdan.javacore.tasks.concurrency.task1;

public class ThreadOutputSequenceDemo {
    public static void main(String[] args) {
        Runnable myThreadA = () -> {
            Thread.currentThread().setName("A");
            new Foo().first();
        };

        Runnable myThreadB = () -> {
            Thread.currentThread().setName("B");
            new Foo().second();
        };
        Runnable myThreadC = () -> {
            Thread.currentThread().setName("C");
            new Foo().third();
        };
        Thread threadA = new Thread(myThreadA);
        Thread threadB = new Thread(myThreadB);
        Thread threadC = new Thread(myThreadC);
        threadA.start();
        try {
            threadA.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.start();
        try {
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadC.start();
        try {
            threadC.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
