// Practice Problem 4 - Problem 7: Write a program to check if a number is divisible by 2, 3, or both.
package javaPracticeProblem4;

public class DivisibleBy2Or3 {
    public static void main(String[] args) {
        int num = 12;

        System.out.println("GIVEN NUMBER: 12");
        System.out.println();
        System.out.println("OUTPUT:");
        if (num % 2 == 0 && num % 3 == 0)
            System.out.println(num + " is divisible by both 2 and 3.");
        else if (num % 2 == 0)
            System.out.println(num + " is divisible by 2.");
        else if (num % 3 == 0)
            System.out.println(num + " is divisible by 3.");
        else
            System.out.println(num + " is not divisible by 2 or 3.");
    }
}
