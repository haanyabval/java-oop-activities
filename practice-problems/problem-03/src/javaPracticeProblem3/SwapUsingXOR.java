// Practice Problem 3 - Problem 9: Write a program to swap two numbers using bitwise XOR.
package javaPracticeProblem3;

public class SwapUsingXOR {
    public static void main(String[] args) {
        int a = 5, b = 7;

        System.out.println("GIVEN NUMBERS: ");
        System.out.println("a = " + a + " b = " + b);
        System.out.println();
        System.out.println("SWAPPING TO NUMBERS USING BITWISE XOR");
        System.out.println("Before Swapping: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("  a = 5 ^ 7;\r\n"
                + "  b = 5 ^ 7;\r\n"
                + "  a = 5 ^ 7;");
        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}
