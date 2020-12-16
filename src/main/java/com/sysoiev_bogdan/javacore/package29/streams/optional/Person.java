package com.sysoiev_bogdan.javacore.package29.streams.optional;

import java.util.Optional;

class Person {
    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

}

class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("vasia", null);
        Person person1 = new Person("vasia", "vasia@gmail.com");

        String email = person
                .getEmail()
                .map(String::toUpperCase)
                .orElse("email not provided");

        String email1 = person1
                .getEmail()
                .map(String::toUpperCase)
                .orElse("email not provided");

        System.out.println(email);
        System.out.println(email1);

        //another sample
        if (person.getEmail().isPresent()) {
            String email3 = person.getEmail().get();
            System.out.println(email3.toUpperCase());
        } else {
            System.out.println("email not provided from if");
        }
    }
}