// Practice Problem 9 - Problem 2: Write a program that accesses an array element and handles ArrayIndexOutOfBoundsException.
package javaPracticeProblem9;

public class Problem2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        }
    }
}
