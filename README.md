# Java OOP Activities

Java programming activities for my Object-Oriented Programming course: lecture activities, laboratory take-homes, practice problems, and take-home exercises.

## Contents

### Practice Problems

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

### Lectures

| Activity | Source |
|----------|--------|
| [Individual Activity: Login System](lectures/individual-activity-p55/) | Individual Activity, p. 55 |

### Laboratories

| Activity | Source |
|----------|--------|
| [Laboratory Take Home: Hybrid Dialog App (JOptionPane)](laboratories/lab-take-home-p27/) | Laboratory Activity Take Home, p. 27 |
| [Laboratory Take Home: Fruit Selling (Encapsulation)](laboratories/lab-take-home-p56/) | Laboratory Activity Take Home, p. 56 |
| [Laboratory Take Home: Shopee Grocery](laboratories/lab-take-home-p60/) | Laboratory Activity Take Home, p. 60 |
| [Laboratory Take Home: Market Shoes](laboratories/lab-take-home-p61/) | Laboratory Activity Take Home, p. 61 |
| [Laboratory Take Home: Vehicle and Car (Inheritance)](laboratories/lab-take-home-p62/) | Laboratory Activity Take Home, p. 62 |
| [Laboratory Take Home: Shape Calculator](laboratories/lab-take-home-p63/) | Laboratory Activity Take Home, p. 63 |
| [Laboratory Take Home: Bank Account](laboratories/lab-take-home-p64/) | Laboratory Activity Take Home, p. 64 |
| [Laboratory Take Home: Bank Account (Abstraction) and Hierarchical Inheritance](laboratories/lab-take-home-p65/) | Laboratory Activity Take Home, p. 65 |
| [Laboratory Take Home: Four OOP Pillars](laboratories/lab-take-home-p66/) | Laboratory Activity Take Home, p. 66 |

More laboratory activities from the OOP laboratory course will be added here.

### Take Home

| Activity | Source |
|----------|--------|
| [Take Home 1: Employee Salary](take-home/take-home-01-p39/) | Take Home, p. 39 |
| [Take Home 2: Login System](take-home/take-home-02-p67/) | Take Home, p. 67 |
| [Take Home 3: Ordering System](take-home/take-home-03-p68/) | Take Home, p. 68 |
| [Take Home 4: Hotel Reservation System](take-home/take-home-04-p69/) | Take Home, p. 69 |
| [Take Home 5: Login Frame (Swing GUI)](take-home/take-home-05-p70/) | Take Home, p. 70 |

## Running any program

Open the activity folder, then:

```bash
javac -d out $(find src -name "*.java")
java -cp out <package.ClassName>
```

Each activity's README lists its classes and which one has `main`. Requires JDK 8 or newer.
