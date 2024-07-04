package org.example.daos;

import org.example.models.SalesEmployee;
import org.example.models.SalesEmployee;
import org.example.models.SalesRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SalesEmployeeDao {

    public int createSalesEmployee(SalesRequest salesRequest) throws SQLException {

        try (Connection connection = DatabaseConnector.getConnection()) {

            int employeeId = -1;

            // Create a new employee
            String insertStEmployee = "INSERT INTO `employee` (name, salary, bank_acc_num, nin) VALUES (?, ?, ?, ?);";

            PreparedStatement st = connection.prepareStatement(insertStEmployee, Statement.RETURN_GENERATED_KEYS);

            st.setString(1, salesRequest.getName());
            st.setInt(2, salesRequest.getSalary());
            st.setInt(3, salesRequest.getBankAccountNumber());
            st.setString(4, salesRequest.getNatInsurance());

            // Get id for new employee
            ResultSet rs = st.getGeneratedKeys();

            if (rs.next()) {
                employeeId =  rs.getInt(1);
            }

            // Insert a new employee into delivery employee table
            String insertStDelivery = "INSERT INTO `salesEmployee` (employeeID, commRate) VALUES (?,0.0);";

            st = connection.prepareStatement(insertStDelivery, Statement.RETURN_GENERATED_KEYS);

            st.setInt(1, employeeId);

            return -1;

        }
    }

    public List<SalesEmployee> getAllSalesEmployees() throws SQLException {
        List<SalesEmployee> salesEmployees = new ArrayList<>();

        // Create db connection
        try (Connection connection = DatabaseConnector.getConnection()) {
            // statement obj that sends SQL statements to db
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(
                    "SELECT employeeID, name, salary, bank_acc_num, nin, commRate FROM employee;");

            // iterate throw each row of the result set
            while (resultSet.next()) {
                SalesEmployee employee = new SalesEmployee(
                        resultSet.getInt("employeeID"),
                        resultSet.getString("name"),
                        resultSet.getInt("salary"),
                        resultSet.getInt("bank_acc_num"),
                        resultSet.getString("nin"),
                        resultSet.getFloat("commRate"));

                salesEmployees.add(employee);
            }
        }
        return salesEmployees;
    }

}