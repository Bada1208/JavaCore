package com.sysoiev_bogdan.javacore.chapter11.concurrency.synchronized_sample;

public class SynchronizedTestClass {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        SynchronizedTestClass test = new SynchronizedTestClass();
        test.doWork();
    }

    /*public synchronized void increment() {
        counter++;
    }*/
    public void increment() {
        synchronized (this) {
            counter++;
        }
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increment();
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}
