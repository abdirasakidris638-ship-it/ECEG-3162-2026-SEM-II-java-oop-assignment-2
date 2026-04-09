package com.jju;

public class SavingsAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.50;

    public SavingsAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        double totalDeduction = amount + TRANSACTION_FEE;
        if (amount > 0 && balance >= totalDeduction) {
            super.withdraw(totalDeduction);
        }
    }
}
