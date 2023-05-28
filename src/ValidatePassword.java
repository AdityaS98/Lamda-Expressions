package com.expression;

import java.util.Scanner;
import java.util.function.Predicate;
public class ValidatePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        Predicate<String> isValidPassword = p -> p.matches("[a-z]{8,}");

        if (isValidPassword.test(password)) {
            System.out.println("Valid password!");
        } else {
            System.out.println("Invalid password!");
        }
    }

}
