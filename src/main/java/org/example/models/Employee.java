package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
    @JsonProperty
    private int employeeId;

    @JsonProperty
    private String name;

    @JsonProperty
    private int salary;

    @JsonProperty
    private int bankAccountNumber;

    @JsonProperty
    private String natInsurance;


    //private enum employeeType;

    public Employee(int employeeId, String name, int salary, int bankAccountNumber, String natInsurance ) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.bankAccountNumber = bankAccountNumber;
        this.natInsurance = natInsurance;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getNatInsurance() {
        return natInsurance;
    }

    public void setNatInsurance(String natInsurance) {
        this.natInsurance = natInsurance;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
