// Practice Problem 4 - Problem 3: Write a program to find the largest of three numbers.
package javaPracticeProblem4;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 15, b = 25, c = 10;

        System.out.println("GIVEN NUMBERS: ");
        System.out.println("a = 15, b = 25, c = 10");
        System.out.println();
        System.out.println("OUTPUT:");
        if (a >= b && a >= c)
            System.out.println(a + " is the largest.");
        else if (b >= a && b >= c)
            System.out.println(b + " is the largest.");
        else
            System.out.println(c + " is the largest.");
    }
}
