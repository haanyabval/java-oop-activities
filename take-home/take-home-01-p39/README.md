# Take Home 1: Employee Salary

**Source:** Take Home, p. 39
**Instructor:** Mr. Ronel Paglomutan
**Documentation:** put the PDF in [`docs/`](docs/) and link it here.

## What it does

The program applies object-oriented programming principles to automate employee payroll computation by encapsulating inputs, overtime rules, tardiness deductions, and salary calculations within a structured class design for clarity and reusability.

## Files

| File | Class |
|------|-------|
| [Employee.java](src/salarypackageoop/Employee.java) | `salarypackageoop.Employee` |
| [SalaryPay.java](src/salarypackageoop/SalaryPay.java) | `salarypackageoop.SalaryPay` |

## How to run

From this folder:

```bash
javac -d out $(find src -name "*.java")
java -cp out salarypackageoop.SalaryPay
```
