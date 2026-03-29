package edu.jju_iot;

public class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 2.50;

  // 1. Student Task: Create constructor and call the superclass constructor and ensure balance is valid
        public CheckingAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance); // calls BankAccount constructor
        }
    @Override
    public void withdraw(double amount) {
       // 2. Student Task: Implement withdraw logic here
               if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }

        double totalAmount = amount + TRANSACTION_FEE;

        // Check if balance can cover both amount and fee
        if (totalAmount > balance) {
            throw new IllegalStateException("Insufficient balance (including transaction fee).");
        }

        // Reuse parent logic
        super.withdraw(totalAmount);
    }

    
}

