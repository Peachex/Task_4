package com.epam.task14;

public class BankAccount {
    private long accountNumber;
    private double accountBalance;
    private boolean block;

    public BankAccount(long accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public boolean isBlock() {
        return this.block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public String toString() {
        return "\nAccount number: " + this.accountNumber + "\nAccount balance: " + this.accountBalance + "\nAccount status: " +
                (this.block ? "blocked" : "unlocked");
    }
}
