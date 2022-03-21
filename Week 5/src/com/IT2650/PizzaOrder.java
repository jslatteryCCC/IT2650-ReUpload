package com.IT2650;
import java.text.MessageFormat;
import java.text.NumberFormat;


public class PizzaOrder {

    Pizza pizza1;
    Pizza pizza2;
    Pizza pizza3;
    int NumPizzas;

    public PizzaOrder(){};

    public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3)
    {
        this.pizza1 = new Pizza(pizza1);
        this.pizza2 = new Pizza(pizza2);
        this.pizza3 = new Pizza(pizza3);
    }

    public PizzaOrder(PizzaOrder origOrder) //PizzaOrder copy constructor
    {
        this.NumPizzas = origOrder.NumPizzas;
        this.pizza1 = new Pizza(origOrder.pizza1);
        this.pizza2 = new Pizza(origOrder.pizza2);
        this.pizza3 = new Pizza(origOrder.pizza3);
    }

    public int getNumPizzas() {
        return NumPizzas;
    }

    public void setNumPizzas(int numPizzas)
    {
        if (numPizzas >= 1 && numPizzas <= 3) {
            NumPizzas = numPizzas;
        }
        else {
            System.out.println("Invalid number of pizzas.");
            System.exit(1);
        }
    }

    public void setPizza1 (Pizza Pizza1)
    {
        pizza1 = Pizza1;
        pizza1.getPizzaDescription();
    }

    public void setPizza2(Pizza Pizza2)
    {
        pizza2 = Pizza2;
        pizza2.getPizzaDescription();
    }

    public void setPizza3(Pizza Pizza3)
    {
        pizza3 = Pizza3;
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

    public double calcTotal(){
        return pizza1.calcPizzaCost() + pizza2.calcPizzaCost() + pizza3.calcPizzaCost();
    }

    public String formattedOrderTotal()
    {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(calcTotal());
    }

    public void orderDetails()
    {
        System.out.println(MessageFormat.format("Num of pizzas in this order is {0} and the total is {1}.", this.NumPizzas, this.formattedOrderTotal()));
    }
}
