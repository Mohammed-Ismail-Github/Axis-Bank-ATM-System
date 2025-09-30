package Assignment_2.com.axisbank.account;

public class BankAccount {
    
    // Private data members (Encapsulation)
    private String name;
    private long accountNumber;
    private double balance;
    private int pin;

    // Constructor
    public BankAccount(String name, long accountNumber, double balance, int pin) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    // Getter for name (used for account selection)
    public String getName() {
        return name;
    }

    // Private method to validate PIN
    private boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    // Deposit money
    public void deposit(int enteredPin, double amount) {
        if (validatePin(enteredPin)) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit Successful! Amount: Rs." + amount);
                printBalance(enteredPin);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        } else {
            System.out.println("Wrong PIN! Transaction failed.");
        }
    }

    // Withdraw money (maintaining minimum balance ₹500)
    public void withdraw(int enteredPin, double amount) {
        if (validatePin(enteredPin)) {
            if (amount > 0 && (balance - amount) >= 500) {
                balance -= amount;
                System.out.println("Withdrawal Successful! Amount: Rs." + amount);
                printBalance(enteredPin);
            } else {
                System.out.println("Insufficient balance or minimum balance Rs.500 must be maintained.");
            }
        } else {
            System.out.println("Wrong PIN! Transaction failed.");
        }
    }

    // Print current balance
    public void printBalance(int enteredPin) {
        if (validatePin(enteredPin)) {
            System.out.printf("Account Holder: %s%n", name);
            System.out.printf("Account Number: %d%n", accountNumber);
            System.out.printf("Current Balance: Rs.%.2f%n", balance);
        } else {
            System.out.println("Wrong PIN! Access denied.");
        }
    }
}
