package com.sysoiev_bogdan.javacore.tasks.concurrency.task1;

public class A implements Runnable {

    private Foo foo;

    public A(Foo foo) {
        this.foo = foo;
    }

    @Override
    public void run() {
        try {
            foo.first();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}