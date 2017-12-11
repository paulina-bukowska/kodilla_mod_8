package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(3, 5);
        } catch(Exception e) {
            System.out.println("Uups, error!");
        } finally {
            System.out.println("...second challenge done...");
        }
    }
}
