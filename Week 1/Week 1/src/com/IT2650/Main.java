package com.IT2650;

public class Main {
//
    public static void main(String[] args) {
        int weight = 150; //this is my individual's given weight in lbs
        int run = 300; //equal to 30 mins * 10 METS/min
        int ball = 240;//same as above
        int sleep = 360;//equal 1 METS/min * 60 mins * 6
        int activitySum = run + ball + sleep; //sum of all activities' METS values
        double weightInKg = (weight / 2.2);//weight conversion
        double METS = .0175 * activitySum * weightInKg;


        System.out.println(METS);
    }
}

