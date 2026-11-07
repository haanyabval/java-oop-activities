// Practice Problem 6 - Problem 5: Write a method that reverses a string.
package javaPracticeProblem6;

public class ReverseStringFunction {
    static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println("WORD: Java");
        System.out.println("OUTPUT:");
        String word = "Java";
        System.out.println("Reversed: " + reverse(word));
    }
}
