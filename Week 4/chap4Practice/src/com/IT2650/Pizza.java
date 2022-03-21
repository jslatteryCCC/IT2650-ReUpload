package com.IT2650;
import java.text.NumberFormat;
import java.util.Scanner;

public class Pizza

{
    private int size;

    private int toppingsTotal;
    private double total;

    public Pizza(){}

    /*basic constructor for all parameters*/
    public Pizza(int s, int h, int c, int p)
    {


        size = s;
        ham = h;
        cheese = c;
        pepperoni = p;
        toppingsTotal = ham + cheese + pepperoni;
    }

    /*calculates cost*/
    public double calcCost()
    {

        if (size == 1) {total+= 10;}
        else if (size ==2) {total += 12;}
        else if (size == 3) {total += 14;}
        total += toppingsTotal * 2;
        return total;
    }
    /*formats total to $*/
    public String formattedTotal()
    {
        double OutputTotal = total;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(OutputTotal);
    }
    /*converts numbered user input size selections to  string*/
    public String formattedSize()
    {
        String outputSize = "";
        if (size == 1) {outputSize = "small";}
        else if (size ==2) {outputSize = "medium";}
        else if (size == 3) {outputSize = "large";}
        return outputSize;
    }


    /*method to set order*/
    public void setOrder()
    {
        String thanks = "Thank you very much.";
        Scanner user = new Scanner(System.in);
        /*Prompt for size*/
        size = 0;
        while (size < 1 || size > 3){
            System.out.println("What size pizza would you like? \n Please enter '1' for Small, '2' for Medium, or '3' for large:");
            size = user.nextInt();
        }
        System.out.println(thanks);
        /*Prompt for cheese*/
        System.out.println("How much cheese would you like? Enter 1 for single, 2 for double, etc.");
        toppingsTotal += user.nextInt();
        System.out.println(thanks);
        /*prompt for ham*/
        System.out.println("Would you like any ham?");
        toppingsTotal += user.nextInt();
        System.out.println(thanks);
        /*prompt for pepperoni*/
        System.out.println("Ok, last question. How about pepperoni?");
        toppingsTotal += user.nextInt();
    }
    /*gets order details*/
    public void printDescription()
    {
        calcCost();
        System.out.println("You've ordered a "  + formattedSize() + " pizza with " + toppingsTotal + " toppings.");
        System.out.println("Your total is " + formattedTotal());
    }
}
