package com.expression;

import java.util.Scanner;
import java.util.function.Predicate;

public class ValidateEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        Predicate<String> isValidEmail = e -> e.matches("[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@[a-zA-Z]+(\\.[a-zA-Z]+)+");

        if (isValidEmail.test(email)) {
            System.out.println("Valid email!");
        } else {
            System.out.println("Invalid email!");
        }
    }

}
