// Take Home 1: Employee Salary (Take Home, p. 39)
package salarypackageoop;

import java.util.Scanner;

	public class SalaryPay {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("*** Calculate Employee's Salary per Week ***");
	        System.out.print("Enter Employee Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Employee ID: ");
	        String id = sc.nextLine();
	        System.out.print("Enter Rate per Hour: ");
	        double rate = sc.nextDouble();
	        Employee emp = new Employee(id, name, rate);
	        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
	        for (String day : days) {
	            System.out.println("\n" + day.toUpperCase());
	            System.out.print("Enter hours worked today: ");
	            double hours = sc.nextDouble();
	            double overtime = 0;
	            if (hours >= 8) {
	                System.out.print("Today, you can do overtime work! How many hours? ");
	                overtime = sc.nextDouble();
	            } else {
	                System.out.println("No overtime today!");
	            }
	            emp.recordDay(hours, overtime);
	        }
	        emp.computeSalary();
	        emp.displaySalaryInfo();
	        sc.close();
	    }
	}
