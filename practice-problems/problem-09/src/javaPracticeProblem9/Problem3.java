// Practice Problem 9 - Problem 3: Write a program that converts user input to an integer and handles NumberFormatException.
package javaPracticeProblem9;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String userInput = data.nextLine();
        try {
            int number = Integer.parseInt(userInput);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");

            data.close();
        }
    }
}
