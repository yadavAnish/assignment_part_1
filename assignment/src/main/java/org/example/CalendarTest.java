package org.example;
import java.util.GregorianCalendar;

public class CalendarTest {
    public static void main(String[] args) {
        // Create a GregorianCalendar instance for the current date
        GregorianCalendar calendar = new GregorianCalendar();

        // Get and display the current year, month, and day
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; // Month is zero-based
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Current Date: " + year + "-" + month + "-" + day);
    }
}
