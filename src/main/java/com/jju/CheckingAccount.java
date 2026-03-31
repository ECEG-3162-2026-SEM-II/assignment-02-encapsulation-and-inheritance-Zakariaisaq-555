package com.jju;

public class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.50;

    public CheckingAccount(String accountHolder, double initialBalance) {
        // Student Task: Call the superclass constructor and ensure balance is valid
        super(accountHolder, initialBalance);
    }

    // @Override
    // public void withdraw(double amount) {
    //     // Student Task: Implement withdrawal logic that includes the transaction fee
    //     super.withdraw(amount);
    //     super.withdraw(TRANSACTION_FEE);
    // }

    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + TRANSACTION_FEE;
        if (amount > 0 && balance >= totalAmount) {
            // Using super.withdraw(totalAmount) is the cleanest way to reuse parent logic
            super.withdraw(totalAmount);
        }
    }

    
}
