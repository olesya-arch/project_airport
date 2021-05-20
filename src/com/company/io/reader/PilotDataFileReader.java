package com.company.io.reader;

import com.company.entity.Pilot;
import com.company.exception.EmptySourceFile;
import com.company.util.PilotUtil;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PilotDataFileReader {
    private String filePilot;

    public PilotDataFileReader(String filePilot) { this.filePilot = filePilot; }

    public List<Pilot> read() {
        List<Pilot> pilots = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePilot))) {
            checkFile();

            String line;
            while ((line = reader.readLine()) != null) {
                Pilot pilot = PilotUtil.toObject(line);
                pilots.add(pilot);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | EmptySourceFile e) {
            e.printStackTrace();
        }

        return pilots;
    }

    private void checkFile() throws EmptySourceFile {
        File sourceFile = new File(filePilot);

        if (sourceFile.length() == 0) {
            throw new EmptySourceFile("Пустой файл!");
        }
    }
}

