package com.trial.testproject.generatedata;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.trial.testproject.csvmodel.NameModel;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataGenerationUtil {

    public static Map<Integer, NameModel> NAME_MAP = new HashMap<>();
    public DataGenerationUtil () {
        generateNameModel();
    }

    private void generateNameModel() {
        readAllDataAtOnce("personName.csv");
    }


    public void readAllDataAtOnce(String filePath)
    {
        try {

            // Create an object of filereader class
            // with CSV file as a parameter.

            FileReader filereader = new FileReader(new ClassPathResource(filePath).getFile());
            // create csvReader object
            // and skip first Line
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withSkipLines(1)
                    .build();
            List<String[]> allData = csvReader.readAll();
            int counter = 1;
            // print Data
            for (String[] row : allData) {
                NAME_MAP.put(counter, new NameModel(row[0], row[1], row[1], row[2]));
                counter++;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
