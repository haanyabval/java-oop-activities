// Practice Problem 9 - Problem 7: Write a program that declares a method with throws to handle checked exceptions like file input.
package javaPracticeProblem9;

import java.io.IOException;

public class Problem7 {
    static void riskyMethod() throws IOException {
        throw new IOException("Simulated I/O Error!");
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (IOException e) {
            System.out.println("Handled checked exception: " + e.getMessage());
        }
    }
}
