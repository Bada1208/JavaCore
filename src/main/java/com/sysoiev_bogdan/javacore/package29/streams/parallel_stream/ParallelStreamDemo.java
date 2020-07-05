package com.sysoiev_bogdan.javacore.package29.streams.parallel_stream;

import java.util.ArrayList;
import java.util.Arrays;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(2.3, 45.6, 555.6));
        double productOfSqrRoots = list.parallelStream().reduce(
                1.0,
                (a, b) -> a * Math.sqrt(b),
                (a, b) -> a * b);
        System.out.println(productOfSqrRoots);
    }
}
