// Practice Problem 9 - Problem 9: Write a program with nested try-catch blocks to handle multiple exceptions separately.
package javaPracticeProblem9;

public class Problem9 {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 0};
            try {
                int result = arr[0] / arr[1]; // Division by zero
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch: Division by zero!");
            }
            System.out.println(arr[5]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Catch: Array index out of bounds!");
        }
    }
}
