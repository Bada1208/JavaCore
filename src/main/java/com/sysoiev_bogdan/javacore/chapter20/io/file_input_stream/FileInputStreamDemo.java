package com.sysoiev_bogdan.javacore.chapter20.io.file_input_stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args) {
        int size;
        //FileInputStream fileInputStream;
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\sysoiev_bogdan\\javacore\\chapter20\\io\\file_input_stream\\FileInputStreamDemo.java")) {
            System.out.println("Quantity of available bytes : " + (size = fileInputStream.available()));

            int n = size / 40;
            System.out.println("First " + n + " bytes which were read with read() method");
            for (int i = 0; i < n; i++) {
                System.out.println(fileInputStream.read());
            }
            System.out.println("Are available " + fileInputStream.available() + " bytes");
            System.out.println("Reading next " + n + " bytes which were read with read() method");
            byte[] b = new byte[n];
            if (fileInputStream.read() != n) {
                System.err.println("We can not read " + n + " bytes");
            }
            System.out.println(new String(b, 0, n));
            System.out.println("Are available " + fileInputStream.available() + " bytes");
            System.out.println("Skip 1/2 files by skip() method");
            fileInputStream.skip(size / 2);
            System.out.println("Are available : " + fileInputStream.available());
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
