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
            final @JsonProperty("name") String name,
            final @JsonProperty("salary") int salary,
            final @JsonProperty("bankAccountNumber") int bankAccountNumber,
            final @JsonProperty("natInsurance") String natInsurance) {
        this.name = name;
        this.salary = salary;
        this.bankAccountNumber = bankAccountNumber;
        this.natInsurance = natInsurance;
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

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(final int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getNatInsurance() {
        return natInsurance;
    }

    public void setNatInsurance(final String natInsurance) {
        this.natInsurance = natInsurance;
    }
}
