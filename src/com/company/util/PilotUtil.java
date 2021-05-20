package com.company.util;

import com.company.entity.Pilot;
import com.company.entity.Rank;
import static com.company.io.IoConstants.DELIMITER;

public class PilotUtil {

    public static Pilot toObject (String line) {
        String[] pilotsArr = line.split(DELIMITER);

        int id = Integer.parseInt(pilotsArr[0]);
        String firstName = pilotsArr[1];
        String lastName = pilotsArr[2];
        Rank rank = Rank.valueOf(pilotsArr[3]);
        String pilotID = pilotsArr[4];

        return new Pilot (id, firstName, lastName, rank, pilotID);
    }
}
