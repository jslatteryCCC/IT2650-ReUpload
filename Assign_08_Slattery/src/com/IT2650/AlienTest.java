package com.IT2650;

public class AlienTest
{
    public static void main (String[] args)
    {
        Alien alien1 = new Alien(100,"Mork");
        Alien alien2 = new Alien(85,"Puff");
        Alien alien3 = new Alien(25,"Jake");

        AlienPack pack1 = new AlienPack(3);

        pack1.addAlien(alien1);
        pack1.addAlien(alien2);
        pack1.addAlien(alien3);

        System.out.println("Under attack by:\n" + pack1.toString());

        System.out.println("Damage is " + pack1.calculateDamage());

    }
}