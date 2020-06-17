package com.sysoiev_bogdan.javacore.chapter18.collections.map.properties;

import java.util.Properties;
import java.util.Set;

public class PropertiesClass {
    public static void main(String[] args) {
        Properties defaultList = new Properties();
        defaultList.put("Флорида", "Тэлесси");
        Properties capitals = new Properties(defaultList);
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        //получить множество ключей
        Set<?> states = capitals.keySet();
        //показать все штаты и их столицы
        for (Object name : states) {
            System.out.println("Cтoлицa штата " + name + " - " +
                    capitals.getProperty((String) name) + ".");
        }
        //найти штат , отсутствующий в списке , указав значения , выбираемые по умолчанию
        // System.out.println("Cтoлицa штата Флорида " + capitals.getProperty("Флорида", "не найдена"));


        //Теперь штат Флорида будет найден в списке по умолчанию
        System.out.println("Cтoлицa штата Флорида " + capitals.getProperty("Флорида"));

    }
}
