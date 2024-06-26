package com.microservice_ecommerce.order.order.internal.dto;

import jakarta.validation.constraints.NotNull;

public class BillingDTO {

    @NotNull
    private String first_name;

    @NotNull
    private String last_name;

    @NotNull
    private String address;

    @NotNull
    private String city;

    @NotNull
    private String zip;

    @NotNull
    private String state;

    @NotNull
    private String country;

    public BillingDTO(String first_name, String last_name, String address, String city, String zip, String state, String country) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.country = country;
    }

    public @NotNull String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(@NotNull String first_name) {
        this.first_name = first_name;
    }

    public @NotNull String getLast_name() {
        return last_name;
    }

    public void setLast_name(@NotNull String last_name) {
        this.last_name = last_name;
    }

    public @NotNull String getAddress() {
        return address;
    }

    public void setAddress(@NotNull String address) {
        this.address = address;
    }

    public @NotNull String getCity() {
        return city;
    }

    public void setCity(@NotNull String city) {
        this.city = city;
    }

    public @NotNull String getZip() {
        return zip;
    }

    public void setZip(@NotNull String zip) {
        this.zip = zip;
    }

    public @NotNull String getState() {
        return state;
    }

    public void setState(@NotNull String state) {
        this.state = state;
    }

    public @NotNull String getCountry() {
        return country;
    }

    public void setCountry(@NotNull String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "BillingDTO{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

}
