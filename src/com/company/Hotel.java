package com.company;

import java.util.Arrays;

public class Hotel implements RentForAble{
    private String addressOfHotel;
    private Person[] tourists;

    public Hotel(){

    }

    public Hotel(String addressOfHotel, Person[] tourists) {
        this.addressOfHotel = addressOfHotel;
        this.tourists = tourists;
    }

    @Override
    public void rentForMonth() {
        System.out.println("For hotels pay 80,000 soms per month");
    }

    public String getAddressOfHotel() {
        return addressOfHotel;
    }

    public void setAddressOfHotel(String addressOfHotel) {
        this.addressOfHotel = addressOfHotel;
    }

    public Person[] getTourists() {
        return tourists;
    }

    public void setTourists(Person[] tourists) {
        this.tourists = tourists;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "addressOfHotel='" + addressOfHotel + '\'' +
                ", tourists=" + Arrays.toString(tourists) +
                '}';
    }
}
