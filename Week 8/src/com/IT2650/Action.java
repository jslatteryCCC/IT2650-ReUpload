package com.IT2650;

import java.text.NumberFormat;

public class Action extends Movie{

    public Action(){ super(); }
    public Action(String t, String r, String i){ super(t,r,i); }
    public Action(Movie other){
        super(other);
    }


    public double calcLateFees(int days){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        double lateFee = 3;
        System.out.println(this.getTitle() + " is " + days + " day(s) late. The total due is " + formatter.format(days*lateFee) + ".");
        return lateFee * days;
    }
}

