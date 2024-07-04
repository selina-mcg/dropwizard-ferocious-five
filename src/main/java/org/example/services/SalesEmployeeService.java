package org.example.services;

import org.example.mappers.SalesEmployeeMapper;


import java.sql.SQLException;
import java.util.List;

public class SalesEmployeeService {
    SalesEmployeeDao salesEmployeeDao;

    public SalesEmployeeService(final SalesEmployeeService
                                        salesEmployeeService) {
        this.salesEmployeeDao = salesEmployeeService.salesEmployeeDao;
    }

    public List<SalesEmployeeResponse> getAllSalesEmployees()
            throws SQLException {
        return
            SalesEmployeeMapper.mapSalesEmployeeListToSalesEmployeeResponseList(
            salesEmployeeDao.getAllSalesEmployees());
    }
}

