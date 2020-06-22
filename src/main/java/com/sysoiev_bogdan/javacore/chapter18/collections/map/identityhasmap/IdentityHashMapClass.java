package com.sysoiev_bogdan.javacore.chapter18.collections.map.identityhasmap;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapClass {
    public static void main(String[] args) {
        IdentityHashMap identityHashMap = new IdentityHashMap<>();
        System.out.println("Adding elements");
        identityHashMap.put(3, "Proselyte");
        identityHashMap.put(2, "AsyaSmile");
        identityHashMap.put(5, "Konstantin");
        identityHashMap.put(1, "Ivan");
        identityHashMap.put(4, "Peter");


        System.out.println("Initial identityHashMap content:");
        Set set = identityHashMap.entrySet();
        for (Object o : set) {
            Map.Entry mapEntry=(Map.Entry) o;
            System.out.println("ID: " + mapEntry.getKey() + ", Name: " + mapEntry.getValue());
        }
        System.out.println("Modifying Proselyte...");
        String name = (String) identityHashMap.get(3);
        name += " Changed";
        identityHashMap.put(3, name);

        System.out.println("After change identityHashMap content:");
        set = identityHashMap.entrySet();

        for (Object element : set) {
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println("ID: " + mapEntry.getKey() + ", Name: " + mapEntry.getValue());
        }
    }
}
