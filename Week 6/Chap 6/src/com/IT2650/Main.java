package com.IT2650;
import java.util.*;



public class Main {



    public static double diveScore(double[] array, double difficulty){



        Scanner keyboard = new Scanner(System.in);

        for (int i=0; i <= 6; i++)
        {

            System.out.print("Enter diving score between 0 and 10: ");
            array[i] = keyboard.nextDouble();

            while (array[i] < 0 || array[i] > 10)
            {
                System.out.print("Invalid Entry. Please enter valid score between 0 and 10: ");
                array[i] = keyboard.nextDouble();
            }
        }
        while (difficulty < 1.2 || difficulty > 3.8)
        {
            System.out.print("Please enter valid difficulty between 0 and 10: ");
            difficulty = keyboard.nextDouble();
        }



        Arrays.sort(array);//sort the array
        array[0] = 0;//set the smallest value to 0
        array[array.length - 1] = 0;//set the largest value to 0
        double sum = 0;
        for (double judgeScore : array)
        {
                sum += judgeScore;//add each value in the array to the sum
        }
        System.out.println("\nHere are the array values after being sorted\nlowest to highest, with min and max removed: \n\n"
                + Arrays.toString(array));
        System.out.println("\nThe sum of the scores is = " +sum);
        System.out.println("The sum (" + sum + ") * the difficulty (" + difficulty + ") = " + sum * difficulty);
        double finalScore = (sum * difficulty) * .6;

        System.out.println("\nThe final score is: " + finalScore);
        return finalScore;

    }



    public static void main(String[] args) {

         double[] judgeScores = new double[7];
         double difficulty = 0;

         diveScore(judgeScores, difficulty);




         /*find the sum, find the min, find the max;
         subtract the min and max from the sum;
         divide the sum by the length -2;
         mult the new sum by the difficulty*/



        }
        /*for (double score : array)
    {
        if (score < 0 || score > 10) {//tests scores for valid range
            System.out.println("Invalid score input. Must be in range 0.0 - 10.0");
            System.exit(1);
        }
    }
        if (difficulty < 1.2 || difficulty > 3.8) {
        System.out.println("Invalid difficulty rating. Must be in range 1.2 - 3.8");
        System.exit(1);*/
    }

