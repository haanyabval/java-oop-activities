// Practice Problem 7 - Problem 9: Write a program to sort an array in ascending order.
package javaPracticeProblem7;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {45, 12, 78, 34, 23};
        Arrays.sort(arr);
        System.out.println("GIVEN ARRAYS: 45, 12, 78, 34, 23");
        System.out.println("OUTPUT:");
        System.out.println("Sorted array in ascending order:");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
