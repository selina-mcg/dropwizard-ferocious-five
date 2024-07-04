package org.example.services;

import org.example.daos.DeliveryEmployeeDao;
import org.example.mappers.EmployeeMapper;
import org.example.models.DeliveryEmployeeRequest;
import org.example.models.DeliveryResponse;
import org.example.models.EmployeeResponse;

import java.sql.SQLException;
import java.util.List;

public class DeliveryEmployeeService {
    DeliveryEmployeeDao deliveryEmployeeDao;

    public DeliveryEmployeeService(DeliveryEmployeeDao deliveryEmployeeDao) {
        this.deliveryEmployeeDao = deliveryEmployeeDao;
    }

    public List<DeliveryResponse> getAllDeliveryEmployees() throws SQLException {
        return EmployeeMapper.mapEmployeeListToEmployeeResponseList(deliveryEmployeeDao.getAllEmployees());
    }

    public int createDeliveryEmployee(DeliveryEmployeeRequest deliveryEmployeeRequest) throws SQLException {
        int employeeId = deliveryEmployeeDao.createDeliveryEmployee(deliveryEmployeeRequest);

        if (employeeId == -1) {
            System.out.println("Failed to create delivery employee");
            // THROW FAILEDTOCREATEEXCEPTION
        }

        return employeeId;
    }
}