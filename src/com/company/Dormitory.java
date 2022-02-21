package com.company;

import java.util.Arrays;

public class Dormitory implements RentForAble{
    private String addressOfDormitory;
    private Person[] students;

    public Dormitory(){

    }

    public Dormitory(String addressOfDormitory, Person[] students) {
        this.addressOfDormitory = addressOfDormitory;
        this.students = students;
    }

    @Override
    public void rentForMonth() {
        System.out.println("For dormitories pay 2000 som per month");
    }

    public String getAddressOfDormitory() {
        return addressOfDormitory;
    }

    public void setAddressOfDormitory(String addressOfDormitory) {
        this.addressOfDormitory = addressOfDormitory;
    }

    public Person[] getStudents() {
        return students;
    }

    public void setStudents(Person[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "addressOfDormitory='" + addressOfDormitory + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
