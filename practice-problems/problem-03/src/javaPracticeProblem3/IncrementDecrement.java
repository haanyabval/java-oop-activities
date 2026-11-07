// Practice Problem 3 - Problem 5: Write a program to demonstrate increment (++) and decrement (--) operators.
package javaPracticeProblem3;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("GIVEN NUMBER: ");
        System.out.println("a = " + a);
        System.out.println();
        System.out.println("INCREMENT & DECREMENT: ");
        System.out.println("Post-increment: " + "(10++) = " + (a++));
        System.out.println("After post-increment: " + a);
        System.out.println("Pre-increment: " + "(++1O) = " + (++a));
        System.out.println("Post-decrement: " + "(10--) = " + (a--));
        System.out.println("After post-decrement: " + a);
        System.out.println("Pre-decrement: " + "(--10) = " + (--a));
    }
}
