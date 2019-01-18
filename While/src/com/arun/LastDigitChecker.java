package com.arun;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println("The output of hasSameLastDigit is " + hasSameLastDigit(41, 21, 77));
        System.out.println("The output of hasSameLastDigit is " + hasSameLastDigit(23, 32, 42));
        System.out.println("The output of hasSameLastDigit is " + hasSameLastDigit(9, 99, 999));


    }


    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if((num1 < 10) || (num1 > 1000) || (num2 < 10) || (num2 > 1000) || (num3 < 10) || (num3 > 1000)) {
            return false;
        }

        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;
        int num3LastDigit = num3 % 10;

        return ( (num1LastDigit == num2LastDigit) || (num1LastDigit == num3LastDigit) || (num2LastDigit == num3LastDigit));

    }

}
