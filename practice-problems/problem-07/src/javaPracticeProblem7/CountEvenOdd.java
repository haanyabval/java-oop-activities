// Practice Problem 7 - Problem 6: Write a program to count how many even and odd numbers are in an array.
package javaPracticeProblem7;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("GIVEN ARRAYS: 1, 2, 3, 4, 5, 6");
        System.out.println("OUTPUT:");
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
