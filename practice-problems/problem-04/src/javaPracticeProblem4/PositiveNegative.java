// Practice Problem 4 - Problem 1: Write a program to check if a number is positive or negative.
package javaPracticeProblem4;

public class PositiveNegative {
    public static void main(String[] args) {
        int num = -7;
        System.out.println("GIVEN NUMBER: -7");
        System.out.println();
        System.out.println("OUTPUT:");
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
