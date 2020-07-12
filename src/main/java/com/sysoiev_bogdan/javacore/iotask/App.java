package com.sysoiev_bogdan.javacore.iotask;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException{
        Specialty specialty1 = new Specialty(1, "cooker");
        Specialty specialty2 = new Specialty(2, "coder");
        Specialty specialty3 = new Specialty(3, "driver");
        JavaIORepository repository = new JavaIORepository();
        repository.save(specialty1);
        repository.save(specialty2);
        repository.save(specialty3);
        System.out.println(repository.getAll());
        repository.update(specialty3);
        System.out.println(repository.getAll());
        //repository.deleteById((long) 1);
        System.out.println(repository.getById((long) 2));
        repository.deleteById((long) 2);
        System.out.println(repository.getAll());
    }
}
