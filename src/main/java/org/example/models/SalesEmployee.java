package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SalesEmployee extends Employee {
    @JsonProperty
    private float commRate;

    public SalesEmployee(int employeeId, String name, int salary, int bankAccountNumber, String natInsurance, float commRate) {
        super(employeeId, name, salary, bankAccountNumber, natInsurance);
        this.commRate = commRate;
    }

    public float getCommRate() {
        return commRate;
    }

    public void setCommRate(float commRate) {
        this.commRate = commRate;
    }
}
