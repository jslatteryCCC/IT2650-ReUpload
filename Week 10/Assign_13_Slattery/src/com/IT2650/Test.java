package com.IT2650;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Employee employee = new Employee();
        Employee.Date today = employee.new Date(4, 7, 2021);
        System.out.println("Enter month in number format:");
        today.setMonth(keyboard.nextInt());
        System.out.println("Enter day:");
        today.setDay(keyboard.nextInt());
        System.out.println("Enter year:");
        today.setYear(keyboard.nextInt());

        employee.setHireDate(today);
        employee.setName("Scotty Karate");

        HourlyEmployee hourly1 =  new HourlyEmployee(employee, 15, 40 );

        System.out.println(hourly1.toString());







    }


}
