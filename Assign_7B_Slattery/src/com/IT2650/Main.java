package com.IT2650;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Payment payment1 = new Payment(1.99);
        Payment payment2 = new Payment(payment1);
        payment2.setAmount(8.99);

        CashPayment cash1 = new CashPayment(2.99);
        CashPayment cash2 = new CashPayment(cash1);
        cash2.setAmount(12.99);

        CreditCardPayment creditCard1 = new CreditCardPayment(39.99, "John Doe", "08/21", "1234123412341234");
        CreditCardPayment creditCard2 = new CreditCardPayment(creditCard1);
        creditCard2.setAmount(101.99);
        creditCard2.setCardNumber("4321432143214321");
        creditCard2.setExpDate("12/21");
        creditCard2.setName("Roger Buckelsby");

        payment1.paymentDetails();
        payment2.paymentDetails();
        cash1.paymentDetails();
        cash2.paymentDetails();
        creditCard1.paymentDetails();
        creditCard2.paymentDetails();




    }
}
