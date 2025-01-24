package org.jobber.data;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.*;

public class AppData {
    private final static String FILE_PATH = "src/main/data.csv";
    private final static int GENERATION_COUNT = 250;
    private static Iterable<CSVRecord> recordData;

    static {
        try {
            //generateCSV(); //to make new data
            readDataCSV();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readDataCSV() throws IOException {
        Reader in = new FileReader(FILE_PATH);

        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                .setSkipHeaderRecord(true)
                .setHeader(new String[]{"first_name", "last_name"})
                .build();

        recordData = csvFormat.parse(in);

        System.out.println("Successfully loaded records.");
    }

    public static void generateCSV() throws IOException {
        FileWriter out = new FileWriter(FILE_PATH);

        String[] headers = {
                "first_name",
                "last_name",
                "city",
                "state",
                "skills",
                "degree",
                "applied_listing_ids"
        };

        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                .setHeader(headers)
                .build();

        final CSVPrinter printer = new CSVPrinter(out, csvFormat);

        for (int i = 0; i < GENERATION_COUNT; i++) {
            String state = getRandElement(FieldStorage.getStateCitiesMap().keySet());
            String city = getRandElement(FieldStorage.getStateCitiesMap().get(state));

            String[] skillArr = {getRandElement(FieldStorage.skills), getRandElement(FieldStorage.skills), getRandElement(FieldStorage.skills)};

            printer.printRecord(
                    getRandElement(FieldStorage.firstNames),
                    getRandElement(FieldStorage.lastNames),
                    city,
                    state,
                    String.format("%s, %s, %s", skillArr[0], skillArr[1], skillArr[2]),
                    getRandElement(FieldStorage.degrees),
                    FieldStorage.getRandAppliedIds()
            );
        }

        printer.flush();
    }

    public static String getRandElement(String[] arr) {
        int index = new Random().nextInt(arr.length);
        return arr[index];
    }

    public static String getRandElement(Set<String> arr) {
        int index = new Random().nextInt(arr.size());

        int i = 0;
        for (String s : arr) {
            if (i == index) return s;
            i++;
        }
        return null;
    }

    public static Iterable<CSVRecord> getRecordData() {
        return recordData;
    }
}