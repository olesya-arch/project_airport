package com.company.dbConnections.joiner;

import com.company.dbConnections.DbConnection;
import com.company.entity.JoinedDataItem;
import com.company.util.JoinedDataItemUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DataJoiner {
    public static final String QUERY = "SELECT f.number_flight, f.flight_date, f.flight_time, " +
        "a.tail_number, a.brand, a.model, a.passenger_capacity, p.last_name, p.first_name, p.pilot_id, p.rank " +
            "FROM flight AS f " +
            "INNER JOIN airplane AS a ON f.airplane = a.id " +
            "INNER JOIN pilot AS p ON f.pilot = p.id";

    public static List<JoinedDataItem> getJoinedData() {
        List<JoinedDataItem> result = null;

        Connection connection = DbConnection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(QUERY)) {
            ResultSet resultSet = statement.executeQuery();
            result = JoinedDataItemUtil.parseResultSet(resultSet);

        } catch (SQLException exception) {
           exception.printStackTrace();
        }

        return result;
    }
}
