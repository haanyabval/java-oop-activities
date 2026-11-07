// Practice Problem 6 - Problem 3: Write a method that returns the factorial of a number.
package javaPracticeProblem6;

public class FactorialFunction {
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("OUTPUT:");
        System.out.println("Factorial of " + num + " = " + factorial(num));
    }
}
