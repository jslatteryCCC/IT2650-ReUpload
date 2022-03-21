package com.company;
import java.util.Scanner;

public class CreateArray {
    double[] userInput;

    //prompts user to enter the sample for the std. dev. calculation
    public void createArray() {
        Scanner keyboard = new Scanner(System.in);
        try {
            try {
                System.out.println("Time to create an array of doubles!");
                System.out.println("How many numbers will you be entering?");
                userInput = new double[keyboard.nextInt()];
            } catch (Exception e) {
                System.out.println("Just enter the quantity of numbers in your sample.");
                createArray();
            }


            try {
                for (int i = 0; i < userInput.length; i++) {
                    System.out.println("Enter number " + (i + 1) + ":");
                    userInput[i] =  keyboard.nextDouble();
                }
                System.out.println("Array created!");
            } catch (Exception e) {
                System.out.println("Floating point numbers only, please. Starting over.\n");
                createArray();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public double[] getUserInput() {
            return userInput;
        }

}
