package com.sysoiev_bogdan.javacore.package29.streams.spliterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four"));
        Stream<String> stringStream = list.stream();
        Spliterator<String> mySpliterator = stringStream.spliterator();
        while (mySpliterator.tryAdvance(System.out::println)) ;
    }
}
