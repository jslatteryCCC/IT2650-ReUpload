package com.company;
import java.io.OutputStream;
import java.util.*;

public class PermAndComboCalc {
    Scanner user = new Scanner(System.in);


    public PermAndComboCalc(){
    }
    public static double fact(int n){
        if (n <= 2){
            return n;
        }
        return n * fact(n - 1);
    }
    public void goAgain(){
        System.out.println("Go again? 1 for yes, 2 for no: ");
        int n = user.nextInt();
        if (n == 1){
            switcher();
        }
        else{
            System.exit(0);
        }
    }
    public void switcher(){
        System.out.println("Are you calculating P or C? Enter 1 for P, 2 for C:");
        int n = user.nextInt();
        if (n == 1){
            nPr();
        }
        if ( n == 2){
            nCr();
        }
    }
    public void nPr(){
        Scanner user = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = user.nextInt();
        System.out.println("Enter r: ");
        int r = user.nextInt();

        double result = fact(n) / (fact((n - r)));
        System.out.println ("The nPr result of " + n + " and " + r + " is " + result);
        goAgain();
    }
    public void nCr(){
        Scanner user = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = user.nextInt();
        System.out.println("Enter r: ");
        int r = user.nextInt();

        double result = fact(n) / (fact((n - r)) * fact(r));
        System.out.println ("The nPr result of " + n + " and " + r + " is " + result);
        goAgain();

    }
    /*public double compnPr(){
        System.out.println("How many :");
        int v = user.nextInt();
        double a[] = new double[v];
        double result = 0;

        for(int i = 0; i < v; i++){
             a[i] = nPr();
             System.out.println("The loop to populate the array is running and the value at index a[" + i + "] is " + a[i]);
        }
        for(int i = 0; i < (a.length -1); i++){
            result += (a[i] * a[i+1]);
            System.out.println("The loop to multiply the factors is running and the value at a[" + i + "] is \n" + a[i] +
                    " and the current result is " + result);
        }
        System.out.println("The result is " + result);
        return result;

     */
    }




