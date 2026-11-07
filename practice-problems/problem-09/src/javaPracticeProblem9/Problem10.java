// Practice Problem 9 - Problem 10: Write a program that validates user input in a loop and uses exception handling to ensure all inputs are valid integers.
package javaPracticeProblem9;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter a valid integer: ");
                number = Integer.parseInt(input.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
        System.out.println("You entered: " + number);
    }
}
