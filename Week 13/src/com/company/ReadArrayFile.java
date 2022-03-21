package com.company;
import java.io.*;

public class ReadArrayFile {
    private static double[] array = null;

    //reads array from file, prints to screen

    public static void readArrayFile(){

        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("arrayfile"));
            array = (double[]) inputStream.readObject();
            inputStream.close();
        }
        catch (FileNotFoundException e ){
            System.out.println("Cannot find file 'arrayfile'. Exiting.");
            System.exit(0);
        }
        catch (ClassNotFoundException e){
            System.out.println("Problems with file input. Exiting.");
            System.exit(0);
        }
        catch (IOException e){
            System.out.println("IO Exception. Exiting.");
            System.exit(0);
        }
        System.out.println("The following numbers were read from 'arrayfile':");

        for (double v : array) {
            System.out.println(v);
        }
    }
    //returns array
    public static double[] getArray() {
        return array;
    }
}
