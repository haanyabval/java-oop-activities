// OOP Laboratory - Group Task 1: Calculator Program (Revised)
import java.util.Scanner;

public class Problem1Revised {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("Enter first number: ");
            double num1 = data.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = data.nextDouble();

            boolean reuseNumbers = true;
            while (reuseNumbers) {
                System.out.print("Choose operation (+, -, *, /) or (q)uit: ");
                char op = data.next().charAt(0);
                double result;
                boolean validOp = true;

                switch (op) {
                    case '+':
                        result = num1 + num2;
                        System.out.printf("The Sum is equal to: %.2f%n", result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.printf("The Difference is equal to: %.2f%n", result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.printf("The Product is equal to: %.2f%n", result);
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.printf("The Quotient is equal to: %.2f%n", result);
                        } else {
                            System.out.println("Error: Division by zero");
                        }
                        break;
                    case 'q':
                    case 'Q':
                        reuseNumbers = false;
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid operator");
                        validOp = false;
                }

                if (!running) break;

                if (validOp) {
                    System.out.print("Do you want to try another operator with the same numbers? (y/n): ");
                    String againOp = data.next();
                    if (againOp.equalsIgnoreCase("y")) {
                        // continue inner loop, reuse same numbers
                        continue;
                    } else {
                        System.out.print("Enter new numbers? (y to enter new numbers / n to exit): ");
                        String newNums = data.next();
                        if (newNums.equalsIgnoreCase("y")) {
                            reuseNumbers = false; // outer loop will prompt for numbers again
                        } else {
                            reuseNumbers = false;
                            running = false;
                        }
                    }
                }
            } // end reuseNumbers loop
        } // end running loop

        System.out.println("Program End.");
        data.close();
    }
}
