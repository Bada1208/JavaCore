package com.sysoiev_bogdan.javacore.functional_programming.functional_interfaces;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionURL());
        System.out.println(getDBConnectionURLSupplier.get());
    }

    static String getDBConnectionURL() {
        return "jdbc://localhost:8080/users";
    }

    static Supplier<String> getDBConnectionURLSupplier =
            () -> "jdbc://localhost:8080/users";
}
