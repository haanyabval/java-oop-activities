// Practice Problem 3 - Problem 7: Write a program to check if a number is divisible by both 3 and 5.
package javaPracticeProblem3;

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        int num = 15;
        System.out.println("GIVEN NUMBER:");
        System.out.println("num = " + num);
        System.out.println();

        System.out.println("DIVISIBILITY CHECKER: ");
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by both 3 and 5.");
        } else {
            System.out.println(num + " is not divisible by both 3 and 5.");
        }
    }
}
