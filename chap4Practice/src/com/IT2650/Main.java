package com.IT2650;

public class Main {

    public static void main(String[] args) {


        Pizza pizza1 = new Pizza(3, 1, 1, 0);
        Pizza pizza2 = new Pizza(2, 2, 0, 2);
        //Pizza pizza3 = new Pizza(0, 1, 1, 1); Tests: can I add another pizza? Does it catch size = 0?
        PizzaOrder order1 = new PizzaOrder();
        order1.setNumPizzas(2); // 2 pizzas in the order
        order1.setPizza1(pizza1); // Set first pizza
        order1.setPizza2(pizza2); // Set second pizza
        order1.orderDetails();

        System.out.println("\n\n");

        PizzaOrder order2 = new PizzaOrder(order1);
        order2.setNumPizzas(2);
        order2.getPizza1().setNumCheeseToppings(3);
        order2.pizza1.getPizzaDescription();
        order2.pizza2.getPizzaDescription();
        order2.orderDetails();

        double total = order2.calcTotal();
        double origTotal = order1.calcTotal();
        System.out.println(total);
        System.out.println(origTotal);



    }
}





//TEST CODE FROM EARLIER EXERCISES
//double total = order2.calcTotal(); // Should be 22 + 20 = 42
//double origTotal = order1.calcTotal(); // Should still be 38
//System.out.println(origTotal);
//System.out.println(total);
/*
        4.11/4.12 Test Code
        Pizza pizza1 = new Pizza(0, 2, 0, 2); //sending 0 as the size to test
        Pizza pizza2 = new Pizza();

        pizza1.getDescription();

        pizza2.setOrder();
        pizza2.getDescription();

        Pizza pizza1 = new Pizza(3, 1, 1, 0);
        Pizza pizza2 = new Pizza(2, 2, 0, 2);
        PizzaOrder order = new PizzaOrder();
        order.setNumPizzas(2);
        order.setPizza1(pizza1);
        order.setPizza2(pizza2);
        double total = order.calcTotal();
        System.out.println(order.calcTotal());
        System.out.println(total);*/


