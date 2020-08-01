package com.sysoiev_bogdan.javacore.tasks.concurrency.task1;

public class FooDemo {
    public static void main(String[] args) throws InterruptedException{
        Foo foo = new Foo();

        Thread a = new Thread(new A(foo));
        Thread b = new Thread(new B(foo));
        Thread c = new Thread(new C(foo));
        c.start();
        b.start();
        a.start();

        a.join();
        b.join();
        c.join();
    }
}
