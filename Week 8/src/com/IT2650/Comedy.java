package com.IT2650;

import java.text.NumberFormat;

public class Comedy extends Movie{
    public Comedy(){ super(); }

    public Comedy(String t, String r, String i){
        super(t,r,i);
    }
    public Comedy(Movie other){
        super(other);
    }

    public double calcLateFees(int days){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        double lateFee = 2.5;
        System.out.println(this.getTitle() + " is " + days + " day(s) late. The total due is " + formatter.format(days*lateFee) + ".");
        return lateFee * days;
    }
}
