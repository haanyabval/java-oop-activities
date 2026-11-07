// Practice Problem 6 - Problem 6: Write a method to find the maximum of three numbers.
package javaPracticeProblem6;

public class MaxOfThreeFunction {
    static int max(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > c ? b : c);
    }

    public static void main(String[] args) {
        System.out.println("GIVEN NUMBERS: 10, 25, 15");
        System.out.println("OUTPUT:");
        System.out.println("The maximum is: " + max(10, 25, 15));
    }
}
