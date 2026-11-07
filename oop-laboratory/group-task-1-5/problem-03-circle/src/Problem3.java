// OOP Laboratory - Group Task 3: Circle Area and Circumference Calculator
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        double radius, area, circumference;

        System.out.print("Enter Radius: ");
        radius = data.nextDouble();

        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;

        System.out.printf("Area: %.2f%n", + area);
        System.out.printf("Circumference: %.2f%n", + circumference);

        data.close();
    }
}
