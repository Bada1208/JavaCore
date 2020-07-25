package com.sysoiev_bogdan.javacore.chapter11.concurrency.thread_interrupted;

import java.util.Random;

public class InterruptedTestClass {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            Random random = new Random();
            for (int i = 0; i < 1_000_000_000; i++) {
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("Thread was interrupted");
                    break;
                }
                Math.sin(random.nextDouble());
            }
        });
        System.out.println("Starting thread");
        thread.start();
        try {
            Thread.sleep(1000);
            thread.interrupt();
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ending thread");
    }
}
