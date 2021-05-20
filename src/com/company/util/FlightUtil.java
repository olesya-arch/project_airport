package com.company.util;

import com.company.entity.Flight;
import static com.company.io.IoConstants.DELIMITER;

public class FlightUtil {

    public static Flight toObject(String line) {
        String[] flightsArr = line.split(DELIMITER);

        int id = Integer.parseInt(flightsArr[0]);
        int airplane = Integer.parseInt(flightsArr[1]);
        int pilot = Integer.parseInt(flightsArr[2]);
        String flightDate = flightsArr[3];
        String flightTime = flightsArr[4];
        int numberFlight = Integer.parseInt(flightsArr[5]);

        return new Flight (id, airplane, pilot, flightDate, flightTime, numberFlight);
    }
}