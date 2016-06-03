/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.calculator;

import com.tenzin.calculator.util.CalculatorHelper;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculatorHelper ch = new CalculatorHelper();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter your first number");
            double nextDouble = input.nextDouble();
            System.out.println("Enter your second number");
            double nDouble = input.nextDouble();

            System.out.println("What do you want to do?");
            System.out.println("1.add, 2.sub, 3.mul, 4.div, 5.power, 6.min, 7.max");

            String choice = input.next();
            if (choice.equalsIgnoreCase("1")) {

                System.out.println(ch.add(nextDouble, nDouble));
            } else if (choice.equalsIgnoreCase("2")) {
                System.out.println(ch.sub(nextDouble, nDouble));
            } else if (choice.equalsIgnoreCase("3")) {
                System.out.println(ch.mul(nextDouble, nDouble));
            } else if (choice.equalsIgnoreCase("4")) {
                System.out.println(ch.mul(nextDouble, nDouble));
            } else if (choice.equalsIgnoreCase("4")) {
                System.out.println(ch.div(nextDouble, nDouble));
            } else if (choice.equals("5")) {
                System.out.println(ch.power(nextDouble, nDouble));
            } else if (choice.equals("6")) {
                System.out.println(ch.min(nextDouble, nDouble));
            } else {
                System.out.println(ch.max(nextDouble, nDouble));
            }

            System.out.println("Do you want to continue?[Y/N]");
            String select = input.next();
            if (select.equalsIgnoreCase("n"))
            System.exit(0);

        }
    }
    }