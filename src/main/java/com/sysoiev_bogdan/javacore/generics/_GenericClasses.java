package com.sysoiev_bogdan.javacore.generics;

import java.util.Date;

public class _GenericClasses {
    public static void main(String[] args) {
     /*   Box box=new Box<>();
        box.set("1");
        box.set(new Date());*/

        Box<Phone> box = new Box<>();
        box.set(new Phone("Samsung"));
        System.out.println(box.get());

        Box<Letter> box1 = new Box<>();
        box1.set(new Letter("For you"));
        System.out.println(box1.get());
    }
}
