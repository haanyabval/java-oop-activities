# Practice Problem 9

**Topic:** Exception handling
**Instructor:** Mr. Ronel Paglomutan
**Documentation:** put the PDF in [`docs/`](docs/) and link it here.

## Problems

| # | File | Task |
|---|------|------|
| 1 | [Problem1.java](src/javaPracticeProblem9/Problem1.java) | Write a program that performs division and uses try-catch to handle division by zero. |
| 2 | [Problem2.java](src/javaPracticeProblem9/Problem2.java) | Write a program that accesses an array element and handles ArrayIndexOutOfBoundsException. |
| 3 | [Problem3.java](src/javaPracticeProblem9/Problem3.java) | Write a program that converts user input to an integer and handles NumberFormatException. |
| 4 | [Problem4.java](src/javaPracticeProblem9/Problem4.java) | Write a program that performs array access and division, using multiple catch blocks for different exceptions. |
| 5 | [Problem5.java](src/javaPracticeProblem9/Problem5.java) | Write a program that demonstrates a finally block that always executes after a try-catch. |
| 6 | [Problem6.java](src/javaPracticeProblem9/Problem6.java) | Write a program that uses throw to generate an exception if a user's age is below 18. |
| 7 | [Problem7.java](src/javaPracticeProblem9/Problem7.java) | Write a program that declares a method with throws to handle checked exceptions like file input. |
| 8 | [Problem8.java](src/javaPracticeProblem9/Problem8.java) | Write a program that defines a custom exception and throws it when a negative number is entered. |
| 9 | [Problem9.java](src/javaPracticeProblem9/Problem9.java) | Write a program with nested try-catch blocks to handle multiple exceptions separately. |
| 10 | [Problem10.java](src/javaPracticeProblem9/Problem10.java) | Write a program that validates user input in a loop and uses exception handling to ensure all inputs are valid integers. |

## How to run

From this folder:

```bash
javac -d out $(find src -name "*.java")
java -cp out javaPracticeProblem9.Problem1
```

(Replace the class name to run a different problem.)
