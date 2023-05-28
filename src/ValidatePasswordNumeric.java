package com.expression;

import java.util.Scanner;
import java.util.function.Predicate;


public class ValidatePasswordNumeric {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        /*
         regular expression ".*\\d.*" is used to check if there is at least one numeric digit present in the password.
         The .* before and after \\d means that any characters can exist before and after the numeric digit.
        */
        Predicate<String> isValidPassword = p -> p.length() >= 8 && p.matches(".*[A-Z].*") && p.matches(".*\\d.*");

        if (isValidPassword.test(password)) {
            System.out.println("Valid password!");
        } else {
            System.out.println("Invalid password!");
        }
    }
}