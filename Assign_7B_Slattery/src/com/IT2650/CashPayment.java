package com.IT2650;

public class CashPayment extends Payment {



    public CashPayment(double a){
        super(a);
    }

    public CashPayment(CashPayment other){
        super(other);
    }

    public void paymentDetails(){
        System.out.println("This is a cash payment.");
        super.paymentDetails();
    }

}

