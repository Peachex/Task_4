package com.epam.task15;

public class TravelVoucher {
    private String voucherType;
    private String countryName;
    private String transportType;
    private int eatingTimesNumber;
    private int daysNumber;
    private double voucherPrice;

    public TravelVoucher(String voucherType, String countryName, String transportType, int eatingTimesNumber,
                         int daysNumber, double voucherPrice) {

        this.voucherType = voucherType;
        this.countryName = countryName;
        this.transportType = transportType;
        this.eatingTimesNumber = eatingTimesNumber;
        this.daysNumber = daysNumber;
        this.voucherPrice = voucherPrice;
    }

    public String getVoucherType() {
        return this.voucherType;
    }

    public String getTransportType() {
        return this.transportType;
    }

    public int getEatingTimesNumber() {
        return this.eatingTimesNumber;
    }

    public int getDaysNumber() {
        return this.daysNumber;
    }

    public double getVoucherPrice() {
        return this.voucherPrice;
    }

    public String toString() {
        return "Type: " + this.voucherType + "\nCountry: " + this.countryName + "\nDays number: "
                + this.daysNumber + "\nTransport: " + this.transportType + "\nFood: " + this.eatingTimesNumber
                + (this.eatingTimesNumber > 1 ? " times" : " time") + "\nPrice: " + this.voucherPrice + "\n";
    }
}
