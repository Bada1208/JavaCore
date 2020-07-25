package com.sysoiev_bogdan.javacore.chapter11.concurrency.wait_notify;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        WaitAndNotify waitAndNotify = new WaitAndNotify();

        Thread thread1 = new Thread(() -> waitAndNotify.produce());
        Thread thread2 = new Thread(() -> waitAndNotify.consume());
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class WaitAndNotify {
    public void produce() {
        synchronized (this){
            try {
                System.out.println("Producer thread started...");
                wait();
                System.out.println("Producer thread resumed...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void consume() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner scanner=new Scanner(System.in);
        synchronized (this){
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            notify();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}