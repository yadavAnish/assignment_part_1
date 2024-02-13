package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter Fahrenheit temperature
        System.out.print("Enter temperature in Fahrenheit: ");

        // Read the Fahrenheit temperature as a double
        double fahrenheit = scanner.nextDouble();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Convert Fahrenheit to Celsius using the formula
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
