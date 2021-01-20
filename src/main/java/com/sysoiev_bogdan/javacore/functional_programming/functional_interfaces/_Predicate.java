package com.sysoiev_bogdan.javacore.functional_programming.functional_interfaces;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("+380957703742"));
        System.out.println(isPhoneNumberValid("+3809577037"));
        System.out.println(isPhoneNumberValidPredicate.test("+380957703745"));
        System.out.println(isPhoneNumberValidPredicate.test("+4509577037"));
        System.out.println(
                isPhoneNumberValidPredicate
                        .and(isPhoneNumberContains3Predicate)
                        .test("+380957703745")
        );
        System.out.println(
                isPhoneNumberValidPredicate
                        .or(isPhoneNumberContains3Predicate)
                        .test("+3803745")
        );


    }

    static Predicate<String> isPhoneNumberContains3Predicate =
            phoneNumber -> phoneNumber.contains("3");

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("+380") && phoneNumber.length() == 13;

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+380") && phoneNumber.length() == 13;
    }
}
