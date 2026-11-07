// Practice Problem 8 - Problem 10: Write a program to find the volume of a cube using a global constant for exponent 3.
package javaPracticeProblem8;

public class CubeVolume {
    static final int EXP = 3;

    public static void main(String[] args) {
        double side = 5;
        double volume = Math.pow(side, EXP);
        System.out.println("SIDE: 5");
        System.out.println("5^3");
        System.out.println("OUTPUT: ");
        System.out.println("Volume of cube: " + volume);
    }
}
