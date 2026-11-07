// Practice Problem 4 - Problem 5: Write a program to check if a character is a vowel or consonant.
package javaPracticeProblem4;

public class VowelConsonant {
    public static void main(String[] args) {
        char ch = 'e';
        System.out.println("GIVEN VOWEL: e");
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println(ch + " is a vowel.");
        else
            System.out.println(ch + " is a consonant.");
    }
}
