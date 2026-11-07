// Practice Problem 7 - Problem 1: Write a program to create an array and display its elements.
package javaPracticeProblem7;

public class DisplayArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("GIVEN NUMBERS: 10, 20, 30, 40, 50");
        System.out.println("OUTPUT:");
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
