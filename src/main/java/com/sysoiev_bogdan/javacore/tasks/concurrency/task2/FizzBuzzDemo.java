package com.sysoiev_bogdan.javacore.tasks.concurrency.task2;

import java.util.function.IntConsumer;

public class FizzBuzzDemo {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(20);
        //first thread
        Runnable runnableFizz = () -> {
            Runnable fizz = () -> {
            };
            try {
                fizzBuzz.fizz(fizz);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(runnableFizz).start();
        //second thread
        Runnable runnableBuzz = () -> {
            Runnable buzz = () -> {
            };
            try {
                fizzBuzz.buzz(buzz);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(runnableBuzz).start();
        //third thread
        Runnable runnableFizzBuzz = () -> {
            Runnable fizzBuzzRun = () -> {
            };
            try {
                fizzBuzz.fizzbuzz(fizzBuzzRun);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(runnableFizzBuzz).start();
        //forth thread
        Runnable runnablePrint = () -> {
            IntConsumer consumer = null;
            for (int i = 1; i <= fizzBuzz.getN(); i++) {
                consumer = a -> System.out.print(a + " ");
                consumer.accept(i);
            }
            try {
                fizzBuzz.number(consumer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(runnablePrint).start();
    }
}
