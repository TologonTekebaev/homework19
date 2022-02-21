package com.company;

import java.util.Arrays;

public class Person{
    private String name;
    private byte age;

  public Person(){

  }

    public Person(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
         /*  1. Уй-булолор квартирада, общежитиеде жана гостиницада жашашат
        2. Квартирада жашагандар ком услуга толошот
        3. Общежитие менен гостиницада жашагандар аренда толошот
        4. Уй-булолор бир канча адамдан турушат
        5. Кайсы жерде канча адам жашаганын консольго чыгарыныз
        6. Жашоо демек озунун адресин корсотуу*/