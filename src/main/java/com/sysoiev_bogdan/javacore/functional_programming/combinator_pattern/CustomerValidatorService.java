package com.sysoiev_bogdan.javacore.functional_programming.combinator_pattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+3");
    }

    private boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 16;
    }

    public boolean isCustomerValid(Customer customer){
        return isEmailValid(customer.getEmail())&&
                isPhoneNumberValid(customer.getPhoneNumber())&&
                isAdult(customer.getDob());
    }
}
