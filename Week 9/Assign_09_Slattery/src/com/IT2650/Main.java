package com.IT2650;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1, n2;
        double r;
        boolean done = false;

        while (!done)
        {
            try
            {
                System.out.println("Please enter the first integer: \n");
                n1 = scan.nextInt();
                System.out.println("Please enter the second integer: \n");
                n2 = scan.nextInt();
                if(n2 == 0) {
                    throw new Exception("Zero is not valid for division. Starting over.");
                }
                r = (double) n1 / n2;
                done = true;
                System.out.println(
                        n1 + " divided by " + n2 + " is " +r);
            }
            catch(InputMismatchException e){
                scan.nextLine();
                System.out.println("Not a valid integer. Starting over.");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
}
