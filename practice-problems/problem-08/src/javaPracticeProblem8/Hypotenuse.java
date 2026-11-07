// Practice Problem 8 - Problem 8: Write a program to compute the hypotenuse of a right triangle using a global constant for exponent 2.
package javaPracticeProblem8;

public class Hypotenuse {
    static final int EXP = 2;

    public static void main(String[] args) {
        double base = 3, height = 4;
        double hypotenuse = Math.sqrt(Math.pow(base, EXP) + Math.pow(height, EXP));
        System.out.println("BASE: 3, HEIGHT: 4:");
        System.out.println("OUTPUT:");
        System.out.println("Hypotenuse: " + hypotenuse);
    }
}
