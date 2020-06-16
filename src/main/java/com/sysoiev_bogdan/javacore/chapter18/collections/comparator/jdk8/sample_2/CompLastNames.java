package com.sysoiev_bogdan.javacore.chapter18.collections.comparator.jdk8.sample_2;

import java.util.Comparator;

//Компаратор , сравнивающий фамилии в кладчиков
public class CompLastNames implements Comparator<String> {
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
