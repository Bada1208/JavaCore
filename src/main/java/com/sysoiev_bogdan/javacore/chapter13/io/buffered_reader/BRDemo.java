package com.sysoiev_bogdan.javacore.chapter13.io.buffered_reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bвeдитe символы, 'q' - для выхода.");
        do {
            c = (char) bufferedReader.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
