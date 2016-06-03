/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.calculator;

import com.tenzin.calculator.util.CalculatorHelper;

/**
 *
 * @author Home
 */
public class program {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculatorHelper ch=new CalculatorHelper();
       
        System.out.println(ch.add(6, 5));
        System.out.println(ch.sub(5, 6));
        System.out.println(ch.div(5, 5));
        System.out.println(ch.mul(5, 6));
        System.out.println(ch.power(2,.5));
        System.out.println(ch.max(5, 1));
        System.out.println(ch.min(2, 4));
    }
    
}
