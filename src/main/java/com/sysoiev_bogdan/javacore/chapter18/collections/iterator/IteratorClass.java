package com.sysoiev_bogdan.javacore.chapter18.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            listIterator.set(listIterator.next() + "+ ");
        }
        System.out.println("\nChanged content : ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\nChanged direction of output : ");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
    }
}
