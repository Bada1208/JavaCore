package com.sysoiev_bogdan.javacore.chapter18.collections.class_collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class CollectionsClass {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(-3);
        linkedList.add(44);
        linkedList.add(37);
        linkedList.add(30009);
        Comparator<Integer> comparator = Collections.reverseOrder();
        Collections.sort(linkedList, comparator);
        System.out.println("List was sorted in reverse order : ");
        for (Integer i : linkedList) {
            System.out.print(i + " ");
        }
        //перетасовать список
        Collections.shuffle(linkedList);
        System.out.println("\nList was shuffled : ");
        for (Integer i : linkedList) {
            System.out.print(i + " ");
        }
        System.out.println("\nMin : " + Collections.min(linkedList));
        System.out.println("Max : " + Collections.max(linkedList));
    }
}
