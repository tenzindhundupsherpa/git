/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.calculator.util;

/**
 *
 * @author Home
 */
public class CalculatorHelper {

    public double add(double x, double y) {
        return x + y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double div(double x, double y) {
        return x / y;
    }

    public double mul(double x, double y) {
        return x * y;
    }

  public double power(double x, double y) {
            double num;
            num=1;
            for(double i=1;i<=y;i=i+1){
                num=num*x;
            }
                return num;
    }
  public double max(double x, double y){
      if(x>y){
          return x;
      }else
      return y;
  }
      public double min(double x, double y)
      {
          if(x<y)
          {
              return x;
          }
          else 
              return y;
      }
  }

}
