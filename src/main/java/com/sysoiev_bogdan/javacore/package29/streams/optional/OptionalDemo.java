package com.sysoiev_bogdan.javacore.package29.streams.optional;

import java.util.Optional;
import java.util.Scanner;

public class OptionalDemo {
    public static void main(String[] args) {
        User user = new User(null, 23);
        /*
        Optional<User> userOptional=Optional.of(user.getAge(23));*/
        Scanner scanner = new Scanner(System.in);
       // Integer ageUser = Integer.parseInt(scanner.next());
        String nameUser=scanner.next();
        if(nameUser.equals(user.getName())) System.out.println(user.toString());
        else if(nameUser.equals(null)) System.out.println("try again");
    }
}
