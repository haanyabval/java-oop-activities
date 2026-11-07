// OOP Laboratory - Group Task 4: Body Mass Index (BMI) Calculator (Revised)
import java.util.Scanner;

public class Problem4Revised {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("       BMI CALCULATOR       ");
        System.out.println("----------------------------");

        double weight = readDouble(input, "Enter your weight in kg: ");
        double heightCm = readDouble(input, "Enter your height in cm: ");

        if (heightCm <= 0) {
            System.out.println("Error: Height must be greater than 0.");
            input.close();
            return;
        }

        double heightToMeters = heightCm / 100.0;
        double bmi = weight / (heightToMeters * heightToMeters);

        System.out.printf("Your height in meters: %.2f%n", heightToMeters);
        System.out.printf("BMI result: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight\n");
            System.out.println("Health Tip: Eat more nutritious, calorie-dense foods like rice, nuts, and lean protein to gain healthy weight.");
        } else if (bmi < 25) {
            System.out.println("Category: Normal weight\n");
            System.out.println("Health Tip: Maintain a balanced diet and regular exercise to stay fit and healthy!");
        } else if (bmi < 30) {
            System.out.println("Category: Overweight\n");
            System.out.println("Health Tip: Try to add more physical activity to your routine and reduce sugary or fatty foods.");
        } else {
            System.out.println("Category: Obese\n");
            System.out.println("Health Tip: Consult a nutritionist or doctor for a safe weight-loss plan. Focus on balanced meals and regular workouts.");
        }

        System.out.println("----------------------------");
        System.out.println("Thank you for using the BMI Calculator!");
        input.close();
    }

    private static double readDouble(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = input.nextLine().trim();
            try {
                double v = Double.parseDouble(line);
                if (v < 0) {
                    System.out.println("Please enter a non-negative number.");
                    continue;
                }
                return v;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please try again.");
            }
        }
    }
}
