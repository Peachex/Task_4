package com.epam.task15;

import java.util.Arrays;
import java.util.Comparator;

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
        TravelVoucher[] travelVouchersClone = this.travelVouchers.clone();
        Arrays.sort(travelVouchersClone, new Comparator<TravelVoucher>() {
            @Override
            public int compare(TravelVoucher v1, TravelVoucher v2) {
                int result = Integer.compare(v1.getEatingTimesNumber(), v2.getEatingTimesNumber());
                return (fromMinToMax ? 1 : -1) * result;
            }
        });
        for (TravelVoucher travelVoucher : travelVouchersClone) {
            System.out.println(travelVoucher);
        }
    }

    public void sortVouchersByDaysNumber(boolean fromMinToMax) {
        TravelVoucher[] travelVouchersClone = this.travelVouchers.clone();
        Arrays.sort(travelVouchersClone, new Comparator<TravelVoucher>() {
            @Override
            public int compare(TravelVoucher v1, TravelVoucher v2) {
                int result = Integer.compare(v1.getDaysNumber(), v2.getDaysNumber());
                return (fromMinToMax ? 1 : -1) * result;
            }
        });
        for (TravelVoucher travelVoucher : travelVouchersClone) {
            System.out.println(travelVoucher);
        }
    }

    public void sortVouchersByPrice(boolean fromMinToMax) {
        TravelVoucher[] travelVouchersClone = this.travelVouchers.clone();
        Arrays.sort(travelVouchersClone, new Comparator<TravelVoucher>() {
            @Override
            public int compare(TravelVoucher v1, TravelVoucher v2) {
                int result = Double.compare(v1.getVoucherPrice(), v2.getVoucherPrice());
                return (fromMinToMax ? 1 : -1) * result;
            }
        });
        for (TravelVoucher travelVoucher : travelVouchersClone) {
            System.out.println(travelVoucher);
        }
    }
}
