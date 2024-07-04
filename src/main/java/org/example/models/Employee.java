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

    public Employee(final int employeeId, final String name, final int salary,
                    final int bankAccountNumber, final String natInsurance) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.bankAccountNumber = bankAccountNumber;
        this.natInsurance = natInsurance;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(final int employeeId) {
        this.employeeId = employeeId;
    }

    public String getNatInsurance() {
        return natInsurance;
    }

    public void setNatInsurance(final String natInsurance) {
        this.natInsurance = natInsurance;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(final int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(final int salary) {
        this.salary = salary;
    }
}
