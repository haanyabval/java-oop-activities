// Take Home 1: Employee Salary (Take Home, p. 39)
package salarypackageoop;

import java.util.Scanner;

	class Employee {
	    private String empName;
	    private String empId;
	    private double ratePerHour;
	    private double totalHoursWorked;
	    private double totalTardiness;
	    private double totalOvertime;
	    private double weeklyIncome;
	    private double overtimePay;
	    private double grossIncome;
	    private double totalDeductions;
	    // Constants
	    private final double OVERTIME_RATE = 125.25;
	    private final double OVERTIME_MAX_HOURS = 2;
	    private final double TARDINESS_DEDUCTION_PER_MIN = 5.0;
	    // Constructor
	    public Employee(String empId, String empName, double ratePerHour) {
	        this.empId = empId;
	        this.empName = empName;
	        this.ratePerHour = ratePerHour;
	        this.totalHoursWorked = 0;
	        this.totalOvertime = 0;
	        this.totalTardiness = 0;
	    }
	    // Method to record daily work
	    public void recordDay(double hoursWorked, double overtimeHours) {
	        double tardy = 0;
	        if (hoursWorked < 8) {
	            tardy = (8 - hoursWorked) * 60; // convert to minutes
	            totalTardiness += tardy;
	        }
	        totalHoursWorked += hoursWorked;
	        // Overtime rule: only if no tardiness today
	        if (hoursWorked >= 8 && overtimeHours > 0 && overtimeHours <= OVERTIME_MAX_HOURS) {
	            totalOvertime += overtimeHours;
	        }
	    }
	    // Compute salary details
	    public void computeSalary() {
	        double normalPay = ratePerHour * totalHoursWorked;
	        overtimePay = OVERTIME_RATE * totalOvertime;
	        weeklyIncome = normalPay + overtimePay;
	        // Deduct tardiness
	        double tardinessDeduction = (totalTardiness) * (TARDINESS_DEDUCTION_PER_MIN / 60.0);
	        // Incentives and tardiness notifications
	        if (totalTardiness >= 300) { // 5 hours * 60 mins
	            System.out.println("\n*** HR NOTICE: Employee has reached 5 hours tardiness this week! ***");
	        } else if (totalTardiness == 0) {
	            System.out.println("\n*** Incentive: Employee receives rice subsidy for being punctual! ***");
	            weeklyIncome += 500; // sample incentive
	        }
	        grossIncome = weeklyIncome - tardinessDeduction;
	        // Compute deductions
	        double educational = 525.00;
	        double tax = grossIncome * 0.10;
	        double pagIbig = 100.00;
	        double philhealth = 185.00;
	        double sss = 250.00;
	        totalDeductions = educational + tax + pagIbig + philhealth + sss;
	        grossIncome -= totalDeductions;
	    }
	    // Display info
	    public void displaySalaryInfo() {
	        System.out.println("\n********************************************");
	        System.out.println("PAY PER HOUR : " + ratePerHour);
	        System.out.println("Overtime Rate: " + OVERTIME_RATE + " per hour");
	        System.out.println("********************************************");
	        System.out.println("SALARY INFORMATION");
	        System.out.println("********************************************");
	        System.out.println("Employee ID        : " + empId);
	        System.out.println("Employee Name      : " + empName);
	        System.out.println("Total Hours Worked : " + totalHoursWorked);
	        System.out.println("Overtime Hours     : " + totalOvertime);
	        System.out.println("Employee Tardiness : " + (totalTardiness / 60) + " hours");
	        System.out.println("********************************************");
	        System.out.println("WEEKLY SALARY");
	        System.out.println("********************************************");
	        System.out.printf("Overtime Pay : %.2f%n", overtimePay);
	        System.out.printf("Weekly Income: %.2f%n", weeklyIncome);
	        System.out.printf("Total Deductions: %.2f%n", totalDeductions);
	        System.out.printf("Gross Income : %.2f%n", grossIncome);
	        System.out.println("********************************************");
	    }
	}
