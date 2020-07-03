package com.sysoiev_bogdan.javacore.chapter21.nio.copy_method;

import java.io.IOException;
import java.nio.file.*;

public class NIOCopy {
    public static void main(String[] args) {
        try {
            Path source = Paths.get("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\sysoiev_bogdan\\javacore\\chapter21\\nio\\copy_method\\test.txt");
            Path target = Paths.get("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\sysoiev_bogdan\\javacore\\chapter21\\nio\\copy_method\\target.txt");
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (InvalidPathException | IOException e) {
            e.printStackTrace();
        }


    }
}
