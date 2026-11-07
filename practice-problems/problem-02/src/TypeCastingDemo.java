// Practice Problem 2 - Problem 5: Write a program to demonstrate type casting (int to double, double to int).
public class TypeCastingDemo {
    public static void main(String[] args) {
        //Declaration
        int intNum = 56;
        double doubleNum = 12.75;

        // int to double
        double convertedDouble = intNum;
        // double to int
        int convertedInt = (int) doubleNum;

        // Output, Print results
        System.out.println("Original int: " + intNum);
        System.out.println("After converting int to double: " + convertedDouble);

        System.out.println("Original double: " + doubleNum);
        System.out.println("After converting double to int: " + convertedInt);
    }
}
