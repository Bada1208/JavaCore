package com.sysoiev_bogdan.javacore.tasks.concurrency.task2;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    public void fizz(FizzBuzz fizzBuzz) {
        List<Object> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0) list.add(i);
            else if (i % 3 == 0) list.add("fizz");
        }
        for (Object o : list) {
            System.out.print(o.toString() + " ");
        }
    }

    public void buzz(FizzBuzz fizzBuzz) {
        System.out.println();
        List<Object> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 5 != 0) list.add(i);
            else if (i % 5 == 0) list.add("buzz");
        }
        for (Object o : list) {
            System.out.print(o.toString() + " ");
        }

    }

    public void fizzbuzz(FizzBuzz fizzBuzz) {
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
    }

    public void number(FizzBuzz fizzBuzz) {
        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

}
