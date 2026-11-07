// Practice Problem 5 - Problem 10: Write a program to print all Armstrong numbers between 1 and 1000.
package javaPracticeProblem5;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");
        for (int num = 1; num <= 1000; num++) {
            int sum = 0, temp = num, digits = 0;
            int n = num;
            while (n != 0) {
                digits++;
                n /= 10;
            }
            n = num;
            while (n != 0) {
                int digit = n % 10;
                sum += Math.pow(digit, digits);
                n /= 10;
            }
            if (sum == temp)
                System.out.println(num);
        }
    }
}
