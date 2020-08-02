package com.sysoiev_bogdan.javacore.tasks.concurrency.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;

class FizzBuzz {
    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }


    public synchronized void fizz(Runnable printFizz) throws InterruptedException {
        printFizz = () -> {
            System.out.println();
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
        printFizz.run();
    }

    public synchronized void buzz(Runnable printBuzz) throws InterruptedException {
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
        printBuzz.run();
    }

    public synchronized void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
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
        printFizzBuzz.run();
    }

    public synchronized void number(IntConsumer printNumber) throws InterruptedException {
        printNumber = (n) -> {
        };

    }
}
