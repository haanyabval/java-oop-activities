// Practice Problem 6 - Problem 9: Write a method that returns the GCD of two numbers.
package javaPracticeProblem6;

public class GCDFunction {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("OUTPUT:");
        System.out.println("GCD of 48 and 18 = " + gcd(48, 18));
    }
}
