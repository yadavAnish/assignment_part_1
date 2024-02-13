package org.example;
import java.util.Calendar;
import java.util.Date;

public class Time {
    // Data fields
    private int hour;
    private int minute;
    private int second;

    // No-arg constructor sets the time to the current time in GMT
    public Time() {
        // Get the current time in milliseconds since the epoch
        long currentTimeMillis = System.currentTimeMillis();

        // Create a Date object using the current time
        Date currentDate = new Date(currentTimeMillis);

        // Set the hour, minute, and second based on the current time in GMT
        setHour(currentDate.hashCode());
        setMinute(Calendar.MINUTE);
        setSecond(Calendar.SECOND);
    }

    // Getter methods for hour, minute, and second
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Setter methods for hour, minute, and second
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public static void main(String[] args) {
        // Create a Time object (current time in GMT)
        Time currentTime = new Time();

        // Display hour, minute, and second using get methods
        System.out.println("Current Time (GMT):");
        System.out.println("Hour: " + currentTime.getHour());
        System.out.println("Minute: " + currentTime.getMinute());
        System.out.println("Second: " + currentTime.getSecond());
    }
}
