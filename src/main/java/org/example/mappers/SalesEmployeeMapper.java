package org.example.mappers;

import java.util.List;
import java.util.stream.Collectors;

public class SalesEmployeeMapper {

    public static List<SalesEmployeeResponse>
    mapSalesEmployeeListToSalesEmployeeResponseList(
            final List<SalesEmployee> salesEmployees) {
        return salesEmployees.stream()
                .map(employee -> new SalesEmployeeResponse(
                        employee.getEmployeeId(), employee.getName(),
                        employee.getSalary(), employee.getBankAccountNumber(),
                        employee.getNatInsurance(), employee.getCommRate()))
                .collect(Collectors.toList());
    }

}
