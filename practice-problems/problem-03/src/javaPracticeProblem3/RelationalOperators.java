// Practice Problem 3 - Problem 2: Write a program to demonstrate relational operators.
package javaPracticeProblem3;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("GIVEN NUMBERS: ");
        System.out.println("a = " + a + " b = " + b);
        System.out.println();

        System.out.println("RELATIONAL OPERATORS:");
        System.out.println("Using EQUAL TO Operator");
        System.out.println("10 == 5: " + (a == b));
        System.out.println();
        System.out.println("Using NOT EQUAL TO Operator");
        System.out.println("10 != 5: " + (a != b));
        System.out.println();
        System.out.println("Using GREATER THAN Operator");
        System.out.println("10 > 5: " + (a > b));
        System.out.println();
        System.out.println("Using LESS THAN Operator");
        System.out.println("10 < 5: " + (a < b));
        System.out.println();
        System.out.println("Using GREATER THAN OR EQUAL TO Operator");
        System.out.println("10 >= 5: " + (a >= b));
        System.out.println();
        System.out.println("Using LESS THAN OR EQUAL TO Operator");
        System.out.println("10 <= 5: " + (a <= b));
    }
}
