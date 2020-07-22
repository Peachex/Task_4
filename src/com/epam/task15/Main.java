package com.epam.task15;

import java.util.Scanner;

/* 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
   различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
   возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок. */
public class Main {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency(
                new TravelVoucher("Rest", "Spain", "Boat", 2, 7,
                        21.99),
                new TravelVoucher("Excursions", "Egypt", "Plane", 3, 14,
                        46.55),
                new TravelVoucher("Cruise", "Italy", "Plane", 2, 7,
                        29.29),
                new TravelVoucher("Excursions", "France", "Bus", 1, 3,
                        15),
                new TravelVoucher("Rest", "Germany", "Car", 1, 3,
                        15.5),
                new TravelVoucher("Treatment", "Israel", "Plane", 2, 14,
                        52.95),
                new TravelVoucher("Treatment", "Germany", "Plane", 2, 14,
                        40.05),
                new TravelVoucher("Rest", "Egypt", "Bus", 3, 7,
                        32),
                new TravelVoucher("Shopping", "Spain", "Car", 3, 14,
                        39.99),
                new TravelVoucher("Cruise", "Spain", "Plane", 1, 14,
                        29.99));

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("1)Choose travel voucher.\n2)Sort travel vouchers.\n3)Exit\n");
            int toggle1 = in.nextInt();

            switch (toggle1) {
                case 1: {
                    System.out.println("\nChoose voucher by:\n1)Voucher type.\n2)Transport type.\n3)Eating times number." +
                            "\n4)Days number.\n");
                    int toggle2 = in.nextInt();

                    switch (toggle2) {
                        case 1: {
                            System.out.println("\nSelect voucher type:\n1)Cruise.\n2)Excursions.\n3)Rest.\n4)Shopping.\n5)Treatment.\n");
                            int toggle3 = in.nextInt() - 1;

                            String[] voucherTypeArray = {"Cruise", "Excursions", "Rest", "Shopping", "Treatment"};
                            travelAgency.findVoucherByVoucherType(voucherTypeArray[toggle3]);
                            break;
                        }

                        case 2: {
                            System.out.println("\nSelect transport type:\n1)Boat.\n2)Bus.\n3)Car.\n4)Plane.\n");
                            int toggle3 = in.nextInt() - 1;

                            String[] transportTypeArray = {"Boat", "Bus", "Car", "Plane"};
                            travelAgency.findVoucherByTransportType(transportTypeArray[toggle3]);
                            break;
                        }

                        case 3: {
                            System.out.println("\nSelect eating times number:\n1)Once a day.\n2)Twice a day." +
                                    "\n3)Three times a day.\n");
                            int toggle3 = in.nextInt() - 1;

                            int[] eatingTimesNumberArray = {1, 2, 3};
                            travelAgency.findVoucherByEatingTimesNumber(eatingTimesNumberArray[toggle3]);
                            break;
                        }

                        case 4: {
                            System.out.println("\nSelect days number:\n1)3\n2)7\n3)14\n");
                            int toggle3 = in.nextInt() - 1;

                            int[] daysNumberArray = {3, 7, 14};
                            travelAgency.findVouchersByDaysNumber(daysNumberArray[toggle3]);
                            break;
                        }

                        default: {
                            System.out.println("\nCouldn't find...");
                        }
                    }
                    break;
                }

                case 2: {
                    System.out.println("\nSort travel vouchers by:\n1)Price.\n2)Days number.\n3)Eating times number.\n");
                    int toggle2 = in.nextInt();

                    System.out.println("\n1)From min to max.\n2)From max to min.\n");
                    if (toggle2 == 1) {
                        travelAgency.sortVouchersByPrice(in.nextInt() == 1);

                    } else {
                        if (toggle2 == 2) {
                            travelAgency.sortVouchersByDaysNumber(in.nextInt() == 1);
                        } else {
                            if (toggle2 == 3) {
                                travelAgency.sortVouchersByEatingTimesNumber(in.nextInt() == 1);
                            }
                        }
                    }
                    break;
                }

                case 3: {
                    return;
                }

                default: {
                    System.out.println("\nCouldn't find...");
                }
            }
        }
    }
}
