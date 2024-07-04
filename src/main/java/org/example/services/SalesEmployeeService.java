package org.example.services;

import org.example.daos.SalesEmployeeDao;
import org.example.models.SalesEmployee;
import org.example.mappers.SalesEmployeeMapper;
import org.example.models.SalesEmployeeResponse;


import java.sql.SQLException;
import java.util.List;

public class SalesEmployeeService {
    SalesEmployeeDao salesEmployeeDao;

    public SalesEmployeeService(SalesEmployeeService salesEmployeeService) {
        this.salesEmployeeDao = salesEmployeeService.salesEmployeeDao;
    }

    public List<SalesEmployeeResponse> getAllSalesEmployees() throws SQLException {
        return SalesEmployeeMapper.mapSalesEmployeeListToSalesEmployeeResponseList(salesEmployeeDao.getAllSalesEmployees());
    }
//        public SalesEmployee getSalesEmployeeById(int id) throws SQLException {
//            return SalesEmployeeDao.getSalesEmployeeById(id);
//        }

}

