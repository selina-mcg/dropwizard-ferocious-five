package org.example.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SalesRequest {
    private int employeeId;
    private String name;
    private int salary;
    private int bankAccountNumber;
    private String natInsurance;
    private float commRate;

    @JsonCreator
    public SalesRequest(
            @JsonProperty int employeeId,
            @JsonProperty String name,
            @JsonProperty int salary,
            @JsonProperty int bankAccountNumber,
            @JsonProperty String natInsurance,
            @JsonProperty float commRate
    ) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.bankAccountNumber = bankAccountNumber;
        this.natInsurance = natInsurance;
        this.commRate = commRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getNatInsurance() {
        return natInsurance;
    }

    public void setNatInsurance(String natInsurance) {
        this.natInsurance = natInsurance;
    }

    public float getCommRate() {
        return commRate;
    }

    public void setCommRate(float commRate) {
        this.commRate = commRate;
    }
}
