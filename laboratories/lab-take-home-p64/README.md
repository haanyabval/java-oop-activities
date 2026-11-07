# Laboratory Take Home: Bank Account

**Source:** Laboratory Activity Take Home, p. 64
**Instructor:** Mr. Ronel Paglomutan
**Documentation:** put the PDF in [`docs/`](docs/) and link it here.

## What it does

This program demonstrates abstraction and method overriding in Java, using an abstract BankAccount class to define a common structure for different account types (SavingsAccount and CheckingAccount) while allowing each subclass to implement its own specific deposit and withdrawal behaviors.

## Files

| File | Class |
|------|-------|
| [BankAccount.java](src/page64/BankAccount.java) | `page64.BankAccount` |
| [SavingsAccount.java](src/page64/SavingsAccount.java) | `page64.SavingsAccount` |
| [CheckingAccount.java](src/page64/CheckingAccount.java) | `page64.CheckingAccount` |
| [MainAccount.java](src/page64/MainAccount.java) | `page64.MainAccount` |

## How to run

From this folder:

```bash
javac -d out $(find src -name "*.java")
java -cp out page64.MainAccount
```
