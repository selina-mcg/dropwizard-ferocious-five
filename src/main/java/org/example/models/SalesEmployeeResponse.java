package org.example.models;

public class SalesEmployeeResponse {
    private int employeeId;
    private String name;
    private int salary;
    private int bankAccountNumber;
    private String natInsurance;
    private float commRate;

    public SalesEmployeeResponse(int employeeId, String name, int salary,
                                 int bankAccountNumber, String natInsurance, float commRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.bankAccountNumber = bankAccountNumber;
        this.natInsurance = natInsurance;
        this.commRate = commRate;
    }

    public float getCommRate() {
        return commRate;
    }

    public void setCommRate(float commRate) {
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
}
