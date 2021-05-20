package com.company.dbConnections.writer;

import com.company.dbConnections.DbConnection;
import com.company.entity.Flight;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FlightsDbWriter {
    public static final String INSERT = "INSERT INTO flight (id, airplane, pilot, flight_date, flight_time, number_flight) VALUES(?,?,?,?,?,?)";

    public static void insert(List<Flight> flights) {
        for (Flight flight : flights) {
            insert(flight);
        }
    }

    public static void insert(Flight flights) {
        Connection connection = DbConnection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setInt(1, flights.getId());
            statement.setInt(2, flights.getAirplane());
            statement.setInt(3, flights.getPilot());
            statement.setString(4, flights.getFlightDate());
            statement.setString(5, flights.getFlightTime());
            statement.setInt(6, flights.getNumberFlight());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
