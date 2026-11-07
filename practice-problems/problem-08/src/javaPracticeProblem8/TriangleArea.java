// Practice Problem 8 - Problem 5: Write a program to calculate the area of a triangle using a global constant for 1/2.
package javaPracticeProblem8;

public class TriangleArea {
    static final double HALF = 0.5;

    public static void main(String[] args) {
        double base = 10, height = 6;
        double area = HALF * base * height;
        System.out.println("BASE: 10, HEIGHT: 6:");
        System.out.println("OUTPUT:");
        System.out.println("Area of triangle: " + area);
    }
}
