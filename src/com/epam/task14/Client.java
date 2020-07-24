package com.epam.task14;

import java.util.Arrays;
import java.util.Comparator;

public class Client {
    private String clientName;
    private int clientAge;
    private BankAccount[] bankAccounts;

    public Client(String clientName, int clientAge, BankAccount... bankAccounts) {
        this.clientName = clientName;
        this.clientAge = clientAge;
        this.bankAccounts = bankAccounts;
    }

    public void blockAccount(String accountNumber) {
        for (BankAccount bankAccount : this.bankAccounts) {
            if (bankAccount.getAccountNumber().equals(accountNumber)) {
                bankAccount.setBlock(true);
                System.out.println("\nBlocked successfully.");
                return;
            }
        }
        System.out.println("\nCouldn't find...");
    }

    public void unlockAccount(String accountNumber) {
        for (BankAccount bankAccount : this.bankAccounts) {
            if (bankAccount.getAccountNumber().equals(accountNumber)) {
                bankAccount.setBlock(false);
                System.out.println("\nUnlocked successfully");
                return;
            }
        }
        System.out.println("\nCouldn't find...");
    }

    public double findTotalBalance() {
        return (this.findPositiveBalance() + this.findNegativeBalance());
    }

    public double findPositiveBalance() {
        double positiveBalance = 0;
        for (BankAccount bankAccount : this.bankAccounts) {
            if (!bankAccount.isBlock() && bankAccount.getAccountBalance() > 0) {
                positiveBalance += bankAccount.getAccountBalance();
            }
        }
        return positiveBalance;
    }

    public double findNegativeBalance() {
        double negativeBalance = 0;
        for (BankAccount bankAccount : this.bankAccounts) {
            if (!bankAccount.isBlock() && bankAccount.getAccountBalance() < 0) {
                negativeBalance += bankAccount.getAccountBalance();
            }
        }
        return negativeBalance;
    }

    public void findAccountByNumber(String accountNumber) {
        for (BankAccount bankAccount : this.bankAccounts) {
            if (bankAccount.getAccountNumber().equals(accountNumber)) {
                System.out.println(bankAccount);
                return;
            }
        }
        System.out.println("\nCouldn't find...");
    }

    public void sortAccountsByBalance(boolean fromMinToMax) {
        BankAccount[] bankAccountsClone = this.bankAccounts.clone();
        Arrays.sort(bankAccountsClone, new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount a1, BankAccount a2) {
                int result = Double.compare(a1.getAccountBalance(), a2.getAccountBalance());
                return (fromMinToMax ? 1 : -1) * result;
            }
        });
        for (BankAccount bankAccount : bankAccountsClone) {
            System.out.println(bankAccount);
        }
    }

    public void printClientAccounts() {
        System.out.println("Client name: " + this.clientName);
        System.out.println("Client age: " + this.clientAge);

        for (BankAccount bankAccount : this.bankAccounts) {
            System.out.println(bankAccount);
        }
    }

    public void printBalance() {
        System.out.println("Positive balance: " + this.findPositiveBalance());
        System.out.println("Negative balance: " + this.findNegativeBalance());
        System.out.println("Total balance: " + this.findTotalBalance());
    }
}
