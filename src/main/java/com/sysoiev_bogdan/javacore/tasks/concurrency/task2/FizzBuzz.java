package com.sysoiev_bogdan.javacore.tasks.concurrency.task2;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    Runnable printFizz = () -> {
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
    public void fizz(Runnable printFizz) {
        printFizz.run();
    }

    public void buzz(Runnable printBuzz) {
        printBuzz = () -> {
            System.out.println();
            List<Object> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (i % 5 != 0) list.add(i);
                else if (i % 5 == 0) list.add("buzz");
            }
            for (Object o : list) {
                System.out.print(o.toString() + " ");
            }
        };
        Thread threadB = new Thread(printBuzz);
        threadB.start();
        try {
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fizzbuzz(Runnable printFizzBuzz) {
        printFizzBuzz = () -> {
            System.out.println();
            List<Object> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (i % 3 != 0 && i % 5 != 0) list.add(i);
                else if (i % 3 == 0) list.add("fizz");
                else if (i % 5 == 0) list.add("buzz");
            }
            for (Object o : list) {
                System.out.print(o.toString() + " ");
            }
        };
        Thread threadC = new Thread(printFizzBuzz);
        threadC.start();
        try {
            threadC.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void number(Runnable printNumber) {
        printNumber = () -> {
            System.out.println();
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        };
        Thread threadD = new Thread(printNumber);
        threadD.start();
        try {
            threadD.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
public void runMethod(){

    Thread threadA = new Thread(()->{
       // new FizzBuzz().
    });
    threadA.start();
    try {
        threadA.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}
