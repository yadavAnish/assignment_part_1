package org.example;

public class Rectangle {
    // Instance variables
    private double width;
    private double height;
    private String color;

    // Constructor
    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Getters and setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return width * height;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Method to display the properties of the rectangle
    public void displayProperties() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Color: " + color);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    public static void main(String[] args) {
        // Create a Rectangle object with width 5, height 50, and color yellow
        Rectangle rectangle = new Rectangle(5, 50, "Yellow");
        Rectangle rectangle2 = new Rectangle(5, 50, "Yellow");


        // Display the properties of the rectangle
        System.out.println("Rectangle 1st Properties:");
        rectangle.displayProperties();

        System.out.println("==================");

        System.out.println("Rectangle 2nd Properties:");
        rectangle2.displayProperties();
    }
}
