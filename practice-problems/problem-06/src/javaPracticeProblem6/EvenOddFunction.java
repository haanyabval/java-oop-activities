// Practice Problem 6 - Problem 4: Write a method to check if a number is even or odd.
package javaPracticeProblem6;

public class EvenOddFunction {
    static void checkEvenOdd(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is even.");
        else
            System.out.println(num + " is odd.");
    }

    public static void main(String[] args) {
        System.out.println("OUTPUT:");
        System.out.println("NUMBER: 7");
        checkEvenOdd(7);
    }
}
