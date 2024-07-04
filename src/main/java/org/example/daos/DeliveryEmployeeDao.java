package org.example.daos;

import org.example.models.DeliveryEmployee;
import org.example.models.DeliveryEmployeeRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeliveryEmployeeDao {
    public int createDeliveryEmployee(DeliveryEmployeeRequest deliveryRequest) throws
            SQLException {
        try (Connection connection = DatabaseConnector.getConnection()) {
            int employeeId = -1;

            // Create a new employee
            String insertSt = "INSERT INTO `employee` (name, salary, bank_acc_num, nin) VALUES (?, ?, ?, ?);";

            PreparedStatement st = connection.prepareStatement(insertSt, Statement.RETURN_GENERATED_KEYS);

            st.setString(1, deliveryRequest.getName());
            st.setInt(2, deliveryRequest.getSalary());
            st.setInt(3, deliveryRequest.getBankAccountNumber());
            st.setString(4, deliveryRequest.getNatInsurance());

            st.executeUpdate();

            // Get id for new employee
            ResultSet rs = st.getGeneratedKeys();

            if (rs.next()) {
                employeeId =  rs.getInt(1);
            }
//
            // Insert a new employee into delivery employee table
            insertSt = "INSERT INTO `deliveryEmployee` (techLead, employeeID) VALUES (?, ?);";

            st = connection.prepareStatement(insertSt);

            // Set tech lead role as none ie. 0
            st.setInt(1, 0);
            st.setInt(2, employeeId);

            st.executeUpdate();

            return employeeId;
        }
    }

    public List<DeliveryEmployee> getAllEmployees() throws SQLException {
        List<DeliveryEmployee> deliveryEmployees = new ArrayList<>();

        // Create db connection
        try (Connection connection = DatabaseConnector.getConnection()) {
            // statement obj that sends SQL statements to db
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(
                    "SELECT employeeID, name, salary, bank_acc_num, nin FROM employee;");

            // iterate throw each row of the result set
            while (resultSet.next()) {
                DeliveryEmployee employee = new DeliveryEmployee(
                        resultSet.getInt("employeeID"),
                        resultSet.getString("name"),
                        resultSet.getInt("salary"),
                        resultSet.getInt("bank_acc_num"),
                        resultSet.getString("nin"));

                deliveryEmployees.add(employee);
            }
        }
        return deliveryEmployees;
    }
}
