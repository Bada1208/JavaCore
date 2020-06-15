package com.sysoiev_bogdan.javacore.chapter18.collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.addLast("Z");
        list.addFirst("A");
        System.out.println("list content : " + list);
        list.remove("B");
        list.remove(3);
        System.out.println("list content after removing : " + list);
        list.removeFirst();
        list.removeLast();
        System.out.println("list content after removing first and last elements : " + list);
        String value = list.get(1);
        list.set(1, value + " was changed");
        System.out.println("list content after changing : " + list);
    }
}
