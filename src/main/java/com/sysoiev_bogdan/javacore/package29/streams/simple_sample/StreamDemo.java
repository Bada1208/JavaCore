package com.sysoiev_bogdan.javacore.package29.streams.simple_sample;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(22, 433, 54, 546, 5, 7777));
        System.out.print("List : " + list);

        Stream<Integer> myStream = list.stream();
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent()) System.out.println("\nMin value : " + minVal.get());

        System.out.println("Sorted list : ");
        list.stream().sorted().forEach((n) -> System.out.print(n + " "));

        System.out.println("\nOnly even values : ");
        list.stream().sorted().filter((n) -> (n % 2) == 0).forEach(System.out::println);

        System.out.println("Sorted reduce() : ");
        Optional<Integer> reduce = list.stream().sorted().filter((n) -> (n % 2) == 0).reduce((a, b) -> a * b);
        System.out.println(reduce);

    }
}
