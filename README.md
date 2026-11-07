# Java OOP Activities

Java programming activities for my Object-Oriented Programming course: lecture activities, laboratory take-homes, practice problems, and take-home exercises.

## Contents

### Practice Problems (done)

| PP | Folder | Topic |
|----|--------|-------|
| 01 | [problem-01](practice-problems/problem-01/) | Basics: output, variables, simple arithmetic |
| 02 | [problem-02](practice-problems/problem-02/) | Data types, swapping, type casting, Scanner input |
| 03 | [problem-03](practice-problems/problem-03/) | Operators (arithmetic, relational, logical, bitwise, ternary) |
| 04 | [problem-04](practice-problems/problem-04/) | Conditional statements (if-else, switch) |
| 05 | [problem-05](practice-problems/problem-05/) | Loops and iteration |
| 06 | [problem-06](practice-problems/problem-06/) | Methods (functions) |
| 07 | [problem-07](practice-problems/problem-07/) | Arrays |
| 08 | [problem-08](practice-problems/problem-08/) | Global constants (static final) |
| 09 | [problem-09](practice-problems/problem-09/) | Exception handling |

### Coming soon

- [`lectures/`](lectures/): Individual Activity (p. 55)
- [`laboratories/`](laboratories/): Laboratory take-home activities (pp. 27, 56, 60-66)
- [`take-home/`](take-home/): Take Home #1-5

## Running any program

```bash
javac -d out $(find src -name "*.java")
java -cp out <package.ClassName>
```

Requires JDK 8 or newer.
