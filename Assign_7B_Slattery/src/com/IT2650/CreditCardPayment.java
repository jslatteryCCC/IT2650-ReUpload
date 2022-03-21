package com.IT2650;

public class CreditCardPayment extends Payment{

    private String name, expDate, cardNumber;


    public CreditCardPayment(double a, String n, String e, String cn){
        super(a);
        name = n;
        expDate = e;
        cardNumber = cn;
    }
    public CreditCardPayment(CreditCardPayment other){
        super(other);
        name = other.name;
        expDate = other.expDate;
        cardNumber = other.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public String getExpDate(){
        return expDate;
    }
    public String getCardNumber(){
        return cardNumber;
    }
    public void paymentDetails(){
        System.out.println("This is a credit card payment.");
        super.paymentDetails();
        String last4 = cardNumber.substring(cardNumber.length() - 4);
        System.out.println("The card belonging to " + name + " ending in " + last4 + " with expiration date " + expDate +
                " has been charged.");
    }
}
