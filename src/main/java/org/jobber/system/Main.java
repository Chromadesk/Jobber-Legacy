package org.jobber.system;

import org.jobber.data.AppData;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        AppData.getRecordData().forEach(System.out::println);
    }
}
