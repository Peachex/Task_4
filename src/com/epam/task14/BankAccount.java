package com.epam.task14;

public class BankAccount implements Cloneable {
    private String accountNumber;
    private double accountBalance;
    private boolean isBlock;

    public BankAccount(String accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public boolean isBlock() {
        return this.isBlock;
    }

    public void setBlock(boolean isBlock) {
        this.isBlock = isBlock;
    }

    public String toString() {
        return "\nAccount number: " + this.accountNumber + "\nAccount balance: " + this.accountBalance + "\nAccount status: " +
                (this.isBlock ? "blocked" : "unlocked");
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
