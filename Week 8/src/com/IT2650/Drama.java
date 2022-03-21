package com.IT2650;

import java.text.NumberFormat;

public class Drama extends Movie{

    public Drama(){ super(); }
    public Drama(String t, String r, String i){
        super(t,r,i);
    }
    public Drama(Movie other){
        super(other);
    }

    public double calcLateFees(int days){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        double lateFee = 2;
        System.out.println(this.getTitle() + " is " + days + " day(s) late. The total due is " + formatter.format(days*lateFee) + ".");
        return lateFee * days;
    }

}
