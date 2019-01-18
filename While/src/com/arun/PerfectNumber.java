package com.arun;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println("The output of isPerfectNumber is " + isPerfectNumber(6));
        System.out.println("The output of isPerfectNumber is " + isPerfectNumber(28));
        System.out.println("The output of isPerfectNumber is " + isPerfectNumber(5));
        System.out.println("The output of isPerfectNumber is " + isPerfectNumber(-1));




    }


    public static boolean isPerfectNumber(int number) {
        if(number < 1) {
            return false;
        }

        int sum = 0;
        for(int i = 1; i < number; i++) {

            if(number % i == 0) {
                sum += i;
            }

        }

        return number == sum;
    }

}
