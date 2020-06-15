package com.sysoiev_bogdan.javacore.chapter18.collections.objects_saving;

public class Song {

    private int id;
    private String name;
    private String title;

    public Song(int id, String name, String title) {
        this.id = id;
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Song : " + "id=" + id + ", name='" + name + ", title='" + title;
    }


}
