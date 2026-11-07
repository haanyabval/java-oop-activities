// Practice Problem 5 - Problem 3: Write a program to print the multiplication table of a given number.
package javaPracticeProblem5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("OUTPUT:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        input.close();
    }
}
