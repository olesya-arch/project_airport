package com.company.io.writer;

import com.company.entity.JoinedDataItem;
import com.company.util.JoinedDataItemUtil;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JoinedDataFileWriter {
    private String filepath;

    public JoinedDataFileWriter(String filepath) {
        this.filepath = filepath;
    }

    public void write(List<JoinedDataItem> items) {
        try (FileWriter writer = new FileWriter(filepath)) {
            for (JoinedDataItem item : items) {
                String s = JoinedDataItemUtil.makeString(item);
                writer.write(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
