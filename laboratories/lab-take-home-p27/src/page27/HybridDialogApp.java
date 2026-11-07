// Laboratory Take Home: Hybrid Dialog App (JOptionPane) (Laboratory Activity Take Home, p. 27)
package page27;

import javax.swing.JOptionPane;

public class HybridDialogApp {
    public static void main(String[] args) {
        try {
            // ============================================
            // 1. INPUT DIALOG – GET NAME AND AGE
            // ============================================
            String name = JOptionPane.showInputDialog(
                    null,
                    "Enter your name:",
                    "User Information",
                    JOptionPane.QUESTION_MESSAGE
            );
            String ageInput = JOptionPane.showInputDialog(
                    null,
                    "Enter your age:",
                    "User Information",
                    JOptionPane.QUESTION_MESSAGE
            );
            int age = Integer.parseInt(ageInput);
            // ============================================
            // 2. MESSAGE DIALOG – WELCOME MESSAGE
            // ============================================
            JOptionPane.showMessageDialog(
                    null,
                    "Welcome, " + name + "! You are " + age + " years old.",
                    "Welcome Message",
                    JOptionPane.INFORMATION_MESSAGE
            );
            // ============================================
            // 3. CONFIRM DIALOG – ASK USER TO CONTINUE
            // ============================================
            int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to continue to a simple arithmetic operation?",
                    "Proceed Confirmation",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );
            if (confirm == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(
                        null,
                        "Goodbye, " + name + "!",
                        "Exit Message",
                        JOptionPane.INFORMATION_MESSAGE
                );
                System.exit(0);
            }
            // ============================================
            // 4. OPTION DIALOG – CHOOSE OPERATION
            // ============================================
            String[] operations = {"Addition", "Subtraction", "Multiplication", "Division"};
            int choice = JOptionPane.showOptionDialog(
                    null,
                    "Choose an arithmetic operation:",
                    "Operation Selection",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    operations,
                    operations[0]
            );
            // ============================================
            // 5. ASK FOR TWO NUMBERS
            // ============================================
            double num1 = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            null,
                            "Enter first number:",
                            "Input Number 1",
                            JOptionPane.PLAIN_MESSAGE
                    )
            );
            double num2 = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            null,
                            "Enter second number:",
                            "Input Number 2",
                            JOptionPane.PLAIN_MESSAGE
                    )
            );
            // ============================================
            // 6. PERFORM THE SELECTED OPERATION
            // ============================================
            double result = 0;
            String operation = "";
            switch (choice) {
                case 0:
                    result = num1 + num2;
                    operation = "Addition";
                    break;
                case 1:
                    result = num1 - num2;
                    operation = "Subtraction";
                    break;
                case 2:
                    result = num1 * num2;
                    operation = "Multiplication";
                    break;
                case 3:
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed!");
                    }
                    result = num1 / num2;
                    operation = "Division";
                    break;
                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "No operation selected. Exiting program.",
                            "No Selection",
                            JOptionPane.WARNING_MESSAGE
                    );
                    System.exit(0);
            }
            // ============================================
            // 7. DISPLAY RESULT
            // ============================================
            JOptionPane.showMessageDialog(
                    null,
                    "Operation: " + operation + "\nResult: " + result,
                    "Result Display",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } catch (NumberFormatException e) {
            // Invalid numeric input
            JOptionPane.showMessageDialog(
                    null,
                    "Invalid input! Please enter numeric values only.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        } catch (ArithmeticException e) {
            // Division by zero or math error
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Math Error",
                    JOptionPane.ERROR_MESSAGE
            );
        } catch (Exception e) {
            // Any other unexpected error
            JOptionPane.showMessageDialog(
                    null,
                    "An unexpected error occurred: " + e.getMessage(),
                    "Unexpected Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
