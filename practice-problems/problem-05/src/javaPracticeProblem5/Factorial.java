// Practice Problem 5 - Problem 5: Write a program to calculate the factorial of a number.
package javaPracticeProblem5;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        long fact = 1;
        System.out.println("OUTPUT:");
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
        input.close();
    }
}
