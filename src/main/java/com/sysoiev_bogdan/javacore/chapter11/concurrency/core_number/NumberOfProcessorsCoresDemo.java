package com.sysoiev_bogdan.javacore.chapter11.concurrency.core_number;

public class NumberOfProcessorsCoresDemo {
    static int NUM_OF_THREADS = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        System.out.println(NUM_OF_THREADS);//2
    }
}
