// Practice Problem 7 - Problem 2: Write a program to find the sum of array elements.
package javaPracticeProblem7;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("GIVEN ARRAYS: 5, 10, 15, 20, 25");
        System.out.println("OUTPUT:");
        System.out.println("Sum of array elements: " + sum);
    }
}
