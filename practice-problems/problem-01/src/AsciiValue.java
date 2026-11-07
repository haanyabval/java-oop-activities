// Practice Problem 1 - Problem 7: Write a program to display the ASCII value of a character.
public class AsciiValue {
    public static void main(String[] args) {

        //Declaration
        char ch = 'L';

        //Process
        int asciiValue = (int) ch;  // convert to ASCII

        //Output
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
    }
}
