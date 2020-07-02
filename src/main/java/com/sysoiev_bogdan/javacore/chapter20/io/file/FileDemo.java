package com.sysoiev_bogdan.javacore.chapter20.io.file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File(
                "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\sysoiev_bogdan\\javacore\\chapter20\\io\\file");
        String dirname = "C:\\Users\\Admin\\IdeaProjects\\JavaCore";
        System.out.println(file.getName());
        System.out.println(file.getPath());

        File fileDirectory = new File(dirname);
        if (fileDirectory.isDirectory()) {
            System.out.println("Catalog : " + dirname);
            String[] s = fileDirectory.list();
            for (int i = 0; i < s.length; i++) {
                File file1 = new File(dirname + "/" + s[i]);
                if (file1.isDirectory()) {
                    System.out.println(s[i] + " is a catalog");
                } else {
                    System.out.println(s[i] + " is a file");
                }
            }
        } else System.out.println(dirname + " is not a catalog");
    }

}
