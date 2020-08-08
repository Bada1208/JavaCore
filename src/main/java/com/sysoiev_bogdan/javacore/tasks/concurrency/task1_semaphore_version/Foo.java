package com.sysoiev_bogdan.javacore.tasks.concurrency.task1_semaphore_version;


import java.util.concurrent.atomic.AtomicInteger;

public class Foo {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public Foo() {
        atomicInteger.incrementAndGet();
    }

    public synchronized void first(Runnable printFirst) {
        printFirst.run();
    }

    public synchronized void second(Runnable printSecond) {
        printSecond.run();
    }

    public synchronized void third(Runnable printThird) {
        printThird.run();
    }

    public int getAtomicInteger() {
        return atomicInteger.get();
    }

}


class ThreadFoo extends Thread {
    private Foo foo;

    public ThreadFoo() {
        foo = new Foo();
         new Thread(this).start();
    }

    @Override
    public void run() {
        if (foo.getAtomicInteger() == 1) foo.first(() -> System.out.println("first"));
        else if (foo.getAtomicInteger() == 2) foo.second(() -> System.out.println("second"));
        else if (foo.getAtomicInteger() == 3) foo.third(() -> System.out.println("third"));

    }
/*
    public int getCounter() {
        return counter;
    }*/
  /* public int getThreadCount() {
        return threadCount;
    }*/
}

class FooDemo {
    public static void main(String[] args) {
        new ThreadFoo();
        new ThreadFoo();
        new ThreadFoo();

    }
}
/*class FooDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        Foo foo = new Foo(semaphore);
        Runnable first = () -> {
            try {
                semaphore.acquire();
                foo.first(() -> System.out.println("first"));
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable second = () -> {
            try {
                semaphore.acquire();
                foo.second(() -> System.out.println("second"));
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable third = () -> {
            try {
                semaphore.acquire();
                foo.third(() -> System.out.println("third"));
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread1 = new Thread(first);
        Thread thread2 = new Thread(second);
        Thread thread3 = new Thread(third);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}*/