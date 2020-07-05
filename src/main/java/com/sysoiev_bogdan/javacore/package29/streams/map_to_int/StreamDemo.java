package com.sysoiev_bogdan.javacore.package29.streams.map_to_int;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(33.4, 66.2, 556.8));
        System.out.println("List before :");
        list.forEach(s -> System.out.print(s + " "));
        System.out.println();
        IntStream intStream = list.stream().mapToInt((a) -> (int) Math.ceil(a));
        System.out.println("List after :");
        intStream.forEach(s -> System.out.print(s + " "));
    }
}
