package org.example.models;

public class DeliveryResponse {

    private int employeeId;

    private String Name;

    private int salary;

    private int bankAccountNum;

    private String nin;

    public DeliveryResponse(int employeeId, String name, int salary,
                            int bankAccountNum, String nin) {
        this.employeeId = employeeId;
        Name = name;
        this.salary = salary;
        this.bankAccountNum = bankAccountNum;
        this.nin = nin;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getNin() {
        return nin;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(int bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }
}