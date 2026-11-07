// Practice Problem 8 - Problem 1: Write a program to compute the diameter and circumference of a circle using a global constant for π.
package javaPracticeProblem8;

public class CircleProperties {
    static final double PI = 3.1416; // Global constant

    public static void main(String[] args) {
        double radius = 5;
        double diameter = 2 * radius;
        double circumference = 2 * PI * radius;

        System.out.println("OUTPUT:");
        System.out.println("Radius: " + radius);
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
    }
}
