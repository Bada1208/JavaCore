package com.sysoiev_bogdan.javacore.functional_programming.beyond_functions;

import java.util.function.Function;

public class _Lambdas {
    public static void main(String[] args) {
        Function<String, String> printUpperCaseName =
                name -> name.toUpperCase();
        Function<String, String> printUpperCaseNameMethodReference =
                String::toUpperCase;
        System.out.println(printUpperCaseName.apply("Vasia"));
        System.out.println(printUpperCaseNameMethodReference.apply("Vova"));
    }
}
