package com.company.io.reader;

import com.company.entity.Flight;
import com.company.exception.EmptySourceFile;
import com.company.util.FlightUtil;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlightDataFileReader {
    private String fileFlight;

    public FlightDataFileReader(String fileFlight) { this.fileFlight = fileFlight; }

    public List<Flight> read() {
        List<Flight> flights = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileFlight))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (line == null || line.isEmpty()) {
                    throw new EmptySourceFile("Этот файл пуст!");
                }
                Flight flight = FlightUtil.toObject(line);
                flights.add(flight);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (EmptySourceFile emptySourceFile) {
            emptySourceFile.printStackTrace();
        }

        return flights;
    }
}
