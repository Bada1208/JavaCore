package com.sysoiev_bogdan.javacore.chapter18.collections.list.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        //начальный размер вектора - 3, а инкремент - 2
        Vector<Integer> vector = new Vector<>(3, 2);
        System.out.println("initial capacity : " + vector.capacity());
        System.out.println("initial size : " + vector.size());
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);
        System.out.println("capacity after adding 4 elements : " + vector.capacity());
        System.out.println("first element : " + vector.firstElement());
        System.out.println("last element : " + vector.lastElement());
        if (vector.contains(3)) System.out.println("vector contains 3");

        System.out.println("enumeration : ");
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) System.out.print(enumeration.nextElement() + " ");
    }
}
