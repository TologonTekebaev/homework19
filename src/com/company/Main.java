package com.company;

public class Main {


    public static void main(String[] args) {

        Person[] family = {new Person("Atasy Marat", (byte) 46),
                new Person("apasy Gulzar", (byte) 44),
                new Person("kyzy Alina", (byte) 17),
                new Person("balasy Arlen", (byte) 13)};

        Person[] tourists = {new Person("Tomas", (byte) 25),
                new Person("Nick", (byte) 24),
                new Person("Jhon", (byte) 25)};
        Person[] students = {new Person("Aibek", (byte) 19),
                new Person("Bektur", (byte) 19),
                new Person("Bakyt", (byte) 18),
                new Person("Eldiar", (byte) 20),
                new Person("Asan", (byte) 20)};

        Apartment apartment = new Apartment("mkr.Tunguch 6(16-kvartira)", family);
        int countOfFamily = 0;
        for (Person fam : family) {
            System.out.println(fam);
            countOfFamily++;
        }
        System.out.println("In Apartment lives "+ countOfFamily +" persons");
        System.out.println(apartment.getAddressOfApartment());
        apartment.comService();
        System.out.println("_______________________________________");


        Dormitory dormitory = new Dormitory("mkr.Jal 34(87-kvartira)", students);
        int countOfStudents = 0;
        for (Person apart : students) {
            System.out.println(apart);
            countOfStudents++;
        }
        System.out.println("In dormitory lives " + countOfStudents + " students");
        System.out.println(dormitory.getAddressOfDormitory());
        dormitory.rentForMonth();
        System.out.println("_______________________________________");

        Hotel hotel = new Hotel("8-mkr, 18(89-kvartira)", tourists);
        int countOfTourist = 0;
        for (Person tour: tourists) {
            System.out.println(tour);
            countOfTourist++;
        }
        System.out.println("In hotel lives " + countOfTourist + " tourists");
        System.out.println(hotel.getAddressOfHotel());
        hotel.rentForMonth();
    }
 }

