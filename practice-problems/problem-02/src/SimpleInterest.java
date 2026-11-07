// Practice Problem 2 - Problem 6: Write a program to calculate simple interest.
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaration
        double principal, rate, time, interest;

        // Input
        System.out.print("Enter Principal Amount: ");
        principal = input.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        rate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        time = input.nextDouble();

        // Process: Simple Interest formula
        interest = (principal * rate * time) / 100;

        // Output
        System.out.println("Simple Interest = " + interest);

        input.close();
    }
}
