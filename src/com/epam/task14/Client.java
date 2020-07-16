package com.epam.task14;

public class Client {
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
                System.out.println("Blocked successfully.");
            }
        }
    }

    public void unlockAccount(long accountNumber) {
        for (BankAccount bankAccount : this.bankAccounts) {
            if (bankAccount.getAccountNumber() == accountNumber) {
                bankAccount.setBlock(false);
                System.out.println("Unlocked successfully");
            }
        }
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

        System.out.println("Couldn't find...");
    }

    public void sortAccountsByBalance() {
        int[] indexArray = new int[this.bankAccounts.length];
        double[] balanceArray = new double[this.bankAccounts.length];

        for (int i = 0; i < this.bankAccounts.length; i++) {
            balanceArray[i] = this.bankAccounts[i].getAccountBalance();
            indexArray[i] = i;
        }

        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < this.bankAccounts.length - 1; i++) {
                if (balanceArray[i] < balanceArray[i + 1]) {
                    double balance = balanceArray[i];
                    balanceArray[i] = balanceArray[i + 1];
                    balanceArray[i + 1] = balance;

                    int temp = indexArray[i];
                    indexArray[i] = indexArray[i + 1];
                    indexArray[i + 1] = temp;

                    flag = true;
                }
            }
        }

        for (int i = 0; i < bankAccounts.length; i++) {
            System.out.println(bankAccounts[indexArray[i]]);
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
