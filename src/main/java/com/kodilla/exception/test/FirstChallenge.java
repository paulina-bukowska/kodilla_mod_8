package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
/*
        if(b == 0){
            throw new ArithmeticException();
        }
*/

        try {
            double result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0" + e);
        } finally {
            System.out.println("...Division attempt done...");
        }

       return a / b;
    }
}