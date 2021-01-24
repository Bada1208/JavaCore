package com.sysoiev_bogdan.javacore.generics;

import java.util.Arrays;
import java.util.List;

public class _LowerBoundedWildCards {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2);
        List<Number> list2 = Arrays.asList(1, 2.0);
        //print(list);
        print(list1);
        print(list2);
    }

   /**
    * ? unbounded wildcard
    * <? super Integer> means all classes above the Integer class;
    * difference between ? & T , that with ? we cannot use few parameters like:
    * interface A{}
    * interface B{}
    * <T extends Comparable<T> & A & B>
    *     Difference between a wildcard bound and a type parameter bound:
    * 1.A wildcard can have only one bound, while a type parameter can have several bounds.
    * 2.A wildcard can have a lower or an upper bound, while there is no such thing as a lower bound for a type parameter.
    * 3.Bounded type parameter, we have the option to use it elsewhere in our generic method.
    * */
    static void print(List<? super Integer> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}
