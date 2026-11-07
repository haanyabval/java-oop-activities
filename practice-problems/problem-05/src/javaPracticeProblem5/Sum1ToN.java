// Practice Problem 5 - Problem 4: Write a program to find the sum of numbers from 1 to N.
package javaPracticeProblem5;

import java.util.Scanner;

public class Sum1ToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input.nextInt();
        int sum = 0;
        System.out.println("OUTPUT:");
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
        input.close();
    }
}
