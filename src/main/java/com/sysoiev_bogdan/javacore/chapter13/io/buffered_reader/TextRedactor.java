package com.sysoiev_bogdan.javacore.chapter13.io.buffered_reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextRedactor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Enter text");
        System.out.println("Enter 'stop' in order to finish enter ");

        for (int i = 0; i < 100; i++) {
            str[i] = reader.readLine();
            if (str[i].equals("stop")) break;
        }

        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }
}
