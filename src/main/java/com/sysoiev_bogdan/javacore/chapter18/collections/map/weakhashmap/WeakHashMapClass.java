package com.sysoiev_bogdan.javacore.chapter18.collections.map.weakhashmap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapClass {
    private static Map map;

    public static void main(String[] args) {
        map = new WeakHashMap<>();
        map.put(new Integer(1), "Bogdan");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (map.containsKey(1)) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread is waiting...");
                    System.gc();
                }
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
        System.out.println("App is waiting...");
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
