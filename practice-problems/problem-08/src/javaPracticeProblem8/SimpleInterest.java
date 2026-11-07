// Practice Problem 8 - Problem 6: Write a program to solve for simple interest using a global constant for the rate.
package javaPracticeProblem8;

public class SimpleInterest {
    static final double RATE = 0.05; // 5% rate

    public static void main(String[] args) {
        double principal = 10000, time = 2;
        double interest = principal * RATE * time;
        System.out.println("PRINCIPAL: 10000, TIME: 2:");
        System.out.println("OUTPUT:");
        System.out.println("Simple Interest: " + interest);
    }
}
