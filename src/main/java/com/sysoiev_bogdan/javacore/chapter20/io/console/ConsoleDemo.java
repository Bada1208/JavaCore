package com.sysoiev_bogdan.javacore.chapter20.io.console;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console console;

        console = System.console();

        //go out from program if console is not available
        if (console == null) return;

        //read string
        str = console.readLine("Enter string : ");
        console.printf("The string is : %s/n", str);
    }
}
