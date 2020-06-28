package com.sysoiev_bogdan.javacore.chapter13.io.file_input_stream;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        if (args.length != 1) {
            System.out.println("Иcпoльзoвaниe : ShowFile имя_файла");
            return;
        }
        try (FileInputStream fileInputStream = new FileInputStream(args[0])) {
            do {
                i = fileInputStream.read();
                if (i != -1) System.out.println((char) i);

            } while (i != 1);
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}
