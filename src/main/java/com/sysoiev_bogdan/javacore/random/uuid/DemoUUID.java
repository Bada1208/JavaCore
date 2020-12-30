package com.sysoiev_bogdan.javacore.random.uuid;

import java.util.UUID;

public class DemoUUID {
    private  String name;

    @Override
    public String toString() {
        return "DemoUUID{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public DemoUUID(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        //DemoUUID demo = new DemoUUID("Bogdan");//java.lang.IllegalArgumentException: Invalid UUID string: Bogdan
        DemoUUID demo = new DemoUUID("38400000-8cf0-11bd-b23e-10b96e4ef00d");
        UUID id1 = UUID.fromString(demo.getName());
        UUID id2 = UUID.randomUUID();
        UUID id3 = UUID.randomUUID();
        System.out.println(id1);
        System.out.println(id2);
        System.out.println(id3);
    }
}
