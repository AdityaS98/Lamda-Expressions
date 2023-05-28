package com.expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ValidateMultipleEmails {
    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");

        Predicate<String> isValidEmail = email -> email.matches("[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z]+(\\.[a-zA-Z]+)+");

        for (String email : emails) {
            if (isValidEmail.test(email)) {
                System.out.println(email + " is a valid email.");
            } else {
                System.out.println(email + " is an invalid email.");
            }
        }
    }

}
