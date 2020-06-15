package com.sysoiev_bogdan.javacore.chapter18.collections.objects_saving;

import java.util.ArrayList;

public class SongClass {
    public static void main(String[] args) {
        ArrayList<Song> list = new ArrayList<>();
        list.add(new Song(1, "Zemfira", "Hochesh"));
        list.add(new Song(2, "Slin", "Chram"));
        for (Song s : list) {
            System.out.println(s.toString());
        }
    }
}
