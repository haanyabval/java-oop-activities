// Practice Problem 4 - Problem 8: Write a program to simulate a simple calculator using a switch.
package javaPracticeProblem4;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        char operator;

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("CHOOSE OPERATOR: ");
        operator = input.next().charAt(0);
        System.out.print("Enter second number: ");
        num2 = input.nextDouble();
        System.out.println();
        System.out.println("OUTPUT:");
        switch (operator) {
            case '+':
                System.out.println("The Sum is equal to: " + (num1 + num2));
                break;
            case '-':
                System.out.println("The difference is equal to: " + (num1 - num2));
                break;
            case '*':
                System.out.println("The product is equal to: " + (num1 * num2));
                break;
            case '/':
                System.out.println("The quotient is equal to: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid operator!");
        }
        input.close();
    }
}
