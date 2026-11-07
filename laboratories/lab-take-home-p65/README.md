# Laboratory Take Home: Bank Account (Abstraction) and Hierarchical Inheritance

**Source:** Laboratory Activity Take Home, p. 65
**Instructor:** Mr. Ronel Paglomutan
**Documentation:** put the PDF in [`docs/`](docs/) and link it here.

## What it does

This program demonstrates how abstract classes and method overriding can be used to create a flexible banking system where different account types share common behaviors while implementing their own specific deposit and withdrawal rules.

## Files

| File | Class |
|------|-------|
| [BankAccount.java](src/page65/BankAccount.java) | `page65.BankAccount` |
| [SavingsAccount.java](src/page65/SavingsAccount.java) | `page65.SavingsAccount` |
| [CheckingAccount.java](src/page65/CheckingAccount.java) | `page65.CheckingAccount` |
| [MainAccount.java](src/page65/MainAccount.java) | `page65.MainAccount` |
| [hierarchicalinheritance.java](src/page65/hierarchicalinheritance.java) | `page65.hierarchicalinheritance` |

## How to run

From this folder:

```bash
javac -d out $(find src -name "*.java")
java -cp out page65.MainAccount
java -cp out page65.hierarchicalinheritance
```
