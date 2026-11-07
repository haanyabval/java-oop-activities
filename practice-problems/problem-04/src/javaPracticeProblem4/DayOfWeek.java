// Practice Problem 4 - Problem 10: Write a program to print the day of the week given a number (1-Monday, 7-Sunday).
package javaPracticeProblem4;

public class DayOfWeek {
    public static void main(String[] args) {
        int day = 4;

        System.out.println("GIVEN NUMBER: 4 (4 is Thursday) ");
        System.out.println();
        System.out.println("OUTPUT:");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
        }
    }
}
