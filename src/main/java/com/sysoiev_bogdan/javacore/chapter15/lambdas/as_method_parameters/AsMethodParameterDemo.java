package com.sysoiev_bogdan.javacore.chapter15.lambdas.as_method_parameters;

public class AsMethodParameterDemo {
    static String stringOp(StringFunc stringFunc, String str) {
        return stringFunc.func(str);
    }

    public static void main(String[] args) {
        String s = "Лямбда - выражения повышают эффективность Java ";
        String lambda = stringOp((str) -> str.toUpperCase(), s);
        System.out.println(lambda);
    }
}
