package com.csvandjsondemo.controller.readcsv;

import com.opencsv.CSVReader;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CsvToString {
    private static final String SAMPLE_PATH = "src/main/resources/user.csv";

    public static void main(String[] args) throws IOException {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_PATH));
            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("Name: " + nextRecord[2]);
                System.out.println("Email: " + nextRecord[1]);
                System.out.println("Phone: " + nextRecord[3]);
                System.out.println("Country: " + nextRecord[0] + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
