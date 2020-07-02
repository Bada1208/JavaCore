package com.sysoiev_bogdan.javacore.chapter20.io.serialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        //serialization
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\sysoiev_bogdan\\javacore\\chapter20\\io\\serialization\\serial"))) {
            MyClass obj1 = new MyClass("Hello", 23456, 3245.567);
            System.out.println(obj1.toString());
            outputStream.writeObject(obj1);
        } catch (IOException e) {
            System.out.println(e);
        }
        //deserialization
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\sysoiev_bogdan\\javacore\\chapter20\\io\\serialization\\serial"))) {
            MyClass obj2 = (MyClass) inputStream.readObject();
            System.out.println(obj2.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
