package com.sysoiev_bogdan.javacore.chapter13.io.print_writer;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter printWriter = new PrintWriter(System.out, true);

        printWriter.println("It is string");
        printWriter.println(3);
        printWriter.println(2.445);
    }
}
