package com.sysoiev_bogdan.javacore.chapter18.collections.queue.arraydeque;

import java.util.ArrayDeque;

public class ArrayDequeClass {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(19876);
        arrayDeque.push(206);
        arrayDeque.push(33);
        arrayDeque.push(111);
        System.out.println("stack content : ");
        while (arrayDeque.peek() != null) {
            System.out.println(arrayDeque.pop());
        }
    }
}
/*
stack content :
111
33
206
19876
*/