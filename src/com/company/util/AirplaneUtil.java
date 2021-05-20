package com.company.util;

import com.company.entity.Airplane;
import static com.company.io.IoConstants.DELIMITER;

public class AirplaneUtil {

    public static Airplane toObject(String line) {
        String[] airplanesArr = line.split(DELIMITER);

        int id = Integer.parseInt(airplanesArr[0]);
        String brand = airplanesArr[1];
        String model = airplanesArr[2];
        int passengerCapacity = Integer.parseInt(airplanesArr[3]);
        String tailNumber = airplanesArr[4];

        return new Airplane (id, brand, model, passengerCapacity, tailNumber);
    }
}
