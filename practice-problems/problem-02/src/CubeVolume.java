// Practice Problem 2 - Problem 10: Write a program to calculate the volume of a cube.
import java.util.Scanner;

public class CubeVolume {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        // Declaration
        double side, volume;

        // Input
        System.out.print("Enter the side length of the cube: ");
        side = data.nextDouble();

        // Process
        volume = side * side * side;

        // Output
        System.out.println("Volume of the cube = " + volume);

        data.close();
    }
}
