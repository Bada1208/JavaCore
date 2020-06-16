package com.sysoiev_bogdan.javacore.chapter18.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("Джoн Доу ", new Double(3434.34));
        hashMap.put("Toм Смит ", new Double(23.22));
        hashMap.put("Джейн Бейкер ", new Double(1378.00));
        hashMap.put("Toд Холл ", new Double(99.22));
        hashMap.put("Paльф Смит ", new Double(-19.08));
        Set<Map.Entry<String, Double>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, Double> me : entrySet) {
            System.out.print(me.getKey() + " : ");
            System.out.println(me.getValue());
        }
        System.out.println();
        // внести сумму 1000 на счет Джона Доу
        hashMap.put("Джoн Доу ", hashMap.get("Джoн Доу ") + 1000);
        System.out.println("Hoвый остаток на счете Джона Доу : " + hashMap.get("Джoн Доу "));
    }
}
