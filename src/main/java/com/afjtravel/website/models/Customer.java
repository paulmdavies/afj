package com.afjtravel.website.models;

public class Customer {
    private final String title;
    private final String firstName;
    private final String surname;
    private final String customerLevel;

    public Customer(String title, String firstName, String surname, String customerLevel) {
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
        this.customerLevel = customerLevel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getTitle() {
        return title;
    }

    public String getSurname() {
        return surname;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }
}

