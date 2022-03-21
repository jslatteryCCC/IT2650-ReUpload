package com.IT2650;

public abstract class Alien
{
    private int health; // 0=dead, 100=full strength
    private String name;

    public Alien()
    {
        health = 100;
        name = "";
    }

    public Alien(int h, String n)
    {
        health = Math.abs(h) % 101;//Keep positive and in range
        name = n;
    }

    public void setHealth(int h)
    {
        health = Math.abs(h) % 101;//Keep positive and in range
    }

    public void setName(String n)
    {
        name = n;
    }

    public int getHealth()
    {
        return health;
    }

    public String getName()
    {
        return name;
    }

    public abstract int getDamage();


    public String toString()
    {
        return this.getClass( ).getSimpleName( ) + " Name: " + name + ", Health: " + health;
    }

}