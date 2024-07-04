package org.example.mappers;

import org.example.models.SalesEmployee;
import org.example.models.SalesEmployeeResponse;

import java.util.List;
import java.util.stream.Collectors;

public class SalesEmployeeMapper {

    public static List<SalesEmployeeResponse> mapSalesEmployeeListToSalesEmployeeResponseList(List<SalesEmployee> salesEmployees) {
        return salesEmployees.stream()
                .map(employee -> new SalesEmployeeResponse(employee.getEmployeeId(), employee.getName(), employee.getSalary(), employee.getBankAccountNumber(), employee.getNatInsurance(), employee.getCommRate()))
                .collect(Collectors.toList());
    }

}