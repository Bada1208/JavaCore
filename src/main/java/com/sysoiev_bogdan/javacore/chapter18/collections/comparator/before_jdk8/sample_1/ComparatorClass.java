package com.sysoiev_bogdan.javacore.chapter18.collections.comparator.before_jdk8.sample_1;

import java.util.Comparator;

public class ComparatorClass implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        // выполнить сравнение в обратном порядке
        return o2.compareTo(o1);
    }
    // переопределять метод equals () не требуется
}
