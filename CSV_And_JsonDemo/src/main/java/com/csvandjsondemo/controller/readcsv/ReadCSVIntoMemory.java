package com.csvandjsondemo.controller.readcsv;
import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
public class ReadCSVIntoMemory {
    private static final String PATH = "src/main/resources/user.csv";
    public static void main(String[] args) throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(PATH));
                CSVReader csvReader = new CSVReader(reader);
        ) {
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("name = " + nextRecord[2]);
                System.out.println("email = " + nextRecord[1]);
                System.out.println("phone number = " + nextRecord[3]);
                System.out.println("country = " + nextRecord[0]);
            }
        }
    }
}
