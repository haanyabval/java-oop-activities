// Practice Problem 9 - Problem 8: Write a program that defines a custom exception and throws it when a negative number is entered.
package javaPracticeProblem9;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        try {
            if (age < 18) {
                throw new Exception("Age must be 18 or older!");

            }
            System.out.println("You are eligible!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program ended.");
        }
        input.close();
    }
}
