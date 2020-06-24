package com.csvandjsondemo1;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadCSVIntoMemory {
    private static final String PATH = "src/main/resources/user.csv";

    public static void readAllRecord() throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(PATH));
                CSVReader csvReader = new CSVReader(reader);
        ) {
            List<String[]> records = csvReader.readAll();
            for (String[] record : records) {
                System.out.println("Name : " + record[0]);
                System.out.println("Email : " + record[1]);
                System.out.println("Phone : " + record[2]);
                System.out.println("Country : " + record[3]);
                System.out.println("---------------------------");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(PATH));
                CSVReader csvReader = new CSVReader(reader);
        ) {
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("name = " + nextRecord[0]);
                System.out.println("email = " + nextRecord[1]);
                System.out.println("phone number = " + nextRecord[2]);
                System.out.println("country = " + nextRecord[3]);
            }
        }
        readAllRecord();
    }
}
