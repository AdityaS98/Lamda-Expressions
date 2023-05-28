package com.expression;

import java.util.Scanner;
import java.util.function.Predicate;

public class ValidateSpecialCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        /*
        The regular expression ".*[!@#$%^&*()].*" is used to check if there is at least one special character present in the password.
         */

        Predicate<String> isValidPassword = p -> p.length() >= 8 && p.matches(".*[A-Z].*") && p.matches(".*\\d.*") && p.matches(".*[!@#$%^&*()].*");

        if (isValidPassword.test(password)) {
            System.out.println("Valid password!");
        } else {
            System.out.println("Invalid password!");
        }
    }

}
