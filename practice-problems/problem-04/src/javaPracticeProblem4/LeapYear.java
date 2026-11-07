// Practice Problem 4 - Problem 4: Write a program to check if a year is a leap year.
package javaPracticeProblem4;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        System.out.println("GIVEN YEAR: 2024");
        System.out.println();
        System.out.println("OUTPUT:");
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
