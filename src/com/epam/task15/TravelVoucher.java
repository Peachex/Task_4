package com.epam.task15;

public class TravelVoucher implements Cloneable {
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

    public void setVoucherType(String voucherType) {
        this.voucherType = voucherType;
    }

    public String getTransportType() {
        return this.transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public int getEatingTimesNumber() {
        return this.eatingTimesNumber;
    }

    public void setEatingTimesNumber(int eatingTimesNumber) {
        this.eatingTimesNumber = eatingTimesNumber;
    }

    public int getDaysNumber() {
        return this.daysNumber;
    }

    public void setDaysNumber(int daysNumber) {
        this.daysNumber = daysNumber;
    }

    public double getVoucherPrice() {
        return this.voucherPrice;
    }

    public void setVoucherPrice(double voucherPrice) {
        this.voucherPrice = voucherPrice;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String toString() {
        return "Type: " + this.voucherType + "\nCountry: " + this.countryName + "\nDays number: "
                + this.daysNumber + "\nTransport: " + this.transportType + "\nFood: " + this.eatingTimesNumber
                + (this.eatingTimesNumber > 1 ? " times" : " time") + "\nPrice: " + this.voucherPrice + "\n";
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
