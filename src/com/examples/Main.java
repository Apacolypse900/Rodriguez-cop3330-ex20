package com.examples;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        double OrderAmount;
        double Statetax;
        double CountyTax;
        double tax;
        double Total;

        System.out.print("What is the order amount? ");
            OrderAmount = myObj.nextDouble();

        System.out.print("What state do you live in? ");
            String State = myObj.next();

        if (State.equals("Wisconsin")){
            System.out.print("What county do you live in? ");
                String County = myObj.next();

            if (County.equals("Dunn"))
                CountyTax = 0.004;
            if (County.equals("Eau Claire"))
                CountyTax = 0.005;
            else
                CountyTax = 0;

            Statetax = 0.05 ;
        }
        else {
            Statetax = 0.08;
            CountyTax = 0;
        }

        tax = (OrderAmount * Statetax) + (CountyTax * OrderAmount);
        Total = OrderAmount + tax;

        double rounded = Math.round(Total * 100.0) / 100.00;

        System.out.println("The tax is $" + tax + "\nThe total is $" + rounded);

    }
}
