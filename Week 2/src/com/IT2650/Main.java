456789package com.IT2650;
import java.util.Scanner;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        float commute; //trip distance
        float mpg; //fuel efficiency
        float fuelPrice; //fuel per gallon

        Scanner user = new Scanner(System.in); //scanner object
        NumberFormat printInDollars = NumberFormat.getCurrencyInstance(); //currency format object

        System.out.println("Please enter the commute distance in miles: ");
        commute = user.nextFloat();
        System.out.println("Please enter the vehicle's fuel efficiency in MPG: ");
        mpg = user.nextFloat();
        System.out.println("Please enter the price of gas, per gallon: ");
        fuelPrice = user.nextFloat();

        float tripCost = (commute / mpg) * fuelPrice; //calculate cost


        System.out.println("The cost of your trip is " + printInDollars.format(tripCost) + ".");



	// write your code here
    }
}
