package com.IT2650;
import java.text.MessageFormat;
import java.text.NumberFormat;


public class PizzaOrder {

    Pizza pizza1;
    Pizza pizza2;
    Pizza pizza3;
    int numPizzas;

    public PizzaOrder(){};

    public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3)
    {
        this.numPizzas = numPizzas;
        if (pizza1.calcPizzaCost() != 0){
            this.pizza1 = new Pizza(pizza1);
        }
        if (pizza2.calcPizzaCost() != 0) {
            this.pizza2 = new Pizza(pizza2);
        }
        if (pizza3.calcPizzaCost() != 0){
            this.pizza3 = new Pizza(pizza3);
        }
    }

    public PizzaOrder(PizzaOrder origOrder) //PizzaOrder copy constructor
    {
        this.numPizzas = origOrder.numPizzas;
        if (origOrder.numPizzas >= 1) {
            this.pizza1 = new Pizza(origOrder.pizza1);
        }
        if (origOrder.numPizzas >= 2) {
            this.pizza2 = new Pizza(origOrder.pizza2);
        }
        if (origOrder.numPizzas >= 3) {
            this.pizza3 = new Pizza(origOrder.pizza3);
        }
    }

    public int getNumPizzas() {
        return numPizzas;
    }

    public void setNumPizzas(int numPizzas)
    {
        if (numPizzas >= 1 && numPizzas <= 3) {
            this.numPizzas = numPizzas;
        }
        else {
            System.out.println("Invalid number of pizzas.");
            System.exit(1);
        }
    }

    public void setPizza1 (Pizza pizza1)
    {
        this.pizza1 = new Pizza(pizza1);
        pizza1.getPizzaDescription();
    }

    public void setPizza2(Pizza pizza2)
    {
        this.pizza2 = new Pizza(pizza2);
        pizza2.getPizzaDescription();
    }

    public void setPizza3(Pizza pizza3)
    {
        this.pizza3 = new Pizza(pizza3);
        pizza3.getPizzaDescription();
    }

    public Pizza getPizza1()
    {
        return (pizza1 != null) ? pizza1 : null;
    }

    public Pizza getPizza2()
    {
        return (pizza2 != null) ? pizza2 : null;
    }

    public Pizza getPizza3()
    {
        return (pizza3 != null) ? pizza3 : null;
    }

    public double calcTotal() {
        if (numPizzas == 1) {
            return pizza1.calcPizzaCost();
        }
        else if (numPizzas == 2) {
            return pizza1.calcPizzaCost() + pizza2.calcPizzaCost();
        }
        else if (numPizzas == 3) {
            return pizza1.calcPizzaCost() + pizza2.calcPizzaCost() + pizza3.calcPizzaCost();
        }
        return 0;
    }

    public String formattedOrderTotal()
    {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(calcTotal());
    }

    public void orderDetails()
    {
        System.out.println(MessageFormat.format("Num of pizzas in this order is {0} and the total is {1}.", this.numPizzas, this.formattedOrderTotal()));
    }
}
