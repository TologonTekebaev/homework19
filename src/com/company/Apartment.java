package com.company;

import java.util.Arrays;

public class Apartment implements ComServiceAble {

    private String addressOfApartment;
    private Person[] family;

    public Apartment(){

    }

    public Apartment(String addressOfApartment, Person[] family) {
        this.addressOfApartment = addressOfApartment;
        this.family = family;
    }

    @Override
    public void comService() {
        System.out.println("For utilities pay 1000 som per month");
    }

    public String getAddressOfApartment() {
        return addressOfApartment;
    }

    public void setAddressOfApartment(String addressOfApartment) {
        this.addressOfApartment = addressOfApartment;
    }

    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "addressOfApartment='" + addressOfApartment + '\'' +
                ", family=" + Arrays.toString(family) +
                '}';
    }
}
