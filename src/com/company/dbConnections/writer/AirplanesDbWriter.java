package com.company.dbConnections.writer;

import com.company.dbConnections.DbConnection;
import com.company.entity.Airplane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AirplanesDbWriter {
    public static final String INSERT = "INSERT INTO airplane (id, brand, model, passenger_capacity, tail_number) VALUES(?,?,?,?,?)";

    public static void insert(List<Airplane> airplanes) {
        for (Airplane airplane : airplanes) {
            insert(airplane);
        }
    }

    public static void insert(Airplane airplanes) {
        Connection connection = DbConnection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setInt(1, airplanes.getId());
            statement.setString(2, airplanes.getBrand());
            statement.setString(3, airplanes.getModel());
            statement.setInt(4, airplanes.getPassengerCapacity());
            statement.setString(5, airplanes.getTailNumber());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
