// Practice Problem 7 - Problem 8: Write a program to copy all elements of one array into another.
package javaPracticeProblem7;

public class CopyArray {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        System.out.println("OUTPUT:");
        System.out.println("Copied array elements:");
        for (int num : copy) {
            System.out.println(num);
        }
    }
}
