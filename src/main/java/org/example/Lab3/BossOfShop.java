package org.example.Lab3;


import org.example.Lab3.enums.Gender;

import java.util.Date;

public class BossOfShop extends Employee {
    String nameOfShop;
    Integer amountOfSlave;

    public BossOfShop(String name, String lastName, String secondName, Date birthDate, Gender gender, Double workExperience
            , Double salary, String nameOfShop, Integer amountOfSlave) {
        super(name, lastName, secondName, birthDate, gender, workExperience, salary);
        this.nameOfShop = nameOfShop;
        this.amountOfSlave = amountOfSlave;
    }

    public BossOfShop(String name, String lastName, String secondName, Date birthDate,
                      Gender gender, Double workExperience, Double salary, String nameOfShop) {
        super(name, lastName, secondName, birthDate, gender, workExperience, salary);
        this.nameOfShop = nameOfShop;
    }

    public BossOfShop() {
    }

    public String getNameOfShop() {
        return nameOfShop;
    }

    public void setNameOfShop(String nameOfShop) {
        this.nameOfShop = nameOfShop;
    }

    public Integer getAmountOfSlave() {
        return amountOfSlave;
    }

    public void setAmountOfSlave(Integer amountOfSlave) {
        this.amountOfSlave = amountOfSlave;
    }

    @Override
    public  Double taxCalculation(Employee employee) {
        return employee.salary - (employee.salary / 5);
    }

    @Override
    public String toString() {
        return "BossOfShop{" +
                "nameOfShop='" + nameOfShop + '\'' +
                ", amountOfSlave=" + amountOfSlave +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", workExperience=" + workExperience +
                ", salary=" + salary +
                '}';
    }
}
