package com.sysoiev_bogdan.javacore.chapter10.exceptions.nest_try;

public class NestTryClass {
    public static void main(String[] args) {
        try {
            int a = args.length;

            int Ь = 42 / a;
            System.out.println(" a " + a);
            try { // вложенный блок try
                if (a == 1) a = a / (a - a); //деление на нуль
                else if (a == 2) {
                    int с[] = {1};
                    с[42] = 99; // здесь генерируется исключение в связи с выходом за пределы массива
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индeкc за пределами массива : " + e);
            }
        } catch (ArithmeticException е) {
            System.out.println("Дeлeниe на нуль : " + е);
        }

    }
}