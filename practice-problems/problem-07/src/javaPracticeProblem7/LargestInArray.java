// Practice Problem 7 - Problem 3: Write a program to find the largest element in an array.
package javaPracticeProblem7;

public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {25, 47, 12, 89, 63};
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        System.out.println("GIVEN ARRAYS: 25, 47, 12, 89, 63");
        System.out.println("OUTPUT:");
        System.out.println("Largest element: " + max);
    }
}
