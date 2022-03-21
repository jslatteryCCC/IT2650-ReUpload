package com.company;

public class Main {

    public static void main(String[] args) {
        CreateArray newArray = new CreateArray();
        newArray.createArray();
        WriteArrayFile.writeArrayFile(newArray.getUserInput());
        ReadArrayFile.readArrayFile();
        DevCalc devCalc = new DevCalc();
        devCalc.devCalc(ReadArrayFile.getArray());
    }
}
