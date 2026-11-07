# Take Home 2: Login System

**Source:** Take Home, p. 67
**Instructor:** Mr. Ronel Paglomutan
**Documentation:** put the PDF in [`docs/`](docs/) and link it here.

## What it does

This program demonstrates a comprehensive use of OOP concepts—abstraction (via LoginSystem), encapsulation (in User), inheritance and method overriding (in AdminUser), and polymorphism (method overloading for login)—to create a flexible login system that differentiates between regular users and admins.

## Files

| File | Class |
|------|-------|
| [LoginSystem.java](src/page67/LoginSystem.java) | `page67.LoginSystem` |
| [User.java](src/page67/User.java) | `page67.User` |
| [AdminUser.java](src/page67/AdminUser.java) | `page67.AdminUser` |
| [LoginApp.java](src/page67/LoginApp.java) | `page67.LoginApp` |
| [Main.java](src/page67/Main.java) | `page67.Main` |

## How to run

From this folder:

```bash
javac -d out $(find src -name "*.java")
java -cp out page67.Main
```
