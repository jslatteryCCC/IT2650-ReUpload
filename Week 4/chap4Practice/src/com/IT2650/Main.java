package com.IT2650;

public class Main {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza(3, 2, 0, 2);
        Pizza pizza2 = new Pizza();

        pizza1.printDescription();

        pizza2.setOrder();
        pizza2.printDescription();

    }
}
