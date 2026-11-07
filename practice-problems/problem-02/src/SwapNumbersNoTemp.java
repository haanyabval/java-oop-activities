// Practice Problem 2 - Problem 3: Write a program to swap two integers without using a third variable.
public class SwapNumbersNoTemp {
    public static void main(String[] args) {

        //Declaration
        int a = 10;
        int b = 20;

        //Before
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        //Process: swapping without using a third variable
        a = a + b;  // a now becomes 30
        b = a - b;  // b becomes 10
        a = a - b;  // a becomes 20

        //After
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
