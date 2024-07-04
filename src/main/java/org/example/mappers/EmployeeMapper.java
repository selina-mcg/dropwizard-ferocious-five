package org.example.mappers;

import org.example.models.DeliveryEmployee;
import org.example.models.DeliveryResponse;
import org.example.models.Employee;
import org.example.models.EmployeeResponse;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMapper {

    public static List<DeliveryResponse> mapEmployeeListToEmployeeResponseList(List<DeliveryEmployee> deliveryEmployees) {
        return deliveryEmployees.stream()
                .map(employee -> new DeliveryResponse(employee.getEmployeeId(), employee.getName(), employee.getSalary(), employee.getBankAccountNumber(), employee.getNatInsurance()))
                .collect(Collectors.toList());
    }

}