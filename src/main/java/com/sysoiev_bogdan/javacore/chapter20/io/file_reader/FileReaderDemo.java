package com.sysoiev_bogdan.javacore.chapter20.io.file_reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\sysoiev_bogdan\\javacore\\chapter20\\io\\file_reader\\FileReaderDemo.java")) {
            int c;
            while ((c = fileReader.read()) != -1) System.out.print((char) c);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
