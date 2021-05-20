package com.company.io.reader;

import com.company.entity.Airplane;
import com.company.exception.EmptySourceFile;
import com.company.util.AirplaneUtil;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AirplaneDataFileReader {
    private String fileAirplane;

    public AirplaneDataFileReader(String fileAirplane) { this.fileAirplane = fileAirplane; }

    public List<Airplane> read() {
        List<Airplane> airplanes = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileAirplane))) {
            checkFileAirplanes();

            String line;
            while ((line = reader.readLine()) != null) {
                Airplane airplane = AirplaneUtil.toObject(line);
                airplanes.add(airplane);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | EmptySourceFile e ) {
            e.printStackTrace();
        }
        return airplanes;
    }

    private void checkFileAirplanes() throws EmptySourceFile {
        File emptySourceFile = new File(fileAirplane);

        if (emptySourceFile.length() == 0) {
            throw new EmptySourceFile("Этот файл пуст!");
        }
    }
}
