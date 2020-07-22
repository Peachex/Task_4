package com.epam.task15;

public class TravelAgency implements Cloneable {
    TravelVoucher[] travelVouchers;

    public TravelAgency(TravelVoucher... travelVouchers) {
        this.travelVouchers = travelVouchers;
    }

    public void findVoucherByVoucherType(String voucherType) {
        for (TravelVoucher travelVoucher : this.travelVouchers) {
            if (travelVoucher.getVoucherType().equalsIgnoreCase(voucherType)) {
                System.out.println(travelVoucher);
            }
        }
    }

    public void findVoucherByTransportType(String transportType) {
        for (TravelVoucher travelVoucher : this.travelVouchers) {
            if (travelVoucher.getTransportType().equalsIgnoreCase(transportType)) {
                System.out.println(travelVoucher);
            }
        }
    }

    public void findVoucherByEatingTimesNumber(int eatingTimesNumber) {
        for (TravelVoucher travelVoucher : this.travelVouchers) {
            if (travelVoucher.getEatingTimesNumber() == eatingTimesNumber) {
                System.out.println(travelVoucher);
            }
        }
    }

    public void findVouchersByDaysNumber(int daysNumber) {
        for (TravelVoucher travelVoucher : this.travelVouchers) {
            if (travelVoucher.getDaysNumber() == daysNumber) {
                System.out.println(travelVoucher);
            }
        }
    }

    public void sortVouchersByEatingTimesNumber(boolean fromMinToMax) {
        TravelVoucher[] travelVouchersClone = this.travelVouchers.clone();

        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < travelVouchersClone.length - 1; i++) {
                if (fromMinToMax) {
                    if (travelVouchersClone[i].getEatingTimesNumber() >
                            travelVouchersClone[i + 1].getEatingTimesNumber()) {

                        swap(travelVouchersClone, i);
                        flag = true;
                    }
                } else {
                    if (travelVouchersClone[i].getEatingTimesNumber() <
                            travelVouchersClone[i + 1].getEatingTimesNumber()) {

                        swap(travelVouchersClone, i);
                        flag = true;
                    }
                }
            }
        }

        for (TravelVoucher travelVoucher : travelVouchersClone) {
            System.out.println(travelVoucher);
        }
    }

    public void sortVouchersByDaysNumber(boolean fromMinToMax) {
        TravelVoucher[] travelVouchersClone = this.travelVouchers.clone();

        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < travelVouchersClone.length - 1; i++) {
                if (fromMinToMax) {
                    if (travelVouchersClone[i].getDaysNumber() > travelVouchersClone[i + 1].getDaysNumber()) {
                        swap(travelVouchersClone, i);
                        flag = true;
                    }
                } else {
                    if (travelVouchersClone[i].getDaysNumber() < travelVouchersClone[i + 1].getDaysNumber()) {
                        swap(travelVouchersClone, i);
                        flag = true;
                    }
                }
            }
        }

        for (TravelVoucher travelVoucher : travelVouchersClone) {
            System.out.println(travelVoucher);
        }
    }

    public void sortVouchersByPrice(boolean fromMinToMax) {
        TravelVoucher[] travelVouchersClone = this.travelVouchers.clone();

        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < travelVouchersClone.length - 1; i++) {
                if (fromMinToMax) {
                    if (travelVouchersClone[i].getVoucherPrice() > travelVouchersClone[i + 1].getVoucherPrice()) {
                        swap(travelVouchersClone, i);
                        flag = true;
                    }
                } else {
                    if (travelVouchersClone[i].getVoucherPrice() < travelVouchersClone[i + 1].getVoucherPrice()) {
                        swap(travelVouchersClone, i);
                        flag = true;
                    }
                }
            }
        }

        for (TravelVoucher travelVoucher : travelVouchersClone) {
            System.out.println(travelVoucher);
        }
    }

    public void swap(TravelVoucher[] travelVouchersArray, int i) {
        TravelVoucher travelVoucher = travelVouchersArray[i];
        travelVouchersArray[i] = travelVouchersArray[i + 1];
        travelVouchersArray[i + 1] = travelVoucher;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
