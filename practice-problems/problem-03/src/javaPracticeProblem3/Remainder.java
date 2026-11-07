// Practice Problem 3 - Problem 6: Write a program to find the remainder when one number is divided by another.
package javaPracticeProblem3;

public class Remainder {
    public static void main(String[] args) {
        int num1 = 17, num2 = 5;
        int remainder = num1 % num2;
        System.out.println("GIVEN NUMBERS: ");
        System.out.println("num1 = " + num1 + " num2 = " + num2);
        System.out.println();
        System.out.println("The remainder when " + num1 + " is divided by " + num2 + " = " + remainder);
    }
}
