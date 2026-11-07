// Practice Problem 8 - Problem 3: Write a program to find the volume of a cylinder using a global constant for π.
package javaPracticeProblem8;

public class CylinderVolume {
    static final double PI = 3.1416; // Global constant

    public static void main(String[] args) {
        double radius = 4, height = 10;
        double volume = PI * radius * radius * height;
        System.out.println("RADIUS: 4, HEIGHT: 10");
        System.out.println("OUTPUT:");
        System.out.println("Volume of cylinder: " + volume);
    }
}
