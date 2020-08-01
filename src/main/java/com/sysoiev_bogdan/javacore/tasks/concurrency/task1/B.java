package com.sysoiev_bogdan.javacore.tasks.concurrency.task1;

public class B implements Runnable {

    private Foo foo;

    public B(Foo foo) {
        this.foo = foo;
    }

    @Override
    public void run() {
        try {
            foo.second();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}