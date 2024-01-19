package org.example.Lab3;

import org.example.Lab3.enums.Category;
import org.example.Lab3.enums.Gender;

import java.util.Date;

public class Worker extends Employee {
    Integer numberOfShop;
    Category category;

    public Worker(String name, String lastName, String secondName, Date birthDate,
                  Gender gender, Double workExperience, Double salary, Integer numberOfShop, Category category) {
        super(name, lastName, secondName, birthDate, gender, workExperience, salary);
        this.numberOfShop = numberOfShop;
        this.category = category;
    }

    public Worker() {
    }

    public Integer getNumberOfShop() {
        return numberOfShop;
    }

    public void setNumberOfShop(Integer numberOfShop) {
        this.numberOfShop = numberOfShop;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "numberOfShop=" + numberOfShop +
                ", category=" + category +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", workExperience=" + workExperience +
                ", salary=" + salary +
                '}';
    }

    @Override
    public Double taxCalculation(Employee employee) {
        return employee.salary - (employee.salary / 6);
    }
}


