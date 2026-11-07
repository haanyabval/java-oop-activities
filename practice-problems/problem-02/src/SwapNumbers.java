// Practice Problem 2 - Problem 2: Write a program to swap two integers using a third variable.
public class SwapNumbers {
    public static void main(String[] args) {

        //Declaration
        int a = 10;
        int b = 20;

        //Before
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Process: swapping using a third variable
        int temp = a;
        a = b;
        b = temp;

        //After
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
