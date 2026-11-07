// Practice Problem 3 - Problem 10: Write a program to calculate (x^2 + y^2) using arithmetic operators only.
package javaPracticeProblem3;

public class SumOfSquares {
    public static void main(String[] args) {
        int x = 4, y = 3;
        int result = (x * x) + (y * y);
        System.out.println("GIVEN NUMBERS: ");
        System.out.println("x = " + x + " y = " + y);
        System.out.println();
        System.out.println("FORMULA: ");
        System.out.println("(4² + 3²): ");
        System.out.println("The Sum of Squares is equal to " + result);
    }
}
