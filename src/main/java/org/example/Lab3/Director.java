package org.example.Lab3;
import org.example.Lab3.enums.Gender;

import java.util.Date;

public class Director extends Employee{
    Integer termOfElection;

    public Director(String name, String lastName, String secondName, Date birthDate, Gender gender,
                    Double workExperience, Double salary, Integer termOfElection) {
        super(name, lastName, secondName, birthDate, gender, workExperience, salary);
        this.termOfElection = termOfElection;
    }

    public Director() {

    }

    public Integer getTermOfElection() {
        return termOfElection;
    }

    public void setTermOfElection(Integer termOfElection) {
        this.termOfElection = termOfElection;
    }

    @Override
    public Double taxCalculation(Employee employee) {
        Double tax = employee.salary - (employee.salary / 4);
        return tax;
    }

    @Override
    public String toString() {
        return "Director{" +
                "termOfElection=" + termOfElection +
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
