package com.sysoiev_bogdan.javacore.chapter18.collections.set.treeset;

import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(33);
        treeSet.add(11);
        treeSet.add(44);
        treeSet.add(22);

        System.out.println(treeSet);//[11, 22, 33, 44]
    }
}
