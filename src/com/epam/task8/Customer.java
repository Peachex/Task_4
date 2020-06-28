package com.epam.task8;

public class Customer {
    private static int count = 1;
    private int id = 0;
    private long creditCardNumber;
    private long bankAccountNumber;

    private String firstName;
    private String lastName;
    private String patronymicName;

    private String address;

    public Customer(long creditCardNumber, long bankAccountNumber, String firstName, String lastName, String patronymicName,
                    String address) {
        this.id = count++;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nName: " + firstName + "\nSurname: " + lastName + "\nPatronymic: " + patronymicName + "\nAddress: " + address +
                "\nid: " + id + "\nCredit card number: " + creditCardNumber + "\nBank account number: " + bankAccountNumber;
    }
}
