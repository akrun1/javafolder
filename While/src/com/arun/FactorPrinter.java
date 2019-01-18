package com.arun;

public class FactorPrinter {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);


    }

    public static final String INVALID_VALUE = "Invalid Value";

    public static void printFactors(int number) {

        if(number < 1) {
            System.out.println(INVALID_VALUE);
        }

        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                System.out.println(i);
            }
        }

    }
}
