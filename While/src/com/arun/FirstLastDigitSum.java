package com.arun;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(54));
        System.out.println(sumFirstAndLastDigit(252));

        System.out.println(sumFirstAndLastDigit(257));

        System.out.println(sumFirstAndLastDigit(0));


    }

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }

        int  lastDigit = number % 10;
        int firstDigit = number;

        while(firstDigit >= 10) {

            firstDigit /= 10;

        }

        return lastDigit + firstDigit;


    }


}
