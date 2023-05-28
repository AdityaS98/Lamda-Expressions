package com.expression;

import java.util.Scanner;
import java.util.function.Predicate;
public class Refactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> isValidFirstName = name -> name.matches("[A-Z][a-zA-Z]{2,}");
        Predicate<String> isValidLastName = name -> name.matches("[A-Z][a-zA-Z]{2,}");
        Predicate<String> isValidEmail = email -> email.matches("[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@[a-zA-Z]+(\\.[a-zA-Z]+)+");
        Predicate<String> isValidMobileNumber = mobile -> mobile.matches("^[0-9]{2} [0-9]{8,}$");
        Predicate<String> isValidPassword = password -> password.length() >= 8 && password.matches(".*[A-Z].*")
                && password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*()].*");

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        if (isValidFirstName.test(firstName)) {
            System.out.println("Valid first name!");
        } else {
            System.out.println("Invalid first name!");
        }

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        if (isValidLastName.test(lastName)) {
            System.out.println("Valid last name!");
        } else {
            System.out.println("Invalid last name!");
        }

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        if (isValidEmail.test(email)) {
            System.out.println("Valid email!");
        } else {
            System.out.println("Invalid email!");
        }

        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine();
        if (isValidMobileNumber.test(mobileNumber)) {
            System.out.println("Valid mobile number!");
        } else {
            System.out.println("Invalid mobile number!");
        }

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        if (isValidPassword.test(password)) {
            System.out.println("Valid password!");
        } else {
            System.out.println("Invalid password!");
        }
    }

}
