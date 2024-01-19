package org.example.Lab3;

import org.example.Lab3.enums.Gender;

import java.util.Date;

public  abstract class Employee implements EmployeeMeth , Objects {
    String name;
    String lastName;
    String secondName;
    Date birthDate;
    Gender gender;
    Double workExperience;
    Double salary;

    public Employee(String name, String lastName, String secondName, Date birthDate, Gender gender, Double workExperience, Double salary) {
        this.name = name;
        this.lastName = lastName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.workExperience = workExperience;
        this.salary = salary;
    }

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", workExperience=" + workExperience +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Double getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(Double workExperience) {
        this.workExperience = workExperience;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return java.util.Objects.equals(name, employee.name) && java.util.Objects.equals(lastName, employee.lastName) && java.util.Objects.equals(secondName, employee.secondName) && java.util.Objects.equals(birthDate, employee.birthDate) && gender == employee.gender && java.util.Objects.equals(workExperience, employee.workExperience) && java.util.Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, lastName, secondName, birthDate, gender, workExperience, salary);
    }

    @Override
    public  Double taxCalculation(Employee employee) {
        Double tax = employee.salary - (employee.salary / 6);
        return tax;
    }

    @Override
    public void print() {
        System.out.println("1");
    }
}
