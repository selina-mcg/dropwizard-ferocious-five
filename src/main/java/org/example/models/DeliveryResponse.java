package org.example.models;

public class DeliveryResponse {

    private int employeeId;

    private String name;

    private int salary;

    private int bankAccountNum;

    private String nin;

    public DeliveryResponse(final int employeeId, final String name,
                            final int salary,
                            final int bankAccountNum, final String nin) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.bankAccountNum = bankAccountNum;
        this.nin = nin;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(final int employeeId) {
        this.employeeId = employeeId;
    }

    public String getNin() {
        return nin;
    }

    public void setNin(final String nin) {
        this.nin = nin;
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

    public int getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(final int bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }
}
