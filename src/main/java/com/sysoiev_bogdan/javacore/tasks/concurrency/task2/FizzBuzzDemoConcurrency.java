package com.sysoiev_bogdan.javacore.tasks.concurrency.task2;

public class FizzBuzzDemoConcurrency {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(20);

        Runnable myThreadA = () -> {
            fizzBuzz.fizz(fizzBuzz);
        };
        Runnable myThreadB = () -> {
            fizzBuzz.buzz(fizzBuzz);
        };
        Runnable myThreadC = () -> {
            fizzBuzz.fizzbuzz(fizzBuzz);
        };
        Runnable myThreadD = () -> {
            fizzBuzz.number(fizzBuzz);
        };
        Thread threadA = new Thread(myThreadA);
        Thread threadB = new Thread(myThreadB);
        Thread threadC = new Thread(myThreadC);
        Thread threadD = new Thread(myThreadD);
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
        threadD.start();
        try {
            threadD.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
