// Practice Problem 1 - Problem 10: Write a program to print your initials in a triangular pattern.
public class InitialsTriangle {
    public static void main(String[] args) {
        //Declaration, inputting initials
        String initials = "HJCB";

        //Process
        for (int i = 0; i < initials.length(); i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(initials.charAt(i) + " ");
            }

            //Output
            System.out.println();
        }
    }
}
