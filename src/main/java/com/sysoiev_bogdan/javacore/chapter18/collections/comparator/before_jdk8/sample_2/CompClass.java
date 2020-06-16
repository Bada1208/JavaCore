package com.sysoiev_bogdan.javacore.chapter18.collections.comparator.before_jdk8.sample_2;

import java.util.Comparator;

public class CompClass implements Comparator<String> {
    //использовать компаратор для сортировки счетов по фамилиям вкладчиков
    @Override
    public int compare(String o1, String o2) {
        int i, j, k;
//найти индекс символа , с которого начинается фамилия
        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');
        k = o1.substring(i).compareTo(o2.substring(j));
        if (k == 0)//Фамилии совпадают , проверить имя и фамилию полностью
            return o1.compareTo(o2);
        else
            return k;
    }
}
