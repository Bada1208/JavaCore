package com.sysoiev_bogdan.javacore.tasks.concurrency.task2;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzDemoConcurrency {
   /* public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(20);

        Runnable myThreadA = () -> {
            fizzBuzz.fizz(); = () -> {

                List<Object> list = new ArrayList<>();
                for (int i = 1; i <= n; i++) {
                    if (i % 3 != 0) list.add(i);
                    else if (i % 3 == 0) list.add("fizz");
                }
                System.out.println();
                for (Object o : list) {
                    System.out.print(o.toString() + " ");
                }
            };
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
    }*/
}
