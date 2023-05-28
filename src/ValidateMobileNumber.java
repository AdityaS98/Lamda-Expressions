package com.expression;

import java.util.Scanner;
import java.util.function.Predicate;

public class ValidateMobileNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine();

        Predicate<String> isValidMobileNumber = m -> m.matches("^[0-9]{2} [0-9]{10}$");

        if (isValidMobileNumber.test(mobileNumber)) {
            System.out.println("Valid mobile number!");
        } else {
            System.out.println("Invalid mobile number!");
        }
    }

}
