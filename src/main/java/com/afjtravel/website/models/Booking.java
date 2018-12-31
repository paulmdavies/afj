//java - defining fields for a ---

package com.afjtravel.website.models;

public class Booking {
    private final String reference;
    private final String quoteStatus;
    private final String firstName;
    private final String surname;
    private final String companyName;
    private final String street;
    private final String town;
    private final String county;
    private final String postcode;
    private final String lat;
    private final String lng;
    private final String startTime;
    private final String generatedPrice;

    public Booking(
            String reference,
            String quoteStatus,
            String firstName,
            String surname,
            String companyName,
            String street,
            String town,
            String county,
            String postcode,
            String lat,
            String lng,
            String startTime,
            String generatedPrice
    ) {
        this.reference = reference;
        this.quoteStatus = quoteStatus;
        this.firstName = firstName;
        this.surname = surname;
        this.companyName = companyName;
        this.street = street;
        this.town = town;
        this.county = county;
        this.postcode = postcode;
        this.lat = lat;
        this.lng = lng;
        this.startTime = startTime;
        this.generatedPrice = generatedPrice;
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
    public String getStreet() { return street; }
    public String getTown() { return town; }
    public String getCounty() { return county; }
    public String getPostcode() { return postcode; }
    public String getLat() { return lat; }
    public String getLng() { return lng; }
    public String getStartTime() { return startTime; }
    public String getGeneratedPrice() { return generatedPrice; }



}
