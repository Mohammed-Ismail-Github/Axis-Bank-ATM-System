# Axis Bank ATM Simulation System 💳

A simple **Java project** demonstrating **Encapsulation** and **Object-Oriented Programming (OOP)** concepts using an **ATM System** for Axis Bank.

This project simulates deposit, withdrawal, and balance inquiry operations with **PIN protection** and a **minimum balance requirement**.

---

## 🚀 Features

* **Encapsulation**: Account details (`pin`, `balance`) are private and accessed only through methods.
* **Security**: All transactions require correct PIN validation.
* **Minimum Balance Rule**: Ensures ₹500 is always maintained.
* **Multiple Accounts**: Supports different account holders with independent transactions.
* **Transaction Scenarios**: Shows both successful and failed cases (wrong PIN, insufficient funds).

---

## 🛠️ Technologies Used

* **Java (Core OOP Concepts)**
* No external libraries/packages (beginner-friendly)

---

## 📂 Project Structure

```
axis-bank-atm-system/
│
├── README.md                 # Project description, features, usage
├── .gitignore                # Ignore build files, IDE configs
│
└── src/                      # Source code folder
    ├── BankAccount.java       # Encapsulated BankAccount class
    └── ATMSystem.java         # Main class (entry point to run program)
```


---

## 🖥️ How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/your-username/axis-bank-atm-system.git
   ```
2. Open in any Java IDE (Eclipse, IntelliJ, VS Code) or use terminal.
3. Compile and run:

   ```bash
   javac BankAccount.java ATMSystem.java
   java ATMSystem
   ```

---

## 📊 Sample Transactions

* ✅ Deposit with correct PIN → Balance updated
* ❌ Deposit with wrong PIN → Transaction denied
* ✅ Withdraw while maintaining ₹500 → Successful
* ❌ Withdraw below ₹500 → Blocked

---

## 🎯 Learning Outcome

This project is designed for students to understand:

* How **encapsulation** protects sensitive data.
* How to implement **OOP principles** in real-world applications.
* Basic ATM system logic with security checks.

---

📌 *Created by Mohammed Ismail as part of Java OOP assignments.*
