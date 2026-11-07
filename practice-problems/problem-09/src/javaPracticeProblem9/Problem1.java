// Practice Problem 9 - Problem 1: Write a program that performs division and uses try-catch to handle division by zero.
package javaPracticeProblem9;

public class Problem1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
