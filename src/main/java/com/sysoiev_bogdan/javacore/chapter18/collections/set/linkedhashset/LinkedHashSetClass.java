package com.sysoiev_bogdan.javacore.chapter18.collections.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(33);
        linkedHashSet.add(11);
        linkedHashSet.add(44);
        linkedHashSet.add(22);

        System.out.println(linkedHashSet);//[33, 11, 44, 22]

    }
}
