package com.IT2650;


/**
 * Write a description of class Cup here.
 *
 * @author (ITMP 2650 Spring 2020)
 * @version (3/4/2020)
 */
public class Cup
{
    // instance variables
    private int volume; //in oz
    private String color;
    private String material;
    private boolean hasHandle;

    /**
     * Default constructor for objects of class Cup
     */
    public Cup()
    {
        // initialise instance variables to default values
        volume = 8;
        color = "white";
        material = "ceramic";
        hasHandle = true;
    }

    /**
     * Constructor for objects of class Cup
     */
    public Cup(int v, String c, String m, boolean hasHandle)
    {
        volume = v;
        color = c;
        material = m;
        hasHandle = hasHandle;
    }

    /**
     *  Copy constructor for the Cup class
     */
    public Cup(Cup original)
    {
        if (original == null)
        {
            System.out.println("Fatal error: cannot copy null Cup object.");
            System.exit(0);
        }

        volume = original.volume;
        color = original.color;
        material = original.material;
        hasHandle = original.hasHandle;
    }

    public String toString()
    {
        return "Cup holds: " + volume + " ounces\n"
                +"Color is: " + color + "\n"
                + "Material: " + material + "\n"
                + "Has handle = " + hasHandle + ".";
    }

    public void set(int v, String c, String m)
    {
        volume = v;
        color = c;
        material = m;
    }

    /**
     * getVolume method
     *
     * @return     the volume of the Cup object
     */
    public int getVolume()
    {
        return volume;
    }

    public String getColor()
    {
        return color;
    }

    public String getMaterial()
    {
        return material;
    }

    public boolean equals(Cup other)
    {
        if( other == null)
            return false;
        else
            return (volume == other.volume && color.equals(other.color)
                    && material.equals(other.material) && hasHandle == other.hasHandle);


    }
}
