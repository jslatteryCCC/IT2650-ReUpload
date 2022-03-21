package com.company;
import java.io.*;

public class WriteArrayFile {
    /*
    takes in an array
    writes it to file
     */

    public static void writeArrayFile(double[] array){
        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("arrayfile"));
            outputStream.writeObject(array);
            outputStream.close();
        }
        catch (IOException e){
            System.out.println("Error writing to file.");
            System.exit(0);
        }
        System.out.println("Array written to 'arrayfile'");
    }
}
