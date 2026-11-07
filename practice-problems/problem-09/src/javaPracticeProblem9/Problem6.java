// Practice Problem 9 - Problem 6: Write a program that uses throw to generate an exception if a user's age is below 18.
package javaPracticeProblem9;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = input.nextInt();
        try {
            if (num < 0) {
                throw new Exception("Negative numbers are not allowed!");
            }
            System.out.println("Valid number: " + num);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        input.close();
    }
}
