package com.sysoiev_bogdan.javacore.chapter18.collections.iterator;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorClass {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        list.add(4.0);
        System.out.println("list content :");
        Spliterator<Double> spliterator = list.spliterator();
        while (spliterator.tryAdvance(System.out::println)) ;

        //create new list with square degree
        spliterator = list.spliterator();
        ArrayList<Double> listSq = new ArrayList<>();
        while (spliterator.tryAdvance(n -> listSq.add(Math.sqrt(n)))) ;
        //output
        System.out.println("output : ");
        spliterator = listSq.spliterator();
        spliterator.forEachRemaining(System.out::println);
        System.out.println();
    }
}
