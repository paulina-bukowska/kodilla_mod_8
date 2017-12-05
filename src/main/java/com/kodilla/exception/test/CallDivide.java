package com.kodilla.exception.test;

public class CallDivide {

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 1);

        System.out.println(result);

    }
}