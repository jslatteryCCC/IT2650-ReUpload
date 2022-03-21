package com.IT2650;
import java.text.NumberFormat;


public class Payment {

    private double amount;


    public Payment(double a){
        amount = a;
    };

    public Payment(Payment other){
        amount = other.amount;
    }

    public String toString(){
        return "This payment's amount is " + amount; }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void paymentDetails(){

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("The payment amount is: " + formatter.format(amount));
    }
}
