package com.sysoiev_bogdan.javacore.functional_programming.streams_and_optionals;


import java.util.List;

public class _Streams {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Vasia", Gender.MALE),
                new Person("Gala", Gender.FEMALE),
                new Person("Anton", Gender.MALE),
                new Person("Jenia", Gender.FEMALE)
        );

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        boolean b = people.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println(b);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
