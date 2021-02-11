package com.bootcamp.springboot.model;

public class Address {
    private String street;
    private String barangay;
    private String city;
    private int zipCode;

    public Address() {
    }

    public Address(String street, String barangay, String city, int zipCode) {
        this.street = street;
        this.barangay = barangay;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBarangay() {
        return barangay;
    }

    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
