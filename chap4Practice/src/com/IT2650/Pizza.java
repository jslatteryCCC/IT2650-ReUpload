package com.IT2650;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Pizza {
    private int size;
    private int ham;
    private int pepperoni;
    private int cheese;


    public Pizza(){};
    /*basic constructor for all parameters*/
    public Pizza(int s, int h, int c, int p)
    {
        if (s > 0)
        {
            size = s;
        }
        else setSize();
        ham = h;
        cheese = c;
        pepperoni = p;
    }

    public Pizza(Pizza origPizza) //pizza copy constructor
    {
        this.size = origPizza.size;
        this.pepperoni = origPizza.pepperoni;
        this.cheese = origPizza.cheese;
        this.ham = origPizza.ham;
    }

    public void setSize()
    {
        Scanner user = new Scanner(System.in);
        this.size = 0;
        while (size < 1 || size > 3)
        {
            System.out.println("What size pizza would you like? \n Please enter '1' for Small, '2' for Medium, or '3' for large:");
            this.size = user.nextInt();
        }
        System.out.println("Thanks for clearing that up.");
    }

    public void setNumCheeseToppings(int changeCheese) { this.cheese = changeCheese; }

    public void setNumHamToppings(int changeHam) { this.ham = changeHam; }

    public void setNumPepperoniToppings(int changePepperoni) {
        this.pepperoni = changePepperoni;
    }

    public int getSize(){ return size; }

    public int getHam(){ return ham; }

    public int getCheese(){ return cheese; }

    public int getPepperoni(){ return pepperoni; }


    public double calcPizzaCost()
    {

        int sizeCost = 0;
        int toppingCost = 2;

        if (size == 1) {sizeCost = 10;}
        else if (size ==2) {sizeCost = 12;}
        else if (size == 3) {sizeCost = 14;}
        return sizeCost + (ham + cheese + pepperoni) * toppingCost;
    }


    public String formattedPizzaTotal()
    {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(calcPizzaCost());
    }

    /*converts numbered user input size selections to string*/
    public String formattedSize()
    {
        String outputSize = "";
        if (size == 1) {outputSize = "small";}
        else if (size ==2) {outputSize = "medium";}
        else if (size == 3) {outputSize = "large";}
        return outputSize;
    }

    /*gets order details*/
    public void getPizzaDescription()
    {
        calcPizzaCost();
        System.out.println(MessageFormat.format("You''ve ordered a {0} pizza with {1} ham, {2} cheese, and {3} pepperoni.",
                formattedSize(), ham, cheese, pepperoni));
        System.out.println("Your total for this pizza is: " + formattedPizzaTotal());
    }
}
//EARLIER EXERCISES
    /*
    public void setOrder()
    {
        String thanks = "Thank you very much.";
        Scanner user = new Scanner(System.in);
        this.size = 0;
        while (size < 1 || size > 3)
        {
            System.out.println("What size pizza would you like? \n Please enter '1' for Small, '2' for Medium, or '3' for large:");
            this.size = user.nextInt();
        }
        System.out.println(thanks);
        System.out.println("How much cheese would you like? Enter 1 for single, 2 for double, etc.");
        this.cheese = user.nextInt();
        System.out.println(thanks);
        System.out.println("Would you like any ham?");
        this.ham = user.nextInt();
        System.out.println(thanks);
        System.out.println("Ok, last question. How about pepperoni?");
        this.pepperoni = user.nextInt();
    }
    */