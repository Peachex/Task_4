package com.epam.task14;

public class Client implements Cloneable {
    private String clientName;
    private int clientAge;
    private BankAccount[] bankAccounts;

    public Client(String clientName, int clientAge, BankAccount... bankAccounts) {
        this.clientName = clientName;
        this.clientAge = clientAge;
        this.bankAccounts = bankAccounts;
    }

    public void blockAccount(long accountNumber) {
        for (BankAccount bankAccount : this.bankAccounts) {
            if (bankAccount.getAccountNumber() == accountNumber) {
                bankAccount.setBlock(true);
                System.out.println("\nBlocked successfully.");
                return;
            }
        }

        System.out.println("\nCouldn't find...");
    }

    public void unlockAccount(long accountNumber) {
        for (BankAccount bankAccount : this.bankAccounts) {
            if (bankAccount.getAccountNumber() == accountNumber) {
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

    public void findAccountByNumber(long accountNumber) {
        for (BankAccount bankAccount : this.bankAccounts) {
            if (bankAccount.getAccountNumber() == accountNumber) {
                System.out.println(bankAccount);
                return;
            }
        }

        System.out.println("\nCouldn't find...");
    }

    public void sortAccountsByBalance(boolean fromMinToMax) {
        BankAccount[] bankAccountsClone = this.bankAccounts.clone();

        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < bankAccountsClone.length - 1; i++) {
                if (fromMinToMax) {
                    if (bankAccountsClone[i].getAccountBalance() > bankAccountsClone[i + 1].getAccountBalance()) {
                        BankAccount bankAccount = bankAccountsClone[i];
                        bankAccountsClone[i] = bankAccountsClone[i + 1];
                        bankAccountsClone[i + 1] = bankAccount;
                        flag = true;
                    }
                } else {
                    if (bankAccountsClone[i].getAccountBalance() < bankAccountsClone[i + 1].getAccountBalance()) {
                        BankAccount bankAccount = bankAccountsClone[i];
                        bankAccountsClone[i] = bankAccountsClone[i + 1];
                        bankAccountsClone[i + 1] = bankAccount;
                        flag = true;
                    }
                }
            }
        }

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

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
