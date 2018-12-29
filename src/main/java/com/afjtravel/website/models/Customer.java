package com.afjtravel.website.models;

public class Customer {
    private final String name;
    private final String contactName;
    private final String contactEmail;

    public Customer(String name, String contactName, String contactEmail) {
        this.name = name;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
    }

    public String getName() {
        return name;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }
}

