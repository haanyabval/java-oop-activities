// Practice Problem 7 - Problem 7: Write a program to search for an element in an array.
package javaPracticeProblem7;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int search = 15;
        boolean found = false;
        for (int num : arr) {
            if (num == search) {
                found = true;
                break;
            }
        }
        System.out.println("GIVEN ARRAYS: 5, 10, 15, 20, 25");
        System.out.println("SEARCH: 15");
        System.out.println("OUTPUT:");
        if (found)
            System.out.println(search + " is found in the array.");
        else
            System.out.println(search + " is not found in the array.");
    }
}
