package com.sysoiev_bogdan.javacore.chapter18.collections.set.hashset;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(11);
        hashSet.add(22);
        hashSet.add(33);
        hashSet.add(44);
        System.out.println(hashSet);//[33, 22, 11, 44]
    }
}
