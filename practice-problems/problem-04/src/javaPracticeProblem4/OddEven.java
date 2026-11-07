// Practice Problem 4 - Problem 2: Write a program to check if a number is odd or even.
package javaPracticeProblem4;

public class OddEven {
    public static void main(String[] args) {
        int num = 8;
        System.out.println("GIVEN NUMBER: 8");
        System.out.println();
        System.out.println("OUTPUT:");
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
