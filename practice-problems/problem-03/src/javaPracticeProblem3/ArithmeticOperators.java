// Practice Problem 3 - Problem 1: Write a program to demonstrate arithmetic operators.
package javaPracticeProblem3;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 20, b = 4;

        System.out.println("GIVEN NUMBERS:");
        System.out.println("a = " + a + " b = " + b);
        System.out.println();
        System.out.println("ARITHMETIC OPERATORS:");
        System.out.println("Addition: " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
        System.out.println("Multiplication:  " + a + " * " + b + " = " + (a * b));
        System.out.println("Division: " + a + " / " + b + " = " + (a / b));
        System.out.println("Modulus: " + a + " % " + b + " = " + (a % b));
    }
}
