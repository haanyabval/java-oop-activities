// Practice Problem 3 - Problem 4: Write a program that computes (a+b)*(a-b).
package javaPracticeProblem3;

public class ComputeExpression {
    public static void main(String[] args) {
        int a = 6, b = 4;
        int result = (a + b) * (a - b);

        System.out.println("GIVEN NUMBERS:");
        System.out.println("a = " + a + " b = " + b);
        System.out.println();
        System.out.println("RESULT: ");
        System.out.println("(6 + 4)(6 - 4): " + result);
    }
}
