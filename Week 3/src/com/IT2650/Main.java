package com.IT2650;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        int crudInput;
        int daysInput;
        String goAgain = "\nWould you like to enter new numbers? \nEnter 1 for yes, 2 for no:\n";
        Scanner user = new Scanner(System.in);

        do{
            System.out.println("How much 'Crud' do you have, in pounds? ");
            crudInput = user.nextInt();
            System.out.println("How many days will you let your 'Crud' sit? ");
            daysInput = user.nextInt();


            if (crudInput > 0 && daysInput >= 10) {

                int[] growthSequence = new int[1+ (daysInput / 5)];
                growthSequence[0] = crudInput;
                growthSequence[1] = crudInput;
                int crudPostGrowth = 0;

                for (int i = 2; i < growthSequence.length; i++) {
                    growthSequence[i] += growthSequence[i - 1] + growthSequence[i - 2];
                    crudPostGrowth = growthSequence[i];
                }


                String hasGrown = String.format("The total amount of 'Crud' after %d days is %d", daysInput, crudPostGrowth);
                System.out.println(hasGrown);
                System.out.println(goAgain);

            } else {
                String notGrown = String.format("The total amount of 'Crud' after %d days is %d", daysInput, crudInput);
                System.out.println(notGrown);
                System.out.println(goAgain);

            }
        }

        while(user.nextInt() != 2);
        System.out.println("Thank you for your interest in 'Crud'. Please come again.");
    }

}