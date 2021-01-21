package com.sysoiev_bogdan.javacore.functional_programming.combinator_pattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerRegistrationValidator extends Function<Customer, CustomerRegistrationValidator.ValidationResult> {

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail()
                .contains("@")
                ? ValidationResult.SUCCESS
                : ValidationResult.EMAIL_IS_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber()
                .contains("+38")
                ? ValidationResult.SUCCESS
                : ValidationResult.PHONE_NUMBER_IS_NOT_VALID;
    }

    static CustomerRegistrationValidator isAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16
                ? ValidationResult.SUCCESS
                : ValidationResult.EMAIL_IS_NOT_VALID;
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        EMAIL_IS_NOT_VALID,
        PHONE_NUMBER_IS_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
