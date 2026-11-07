// Practice Problem 6 - Problem 2: Write a method that accepts two integers and returns their sum.
package javaPracticeProblem6;

public class SumFunction {
    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = sum(10, 20);
        System.out.println("GIVEN NUMBER: 10, 20");
        System.out.println("OUTPUT:");
        System.out.println("The sum is equal to " + result);
    }
}
