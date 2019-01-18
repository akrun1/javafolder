package com.arun;

public class SumDigits {

    public static void main(String[] args) {
        System.out.println(sumDigits(-125));
    }

    private static int sumDigits(int number) {


        if(number < 10) {
            return -1;
        }

        int sum  = 0;

        while(number > 0) {
            sum +=  number % 10;
            System.out.println("Sum here is " + sum);
            number /= 10;
            System.out.println("Number is " + number);

        }

        System.out.println("Total sum is " + sum);

        return sum;

    }

}
