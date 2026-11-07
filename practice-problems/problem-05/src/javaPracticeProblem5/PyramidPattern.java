// Practice Problem 5 - Problem 9: Write a program to display a pyramid pattern using *.
package javaPracticeProblem5;

public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5;
        System.out.println("ROWS: 5");
        System.out.println("OUTPUT:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
