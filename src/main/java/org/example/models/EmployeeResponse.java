package org.example.models;

public class EmployeeResponse {

    private int employeeId;

    private String Name;

    public EmployeeResponse(int employeeId, String Name) {
        this.employeeId = employeeId;
        this.Name = Name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
