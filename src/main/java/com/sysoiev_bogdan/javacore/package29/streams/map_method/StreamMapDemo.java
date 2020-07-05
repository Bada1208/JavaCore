package com.sysoiev_bogdan.javacore.package29.streams.map_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMapDemo {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(2.4, 33.5, 2.0, 34.43, 556.23, 976.56));
        Stream<Double> sqrRootStream = list.stream().map((a) -> Math.sqrt(a));
        double d = sqrRootStream.reduce(1.0, (a, b) -> a * b);
        System.out.println(d);
    }
}
