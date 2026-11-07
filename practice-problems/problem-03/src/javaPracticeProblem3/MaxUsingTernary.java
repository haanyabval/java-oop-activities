// Practice Problem 3 - Problem 8: Write a program to find the maximum of two numbers using the ternary operator.
package javaPracticeProblem3;

public class MaxUsingTernary {
    public static void main(String[] args) {
        int a = 100, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("GIVEN NUMBERS: ");
        System.out.println("a = " + a + " b = " + b);
        System.out.println();
        System.out.println("MAXIMUM OF TWO NUMBERS USING TERNARY OPERATOR");
        System.out.println("(10 > 20) ? 10 : 20");
        System.out.println("Maximum number is: " + max);
    }
}
