// Practice Problem 2 - Problem 7: Write a program that stores a student's details (name, age, grade) in variables and prints them.
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        // Declaration
        String name;
        int age;
        double grade;

        // Input
        System.out.print("Enter Name: ");
        name = data.nextLine();

        System.out.print("Enter Age: ");
        age = data.nextInt();

        System.out.print("Enter Grade: ");
        grade = data.nextDouble();

        // Output
        System.out.println("===Output===");
        System.out.println("Student: " + name + "| " + "Age: " + age + " | " + "Grade: " + grade);

        data.close();
    }
}
