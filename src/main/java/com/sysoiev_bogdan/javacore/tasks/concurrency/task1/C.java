package com.sysoiev_bogdan.javacore.tasks.concurrency.task1;

public class C implements Runnable {

    private Foo foo;

    public C(Foo foo) {
        this.foo = foo;
    }

    @Override
    public void run() {
        try {
            foo.third();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}