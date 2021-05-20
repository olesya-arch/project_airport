package com.company;

import com.company.dbConnections.joiner.DataJoiner;
import com.company.dbConnections.writer.AirplanesDbWriter;
import com.company.dbConnections.writer.FlightsDbWriter;
import com.company.dbConnections.writer.PilotDbWriter;
import com.company.entity.JoinedDataItem;
import com.company.io.reader.AirplaneDataFileReader;
import com.company.io.reader.FlightDataFileReader;
import com.company.io.reader.PilotDataFileReader;
import static com.company.io.IoConstants.PILOT_SOURCE_FILE;
import static com.company.io.IoConstants.AIRPLANE_SOURCE_FILE;
import static com.company.io.IoConstants.FLIGHT_SOURCE_FILE;
import static com.company.io.IoConstants.RESULT_FILE;
import com.company.entity.Pilot;
import com.company.entity.Airplane;
import com.company.entity.Flight;
import com.company.io.writer.JoinedDataFileWriter;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Старт записи данных в таблицу!");

        PilotDataFileReader pilotsDataFileReader = new PilotDataFileReader(PILOT_SOURCE_FILE);
        List<Pilot> pilot = pilotsDataFileReader.read();

        PilotDbWriter.insert(pilot);

        AirplaneDataFileReader airplanesDataFileReader = new AirplaneDataFileReader(AIRPLANE_SOURCE_FILE);
        List<Airplane> airplane = airplanesDataFileReader.read();

        AirplanesDbWriter.insert(airplane);

        FlightDataFileReader flightsDataFileReader = new FlightDataFileReader(FLIGHT_SOURCE_FILE);
        List<Flight> flight = flightsDataFileReader.read();

        FlightsDbWriter.insert(flight);

        System.out.println("Запись в таблицу завершена!");

        System.out.println("Получение результирующей выборки!");

        List<JoinedDataItem> items = DataJoiner.getJoinedData();

        System.out.println(items);

        System.out.println("Запись результирующей выборки в файл!");

        JoinedDataFileWriter dataFileWriter = new JoinedDataFileWriter(RESULT_FILE);
        dataFileWriter.write(items);

        System.out.println("Запись завершена!");
    }
}
