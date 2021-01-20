package com.sysoiev_bogdan.javacore.functional_programming.functional_interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _BiConsumer {
    public static void main(String[] args) {
        greetCustomer(new Customer2("Vasia", "+2343344"));
        greetCustomerFromBiConsumer.accept(new Customer2("Elia","+2343344" ),false  );
    }

    static BiConsumer<Customer2,Boolean> greetCustomerFromBiConsumer =
            (customer,showPhone) ->
                    System.out.println("Hello from consumer " + customer.name + " "
                            + (showPhone?customer.phone:"*********"));

    static void greetCustomer(Customer2 customer) {
        System.out.println("Hello " + customer.name + " " + customer.phone);
    }

    static class Customer2 {
        private final String name;
        private final String phone;

        public Customer2(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
