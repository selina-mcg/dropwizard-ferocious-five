package org.example.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeliveryEmployeeRequest {
    private String name;
    private int salary;
    private int bankAccountNumber;
    private String natInsurance;

    @JsonCreator
    public DeliveryEmployeeRequest(
            @JsonProperty("name") String name,
            @JsonProperty("salary") int salary,
            @JsonProperty("bankAccountNumber") int bankAccountNumber,
            @JsonProperty("natInsurance") String natInsurance) {
        this.name = name;
        this.salary = salary;
        this.bankAccountNumber = bankAccountNumber;
        this.natInsurance = natInsurance;
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
}
