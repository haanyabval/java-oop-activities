// OOP Laboratory - Group Task 2: Employee Net Salary Computation
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        double gross, tax, net;

        System.out.print("Enter Gross Salary: ");
        gross = data.nextDouble();

        if (gross > 20000) tax = gross * 0.10;
        else tax = gross * 0.05;

        net = gross - tax;

        System.out.printf("Tax: %.2f%n", + tax);
        System.out.printf("Net Salary: %.2f%n", + net);

        data.close();
    }
}
