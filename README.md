# Axis Bank ATM Simulation System 💳

A simple **Java project** demonstrating **Encapsulation**, **Object-Oriented Programming (OOP)**, and **Packages** using an **ATM System** for Axis Bank.

This repository contains two assignments:

1. **Assignment_1** → Encapsulation with a basic ATM system (no packages).
2. **Assignment_2** → ATM system with **packages** and **access modifiers** (industry-style modular design).

---

## 🚀 Features

* **Encapsulation**: Account details (`pin`, `balance`) are private and accessed only through methods.
* **Security**: All transactions require correct PIN validation.
* **Minimum Balance Rule**: Ensures ₹500 is always maintained.
* **Multiple Accounts**: Supports different account holders with independent transactions.
* **Transaction Scenarios**: Shows both successful and failed cases (wrong PIN, insufficient funds).
* **Packages (Assignment_2)**: Demonstrates modular Java programming with `Assignment_2.com.axisbank.account` and `Assignment_2.com.axisbank.app`.

---

## 🛠️ Technologies Used

* **Java (Core OOP Concepts)**
* **Packages & Access Modifiers** (Assignment_2)
* No external libraries/packages (beginner-friendly)

---

## 📂 Project Structure

```
Axis-Bank-ATM-System/
│
├── README.md                 # Project description, features, usage
├── .gitignore                # Ignore build files, IDE configs
│
└── src/
    ├── Assignment_1/           # Assignment_1: Encapsulation
    │   ├── ATMSystem.java
    │   └── BankAccount.java
    │
    └── Assignment_2/           # Assignment_2: Packages + Access Modifiers
        └── com/axisbank/
            ├── account/
            │   └── BankAccount.java
            └── app/
                └── ATMSystem.java
```

---

## 🖥️ How to Run

### Assignment_1 (Basic ATM System with Encapsulation)

1. Navigate to the `src/Assignment_1/` folder.
2. Compile the files:

   ```bash
   javac BankAccount.java ATMSystem.java
   ```
3. Run the program:

   ```bash
   java ATMSystem
   ```
   
📌 *Note: Assignment_1 does not use Java packages. Therefore, IDEs like VS Code or IntelliJ IDEA might display warnings or errors (e.g., "class not found") if you're not compiling/running from the correct folder.
To avoid issues, manually navigate to the src/Assignment_1/ folder and run the program using the terminal as shown above.*

---

### Assignment_2 (ATM System with Packages & Multiple Classes)

1. Navigate to the `src/` folder.
2. Compile using the package structure:

   ```bash
   javac Assignment_2/com/axisbank/account/BankAccount.java Assignment_2/com/axisbank/app/ATMSystem.java
   ```
3. Run the main class with its package name:

   ```bash
   java Assignment_2.com.axisbank.app.ATMSystem
   ```

📌 *Note: In VS Code, you may see a “strike-through” on file names due to package path mismatches — this is only a cosmetic/editor warning and does not affect compilation or execution.*

---

## 📊 Sample Transactions

* ✅ Deposit with correct PIN → Balance updated
* ❌ Deposit with wrong PIN → Transaction denied
* ✅ Withdraw while maintaining ₹500 → Successful
* ❌ Withdraw below ₹500 → Blocked

---

## 🎯 Learning Outcomes

Through these assignments, students will learn:

* How **encapsulation** protects sensitive data.
* How to implement **OOP principles** in real-world applications.
* Basic ATM system logic with security checks.
* How to use **Java packages** and **access modifiers** for modular design.

---

📌 *Created by Mohammed Ismail as part of Java OOP assignments.*