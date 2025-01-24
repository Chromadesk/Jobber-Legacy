package org.jobber.system;

import org.jobber.data.AppData;

public class Main {
    public static void main(String[] args) {
        AppData.getRecordData().forEach(System.out::println);
    }
}
