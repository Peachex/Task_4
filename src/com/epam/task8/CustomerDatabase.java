package com.epam.task8;

public class CustomerDatabase {
    private Customer[] customersArray;

    public CustomerDatabase() {
        customersArray = new Customer[]{new Customer(211345423, 277676546, "John",
                "Orange", "Juice", "Minsk"),
                new Customer(257742856, 298654536, "Ann",
                        "Pine", "Apple", "Vitebsk"),
                new Customer(375435434, 312358775, "Mark",
                        "Lemon", "Tree", "Mogilev"),
                new Customer(348797653, 301957842, "Sandy",
                        "Candy", "Cake", "Brest"),
                new Customer(575652365, 578097653, "Nick",
                        "Chocolate", "Sweet", "Gomel")};
    }

    public void sortCustomers() {
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < customersArray.length - 1; i++) {
                if (customersArray[i].getFirstName().compareToIgnoreCase(customersArray[i + 1].getFirstName()) > 0) {
                    Customer customer = customersArray[i];
                    customersArray[i] = customersArray[i + 1];
                    customersArray[i + 1] = customer;

                    flag = true;
                }
            }
        }
    }

    public void findCustomersByCreditCardNumber(long minLimit, long maxLimit) {
        for (Customer customer : customersArray) {
            if (customer.getCreditCardNumber() >= minLimit && customer.getCreditCardNumber() <= maxLimit) {
                System.out.println(customer);
            }
        }
    }

    public void viewCustomers() {
        for (Customer customer : customersArray) {
            System.out.println(customer);
        }
    }
}
