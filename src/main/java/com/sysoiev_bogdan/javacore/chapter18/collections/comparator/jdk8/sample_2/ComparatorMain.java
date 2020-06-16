package com.sysoiev_bogdan.javacore.chapter18.collections.comparator.jdk8.sample_2;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ComparatorMain {
    public static void main(String[] args) {
        Comparator<String> stringComparator = new CompLastNames().thenComparing(new CompThenByFirstName());

        TreeMap<String, Double> treeMap = new TreeMap<>(stringComparator);
        treeMap.put("Джoн Доу", 334.34);
        treeMap.put("Toм Смит", 2.22);
        treeMap.put("Джейн Бейкер", 178.00);
        treeMap.put("Toд Холл", 9.22);
        treeMap.put("Paльф Смит", -1.08);
        Set<Map.Entry<String, Double>> entrySet = treeMap.entrySet();
        for (Map.Entry<String, Double> me : entrySet) {
            System.out.print(me.getKey() + " : ");
            System.out.println(me.getValue());
        }
        System.out.println();
        // внести сумму 1000 на счет Джона Доу
        treeMap.put("Джoн Доу", treeMap.get("Джoн Доу") + 1000);
        System.out.println("Hoвый остаток на счете Джона Доу : " + treeMap.get("Джoн Доу"));
    }
}
