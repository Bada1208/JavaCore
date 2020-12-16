package com.sysoiev_bogdan.javacore.package29.streams.optional;

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());
        Optional<String> empty2 = Optional.of("hello");
        System.out.println(empty2);
        String orElse = empty2.orElse(" world");
        System.out.println(orElse);
        Optional<String> empty3 = Optional.ofNullable(null);
        System.out.println(empty3.orElse(" world"));
        empty2.ifPresent(word -> System.out.println(word));
        empty2.ifPresent(System.out::println);
    }
}
