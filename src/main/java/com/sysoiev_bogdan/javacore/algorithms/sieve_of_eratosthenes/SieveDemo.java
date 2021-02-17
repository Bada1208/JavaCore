package com.sysoiev_bogdan.javacore.algorithms.sieve_of_eratosthenes;

import java.util.ArrayList;
import java.util.List;

public class SieveDemo {
    public static void main(String[] args) {
        sieve(100);
    }

    public static void sieve(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (i < 4) {
                list.add(i);
            } else if (i > 4 && i < 10 && !(i % 2 == 0) && !(i % 3 == 0)) {
                list.add(i);
            } else if (!(i % 2 == 0) && !(i % 3 == 0) && !(i % 5 == 0) && !(i % 7 == 0)) {
                list.add(i);
            }
        }
        list.forEach(val -> System.out.print(val + " "));
    }
}
