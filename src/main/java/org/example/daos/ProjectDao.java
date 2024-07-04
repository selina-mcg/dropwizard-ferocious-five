package org.example.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProjectDao {
    public int createProject(ProjectRequest projectRequest) throws
            SQLException {
        try (Connection connection = DatabaseConnector.getConnection()) {
            String query = "INSERT INTO project (projName, projValue, clientId, projStatus, projCreationDate) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement prepStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            prepStatement.setString(1, projectRequest.getName());
            prepStatement.setString(2, projectRequest.getDescription());
            prepStatement.setDouble(3 , projectRequest.getPrice());

            prepStatement.executeUpdate();

            ResultSet rs = prepStatement.getGeneratedKeys();

            if (rs.next()) {

            }
        }
    }
}
