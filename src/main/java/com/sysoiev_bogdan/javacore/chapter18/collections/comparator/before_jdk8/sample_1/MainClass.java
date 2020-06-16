package com.sysoiev_bogdan.javacore.chapter18.collections.comparator.before_jdk8.sample_1;

import java.util.TreeSet;

public class MainClass {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new ComparatorClass());
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("B");
        for (String s : treeSet) {
            System.out.print(s + " ");//E D C B A
        }
    }
}
