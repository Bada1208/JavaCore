package com.sysoiev_bogdan.javacore.functional_programming.streams_and_optionals;

import java.util.Optional;

public class _Optionals {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default value");
        System.out.println(value);
        Object value1 = Optional.ofNullable("hello")
                .orElseThrow(() -> new IllegalStateException("exception"));
        System.out.println(value1);
    }
}
