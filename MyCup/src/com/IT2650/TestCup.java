package com.IT2650;

public class TestCup {

    public static void main(String[] args) {
        Cup cup1 = new Cup(8, "white", "ceramic");
        Cup cup2 = new Cup(cup1);
        System.out.println(cup1.toString());
        System.out.println(cup2.toString());

        LogoCup logoCup1 = new LogoCup(12, "gray and red", "plastic", "Lighthouse", "Maine!");
        LogoCup logoCup2 = new LogoCup(logoCup1);
        System.out.println(logoCup1.toString());
        System.out.println(logoCup2.toString());


        System.out.println("\nTravel Cup One:");
        TravelCup travelCup1 = new TravelCup(12, "gray and red", "plastic", "Lighthouse", "Maine!", true);
        System.out.println(travelCup1.toString());
        System.out.println("\nTravel Cup Two:");



        TravelCup travelCup2 = new TravelCup(12, "gray and red", "plastic", "Lighthouse", "Maine!", false);
        System.out.println(travelCup2.toString());

        System.out.println("\nDo these cups match? " + travelCup1.equals(travelCup2));


        MusicalTravelCup musicalTravelCup1 = new MusicalTravelCup(12, "gray and red", "plastic", "Lighthouse",
                "Maine!", true, "Love is All You Need");
        System.out.println("\n\n\nMusical Travel Cup One:");
        System.out.println(musicalTravelCup1.toString());
        MusicalTravelCup musicalTravelCup2 = new MusicalTravelCup(musicalTravelCup1);
        System.out.println("\nMusical Travel Cup Two:");
        System.out.println(musicalTravelCup2.toString());
        System.out.println("\nmusicalTravelCup2 is a copy of musicalTravelCup1. Do these cups match? " + musicalTravelCup1.equals(musicalTravelCup2));
        musicalTravelCup2.setSong("Penny Lane");
        System.out.println("\nmusicalTravelCup1:" + musicalTravelCup1.toString());
        System.out.println("\nmusicalTravelCup1:" + musicalTravelCup2.toString());
        System.out.println("\n\nChanged musicalTravelCup2's song to 'Penny Lane'. \nDo these cups match? " + musicalTravelCup2.equals(musicalTravelCup1));


        // write your code here
    }
}
