package edu.jju_iot;

public class SavingsAccount extends BankAccount {
    private double interestRate; 
  
  // 1. Student Task: Create constructor here 
    public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance);

        if (interestRate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative.");
        }

        this.interestRate = interestRate;
    }
    public void applyInterest() {
        // 2. Student Task: Implement interest application logic here
        double interest = balance * interestRate;

        // Reuse deposit logic (validates and updates balance)
        this.deposit(interest);
    }

  // 3. Student Task: Create getter for interestRate here
    public double getInterestRate() {
        return interestRate;
    }
    
}

