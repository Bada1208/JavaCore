package com.sysoiev_bogdan.javacore.tasks.palindrom;

public class PalindromDemo {
    public static void main(String[] args) {
        System.out.println(isPalindrom("123321"));
        System.out.println(isPalindrom("1221"));
        System.out.println(isPalindrom("123456"));
        System.out.println(isPalindrom("12345678910"));
        System.out.println(isPalindrom("123456654321"));
    }

    public static boolean isPalindrom(String s) {
        /*boolean isPal = false;
        String reverse = new StringBuffer(s).reverse().toString();
        if (s.equals(reverse)) isPal = true;
        return isPal;*/
        return s.equals(new StringBuffer(s).reverse().toString());
    }
}
