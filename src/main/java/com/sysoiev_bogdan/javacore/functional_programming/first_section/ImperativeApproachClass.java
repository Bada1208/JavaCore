package com.sysoiev_bogdan.javacore.functional_programming.first_section;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeApproachClass {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Vasia", Gender.MALE),
                new Person("Gala", Gender.FEMALE),
                new Person("Anton", Gender.MALE),
                new Person("Jenia", Gender.FEMALE)
        );
        System.out.println("Imperative Approach");
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if ((person.gender).equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        for (Person person : females) {
            System.out.println(person);
        }
        System.out.println("Declarative Approach");
        people.stream()
                .filter(person -> (person.gender).equals(Gender.FEMALE))
                .collect(Collectors.toList())
                .forEach(System.out::println);
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
