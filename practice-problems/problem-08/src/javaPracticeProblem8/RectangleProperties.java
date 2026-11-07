// Practice Problem 8 - Problem 2: Write a program to calculate the area and perimeter of a rectangle using a global constant for 2.
package javaPracticeProblem8;

public class RectangleProperties {
    static final int TWO = 2; // Global constant

    public static void main(String[] args) {
        double length = 8, width = 5;
        double area = length * width;
        double perimeter = TWO * (length + width);
        System.out.println("LENGTH: 8, WIDTH: 5");
        System.out.println("OUTPUT:");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
