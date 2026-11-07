// Practice Problem 3 - Problem 3: Write a program to demonstrate logical operators (&&, ||, !).
package javaPracticeProblem3;

public class LogicalOperators {
    public static void main(String[] args) {
        int x = 5, y = 12, z = 2;
        System.out.println("GIVEN NUMBERS: ");
        System.out.println("x = " + x + " y = " + y + " z = " + z);
        System.out.println();

        System.out.println("LOGICAL OPERATORS:");
        System.out.println("Using AND Operator:");
        System.out.println("(x < y) && (y > z): ");
        System.out.println("(5 < 12) && (12 > 2): " + ((x < y) && (y > z)));
        System.out.println();
        System.out.println("Using OR Operator:");
        System.out.println("(x < y) || (y < z): ");
        System.out.println("(5 < 12) || (12 < 2): " + ((x < y) || (y < z)));
        System.out.println();
        System.out.println("Using NOT Operator:");
        System.out.println("!(x < y): ");
        System.out.println("!(5 < 12): " + (!(x < y)));
    }
}
