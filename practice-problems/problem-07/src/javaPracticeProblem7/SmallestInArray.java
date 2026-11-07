// Practice Problem 7 - Problem 4: Write a program to find the smallest element in an array.
package javaPracticeProblem7;

public class SmallestInArray {
    public static void main(String[] args) {
        int[] arr = {15, 7, 22, 3, 19};
        int min = arr[0];
        for (int num : arr) {
            if (num < min)
                min = num;
        }
        System.out.println("GIVEN ARRAYS: 15, 7, 22, 3, 19");
        System.out.println("OUTPUT:");
        System.out.println("Smallest element: " + min);
    }
}
