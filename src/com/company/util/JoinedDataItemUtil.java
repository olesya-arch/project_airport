package com.company.util;

import com.company.entity.JoinedDataItem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static com.company.io.IoConstants.DELIMITER;

public class JoinedDataItemUtil {

    public static List<JoinedDataItem> parseResultSet(ResultSet resultSet) throws SQLException {
        List<JoinedDataItem> items = new ArrayList<>();

        while (resultSet.next()) {
            int numberFlight = resultSet.getInt("number_flight");
            String flightDate = resultSet.getString("flight_date");
            String flightTime = resultSet.getString("flight_time");
            String tailNumber = resultSet.getString("tail_number");
            String brand = resultSet.getString("brand");
            String model = resultSet.getString("model");
            int passengerCapacity = resultSet.getInt("passenger_capacity");
            String lastName = resultSet.getString("last_name");
            String firstName = resultSet.getString("first_name");
            String pilotID = resultSet.getString("pilot_id");
            String rank = resultSet.getString("rank");

            JoinedDataItem item = new JoinedDataItem(numberFlight, flightDate, flightTime, tailNumber, brand,
                    model, passengerCapacity, lastName, firstName, pilotID, rank);
            items.add(item);
        }

        return items;
    }

    public static String makeString(JoinedDataItem item) {
        return item.getNumberFlight() + DELIMITER
                + item.getFlightDate() + DELIMITER
                + item.getFlightTime() + DELIMITER
                + item.getTailNumber() + DELIMITER
                + item.getBrand() + " "
                + item.getModel() + DELIMITER
                + item.getPassengerCapacity() + DELIMITER
                + item.getLastName() + " "
                + item.getFirstName().charAt(0) + "." + DELIMITER
                + item.getPilotID() + " " + "("
                + item.getRank() + ")" + "\n";
    }
}
