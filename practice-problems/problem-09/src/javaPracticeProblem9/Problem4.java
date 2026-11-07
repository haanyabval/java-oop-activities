// Practice Problem 9 - Problem 4: Write a program that performs array access and division, using multiple catch blocks for different exceptions.
package javaPracticeProblem9;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        try {
            int result = arr[2] / 0; // Division by zero
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        }
    }
}
