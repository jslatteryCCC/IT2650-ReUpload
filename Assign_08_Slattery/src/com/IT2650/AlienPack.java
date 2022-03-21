package com.IT2650;

public class AlienPack
{
    private Alien[] aliens;
    private int next;

    public AlienPack (int numAliens)
    {
        aliens = new Alien[numAliens];
        next = 0;
    }

    public boolean addAlien(Alien newAlien)
    {
        if( next == aliens.length)
            return false; //no room in array for more aliens
        else
            aliens[next++] = newAlien; //add the alien to array and increment next

        return true;
    }

    public Alien[] getAliens()
    {
        return aliens;
    }

    public int calculateDamage()
    {
        int damage = 0;
        for (int i = 0; i < next; i++)
        {
            damage = damage + aliens[i].getDamage();
        }

        return damage;
    }

    public String toString()
    {
        String output = "";

        for (int i = 0; i < aliens.length; i++)
        {
            output += (i+1) + ") " + aliens[i].toString() + "\n";
        }

        return output;
    }
}