package org.example;

import java.util.Scanner;

public class questionII {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer between 0 and 1000
        System.out.print("Enter an integer between 0 and 1000: ");

        // Read the integer from the user
        int number = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Calculate the sum of digits
        int sum = 0;
        int originalNumber = number;

        while (number != 0) {
            // Extract the last digit
            int digit = number % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Display the result
        System.out.println("The sum of digits in " + originalNumber + " is: " + sum);
    }
}
