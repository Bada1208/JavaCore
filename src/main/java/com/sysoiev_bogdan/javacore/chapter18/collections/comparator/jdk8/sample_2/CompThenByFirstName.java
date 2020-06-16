package com.sysoiev_bogdan.javacore.chapter18.collections.comparator.jdk8.sample_2;

import java.util.Comparator;

public class CompThenByFirstName implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        //отсортировать счета вкладчиков по Ф.И.О., если фамилии одинаковы
        return o1.compareToIgnoreCase(o2);
    }
}
