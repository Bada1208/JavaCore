package com.sysoiev_bogdan.javacore.functional_programming.functional_interfaces;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Vasia", "+2343344"));
        greetCustomerFromConsumer.accept(new Customer("Elia", "+3435435"));
    }

    static Consumer<Customer> greetCustomerFromConsumer = customer -> System.out.println("Hello from cosumer " + customer.name + " " + customer.phone);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.name + " " + customer.phone);
    }

    static class Customer {
        private final String name;
        private final String phone;

        public Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
