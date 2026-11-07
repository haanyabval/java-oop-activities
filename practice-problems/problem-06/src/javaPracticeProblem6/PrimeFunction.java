// Practice Problem 6 - Problem 8: Write a method to check if a number is prime.
package javaPracticeProblem6;

public class PrimeFunction {
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 17;
        System.out.println("NUMBER: 17");
        System.out.println("OUTPUT:");
        System.out.println(num + " is prime: " + isPrime(num));
    }
}
