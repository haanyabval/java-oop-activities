// Practice Problem 7 - Problem 10: Write a program to find the second largest element in an array.
package javaPracticeProblem7;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 25, 8, 36, 45};
        Arrays.sort(arr);
        System.out.println("GIVEN ARRAYS: 10, 25, 8, 36, 45");
        System.out.println("OUTPUT:");
        int secondLargest = arr[arr.length - 2];
        System.out.println("Second largest element: " + secondLargest);
    }
}
