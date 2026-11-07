// Practice Problem 6 - Problem 10: Write a method to sort an array of integers in ascending order.
package javaPracticeProblem6;

import java.util.Arrays;

public class SortArrayFunction {
    static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};
        sortArray(numbers);
        System.out.println("GIVEN NUMBERS: 5, 2, 8, 1, 3");
        System.out.println("OUTPUT:");
        System.out.print("Sorted Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
