package com.epam.task15;

public class TravelAgency {
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
        int[] indexArray = new int[this.travelVouchers.length];
        int[] eatingTimesNumberArray = new int[this.travelVouchers.length];

        for (int i = 0; i < eatingTimesNumberArray.length; i++) {
            eatingTimesNumberArray[i] = this.travelVouchers[i].getEatingTimesNumber();
            indexArray[i] = i;
        }

        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < eatingTimesNumberArray.length - 1; i++) {
                if (fromMinToMax) {
                    if (eatingTimesNumberArray[i] > eatingTimesNumberArray[i + 1]) {
                        swap(eatingTimesNumberArray, i);
                        swap(indexArray, i);
                        flag = true;
                    }
                } else {
                    if (eatingTimesNumberArray[i] < eatingTimesNumberArray[i + 1]) {
                        swap(eatingTimesNumberArray, i);
                        swap(indexArray, i);
                        flag = true;
                    }
                }
            }
        }

        for (int i = 0; i < eatingTimesNumberArray.length; i++) {
            System.out.println(this.travelVouchers[indexArray[i]]);
        }
    }

    public void sortVouchersByDaysNumber(boolean fromMinToMax) {
        int[] indexArray = new int[this.travelVouchers.length];
        int[] daysNumberArray = new int[this.travelVouchers.length];

        for (int i = 0; i < daysNumberArray.length; i++) {
            daysNumberArray[i] = this.travelVouchers[i].getDaysNumber();
            indexArray[i] = i;
        }

        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < daysNumberArray.length - 1; i++) {
                if (fromMinToMax) {
                    if (daysNumberArray[i] > daysNumberArray[i + 1]) {
                        swap(daysNumberArray, i);
                        swap(indexArray, i);
                        flag = true;
                    }
                } else {
                    if (daysNumberArray[i] < daysNumberArray[i + 1]) {
                        swap(daysNumberArray, i);
                        swap(indexArray, i);
                        flag = true;
                    }
                }
            }
        }

        for (int i = 0; i < daysNumberArray.length; i++) {
            System.out.println(this.travelVouchers[indexArray[i]]);
        }
    }

    public void sortVouchersByPrice(boolean fromMinToMax) {
        int[] indexArray = new int[this.travelVouchers.length];
        double[] pricesArray = new double[this.travelVouchers.length];

        for (int i = 0; i < pricesArray.length; i++) {
            pricesArray[i] = this.travelVouchers[i].getVoucherPrice();
            indexArray[i] = i;
        }

        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < pricesArray.length - 1; i++) {
                if (fromMinToMax) {
                    if (pricesArray[i] > pricesArray[i + 1]) {
                        swap(pricesArray, i);
                        swap(indexArray, i);
                        flag = true;
                    }
                } else {
                    if (pricesArray[i] < pricesArray[i + 1]) {
                        swap(pricesArray, i);
                        swap(indexArray, i);
                        flag = true;
                    }
                }
            }
        }

        for (int i = 0; i < pricesArray.length; i++) {
            System.out.println(this.travelVouchers[indexArray[i]]);
        }
    }

    public void swap(int[] array, int i) {
        int number = array[i];
        array[i] = array[i + 1];
        array[i + 1] = number;
    }

    public void swap(double[] array, int i) {
        double number = array[i];
        array[i] = array[i + 1];
        array[i + 1] = number;
    }
}
