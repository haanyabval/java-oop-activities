// Practice Problem 8 - Problem 9: Write a program to calculate the average of three numbers using a global constant for divisor 3.
package javaPracticeProblem8;

public class AverageOfThree {
    static final int DIVISOR = 3;

    public static void main(String[] args) {
        double a = 90, b = 85, c = 95;
        double average = (a + b + c) / DIVISOR;
        System.out.println("GIVEN NUMBERS: a = 90, b = 85, c = 95 ");
        System.out.println("(90 + 85 + 95)/3 ");
        System.out.println("OUTPUT: ");
        System.out.println("Average: " + average);
    }
}
