package com.sysoiev_bogdan.javacore.chapter21.nio.walk_file_tree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirTreeList {
    public static void main(String[] args) {
        String dirName="C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\sysoiev_bogdan\\javacore";
        System.out.println("Tree from catalog : "+dirName+":\n");
        try {
            Files.walkFileTree(Paths.get(dirName),new MyFileVisitor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
