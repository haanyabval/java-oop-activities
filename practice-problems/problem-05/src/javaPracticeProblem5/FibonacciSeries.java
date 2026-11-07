// Practice Problem 5 - Problem 6: Write a program to print the Fibonacci series up to N terms.
package javaPracticeProblem5;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = input.nextInt();
        System.out.println("OUTPUT:");
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        input.close();
    }
}
