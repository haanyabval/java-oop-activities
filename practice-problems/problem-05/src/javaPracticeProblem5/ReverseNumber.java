// Practice Problem 5 - Problem 7: Write a program to reverse a number using a loop.
package javaPracticeProblem5;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int rev = 0;
        System.out.println("OUTPUT:");
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + rev);
        input.close();
    }
}
