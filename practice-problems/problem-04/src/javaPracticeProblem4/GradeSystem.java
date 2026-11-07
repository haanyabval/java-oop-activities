// Practice Problem 4 - Problem 6: Write a program to print a grade based on marks (A, B, C, D, F).
package javaPracticeProblem4;

public class GradeSystem {
    public static void main(String[] args) {
        int marks = 85;

        System.out.println("GRADE: 85");
        System.out.println();
        System.out.println("OUTPUT:");
        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 80)
            System.out.println("Grade: B");
        else if (marks >= 70)
            System.out.println("Grade: C");
        else if (marks >= 60)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
    }
}
