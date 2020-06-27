package com.sysoiev_bogdan.javacore.chapter10.exceptions.multiple_catches;

public class MultipleCatchesClass {
    public static void main(String[] args) {
        try {
            int а = args.length;
            System.out.println(" a =" + а);
            int Ь = 42 / а;
            int с[] = {1};
            с[42] = 99;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
