package com.epam.task14;

import java.util.Scanner;

/* 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
   счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
   всем счетам, имеющим положительный и отрицательный балансы отдельно. */
public class Main {
    public static void main(String[] args) {
        Client client = new Client("John White", 25,
                new BankAccount(111_222_333, 190),
                new BankAccount(999_888_777, -1700),
                new BankAccount(444_666_555, 2600),
                new BankAccount(111_111_111, -12));

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\n1)View information.\n2)Unlock account.\n3)Block account.\n4)Check balance.\n5)Find account." +
                    "\n6)Sort accounts.\n7)Exit.\n");
            int toggle = in.nextInt();

            switch (toggle) {
                case 1: {
                    client.printClientAccounts();
                    System.out.println();
                    break;
                }

                case 2: {
                    System.out.println("Input account number to unlock this account: ");
                    client.unlockAccount(in.nextLong());
                    break;
                }

                case 3: {
                    System.out.println("Input account number to block this account: ");
                    client.blockAccount(in.nextLong());
                    break;
                }

                case 4: {
                    client.printBalance();
                    break;
                }

                case 5: {
                    System.out.println("Input account number to find this account: ");
                    client.findAccountByNumber(in.nextLong());
                    break;
                }

                case 6: {
                    System.out.println("Sorted accounts:");
                    client.sortAccountsByBalance();
                    break;
                }

                case 7: {
                    return;
                }
            }
        }
    }
}
