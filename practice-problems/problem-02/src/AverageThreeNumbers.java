// Practice Problem 2 - Problem 9: Write a program to compute the average of three floating-point numbers.
import java.util.Scanner;

public class AverageThreeNumbers {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        // Declaration
        double num1, num2, num3, average;

        // Input
        System.out.print("Enter 1st number: ");
        num1 = data.nextDouble();

        System.out.print("Enter 2nd number: ");
        num2 = data.nextDouble();

        System.out.print("Enter 3rd number: ");
        num3 = data.nextDouble();

        // Process
        average = (num1 + num2 + num3) / 3.0;

        // Output
        System.out.println("Average = " + average);

        data.close();
    }
}
