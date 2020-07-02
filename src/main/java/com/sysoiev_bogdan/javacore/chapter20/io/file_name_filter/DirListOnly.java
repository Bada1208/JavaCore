package com.sysoiev_bogdan.javacore.chapter20.io.file_name_filter;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {
    public static void main(String[] args) {
        String dir = "D:\\Books\\Coding\\Spring";
        File file = new File(dir);
        FilenameFilter only = new OnlyExt("pdf");
        String[] s = file.list(only);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
}
