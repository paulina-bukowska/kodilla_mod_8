package com.kodilla.exception.test;

public class CallDivide {

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0\n" + e);
        } finally {
            System.out.println("...Division attempt done...");
        }

    }
}