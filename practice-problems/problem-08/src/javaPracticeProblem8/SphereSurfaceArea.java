// Practice Problem 8 - Problem 4: Write a program to compute the surface area of a sphere using a global constant for π.
package javaPracticeProblem8;

public class SphereSurfaceArea {
    static final double PI = 3.1416;

    public static void main(String[] args) {
        double radius = 6;
        double surfaceArea = 4 * PI * radius * radius;
        System.out.println("RADIUS: 6");
        System.out.println("OUTPUT:");
        System.out.println("Surface area of sphere: " + surfaceArea);
    }
}
