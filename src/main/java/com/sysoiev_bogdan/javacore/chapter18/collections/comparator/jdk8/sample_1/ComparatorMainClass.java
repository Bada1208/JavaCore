package com.sysoiev_bogdan.javacore.chapter18.collections.comparator.jdk8.sample_1;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorMainClass {
    public static void main(String[] args) {
        //передать компаратор с обратным упорядочением древовидному множеству типа TreeSet
        //TreeSet<String> treeSet = new TreeSet<>((o1, o2) -> o2.compareTo(o1));
        TreeSet<String> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("B");
        for (String s : treeSet) {
            System.out.print(s + " ");
        }
    }
}
