package com.afjtravel.website.models;

public class Quote {
    private final String reference;
    private final String quoteStatus;
    private final String firstName;
    private final String surname;
    private final String companyName;

    public Quote(String reference, String quoteStatus, String firstName, String surname, String companyName) {
        this.reference = reference;
        this.quoteStatus = quoteStatus;
        this.firstName = firstName;
        this.surname = surname;
        this.companyName = companyName;
    }

    public String getReference() {
        return reference;
    }

    public String getQuoteStatus() {
        return quoteStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompanyName() {
        return companyName;
    }
}
