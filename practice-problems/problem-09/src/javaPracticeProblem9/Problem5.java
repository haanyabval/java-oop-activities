// Practice Problem 9 - Problem 5: Write a program that demonstrates a finally block that always executes after a try-catch.
package javaPracticeProblem9;

public class Problem5 {
    public static void main(String[] args) {
        try {
            int value = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error caught in catch block.");
        } finally {
            System.out.println("Finally block always executes!");
        }
    }
}
