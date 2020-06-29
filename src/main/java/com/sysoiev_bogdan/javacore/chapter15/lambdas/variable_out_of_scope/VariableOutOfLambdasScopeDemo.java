package com.sysoiev_bogdan.javacore.chapter15.lambdas.variable_out_of_scope;

public class VariableOutOfLambdasScopeDemo {

    public static void main(String[] args) {
        int m = 15;
        int n = 10;
        SumInterface sumInterface = (i, j) -> {
            int sum = i + j;
            return sum;
        };
        System.out.println(sumInterface.sum(m, n));
    }
}
