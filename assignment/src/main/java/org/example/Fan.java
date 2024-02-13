package org.example;

public class Fan {
    // Constants for fan speeds
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Instance variables
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Constructor
    public Fan() {
        // Default values
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0; // Default radius
        this.color = "blue"; // Default color
    }

    // Accessor and mutator methods for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Accessor and mutator methods for on
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Accessor and mutator methods for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Accessor and mutator methods for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method to return a string representation of the object
    @Override
    public String toString() {
        return "Fan [speed=" + speed + ", on=" + on + ", radius=" + radius + ", color=" + color + "]";
    }

    public static void main(String[] args) {
        // Create a Fan object
        Fan myFan = new Fan();

        // Assign values
        myFan.setSpeed(FAST);
        myFan.setRadius(10);
        myFan.setColor("yellow");
        myFan.setOn(true);

        // Display the object using the toString method
        System.out.println(myFan.toString());
    }
}
