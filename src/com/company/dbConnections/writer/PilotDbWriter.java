package com.company.dbConnections.writer;

import com.company.dbConnections.DbConnection;
import com.company.entity.Pilot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PilotDbWriter {
    public static final String INSERT = "INSERT INTO pilot (id, first_name, last_name, rank, pilot_id) VALUES(?,?,?,?,?)";

    public static void insert(List<Pilot> pilot) {
        for (Pilot pilots : pilot) {
            insert(pilots);
        }
    }

    public static void insert (Pilot pilots) {
        Connection connection = DbConnection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setInt(1, pilots.getId());
            statement.setString(2, pilots.getFirstName());
            statement.setString(3, pilots.getLastName());
            statement.setString(4, String.valueOf(pilots.getRank()));
            statement.setString(5, pilots.getPilotID());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
