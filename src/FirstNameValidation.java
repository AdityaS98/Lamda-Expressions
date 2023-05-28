package com.expression;

import java.util.Scanner;
import java.util.function.Predicate;

public class FirstNameValidation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        Predicate<String> isValidFirstName = name -> name.matches("[A-Z][a-zA-Z]{2,}");

        if (isValidFirstName.test(firstName)) {
            System.out.println("Valid first name!");
        } else {
            System.out.println("Invalid first name!");
        }
    }
}

