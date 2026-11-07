// Practice Problem 8 - Problem 7: Write a program to find the perimeter of a square using a global constant for 4.
package javaPracticeProblem8;

public class SquarePerimeter {
    static final int FOUR = 4;

    public static void main(String[] args) {
        double side = 7;
        double perimeter = FOUR * side;
        System.out.println("SIDE: 7");
        System.out.println("OUTPUT:");
        System.out.println("Perimeter of square: " + perimeter);
    }
}
