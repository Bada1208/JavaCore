package com.sysoiev_bogdan.javacore.tasks.concurrency.task1;

import java.util.Objects;

public class Foo {

    private final Object o = new Object();
    private String lastState = null;

    void first() throws InterruptedException {
        synchronized (o) {
            while (true) {
                if ("third".equals(lastState) || Objects.isNull(lastState)) {
                    break;
                } else {
                    o.wait();
                    break;
                }
            }
            System.out.println("first");
            lastState = "first";
            o.notifyAll();
        }
    }

    void second() throws InterruptedException {
        synchronized (o) {
            while (!"first".equals(lastState)) {
                o.wait();
            }
            System.out.println("second");
            lastState = "second";
            o.notifyAll();
        }
    }

    void third() throws InterruptedException {
        synchronized (o) {
            while (!"second".equals(lastState)) {
                o.wait();
            }
            System.out.println("third");
            lastState = "third";
            o.notifyAll();
        }
    }
}