// Practice Problem 6 - Problem 7: Write a method that counts vowels in a string.
package javaPracticeProblem6;

public class CountVowelsFunction {
    static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "Programming";
        System.out.println("TEXT: Programming");
        System.out.println("OUTPUT:");
        System.out.println("Number of vowels: " + countVowels(text));
    }
}
