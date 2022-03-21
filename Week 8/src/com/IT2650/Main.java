package com.IT2650;


public class Main {

    public static void main(String[] args) {
	// write your code here
        //action creation/tests
        Action action1 = new Action("Raiders of the Lost Ark", "PG","123456");
        Action action2 = new Action(action1);
        action2.setIdNumber("654321");
        action2.setRatingMPAA("PG-13");
        action2.setTitle("The Bourne Identity");

        System.out.println(action1.toString());
        System.out.println(action2.toString());
        System.out.println(action1.equals(action2));

        //drama creation/tests
        Drama drama1 = new Drama("Beaches", "PG-13", "987654");
        Drama drama2 = new Drama(drama1);
        drama2.setIdNumber("888888");
        drama2.setRatingMPAA("PG-13");
        drama2.setTitle("The King's Speech");

        System.out.println(drama1.toString());
        System.out.println(drama2.toString());
        System.out.println(drama1.equals(drama2));

        //comedy creation/tests
        Comedy comedy1 = new Comedy("Big Daddy", "PG-13", "555555");
        Comedy comedy2 = new Comedy(comedy1);
        comedy2.setIdNumber("444444");
        comedy2.setRatingMPAA("PG-13");
        comedy2.setTitle("Mr. Deeds");

        System.out.println(comedy1.toString());
        System.out.println(comedy2.toString());
        System.out.println(comedy1.equals(comedy2));


        action1.calcLateFees(1);
        action2.calcLateFees(1);
        comedy1.calcLateFees(1);
        comedy2.calcLateFees(1);
        drama1.calcLateFees(1);
        drama2.calcLateFees(1);




    }
}
