package com.arun;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println("The output of getLargestPrime is " + getLargestPrime(21));
        System.out.println("The output of getLargestPrime is " + getLargestPrime(217));
        System.out.println("The output of getLargestPrime is " + getLargestPrime(0));
        System.out.println("The output of getLargestPrime is " + getLargestPrime(45));
        System.out.println("The output of getLargestPrime is " + getLargestPrime(-1));


    }

    public static int getLargestPrime(int number) {
        if(number <=1 ) {
            return -1;
        }


        int low = 2;
        while(number > low) {
            if(number % low == 0) {
                number /= low;
                low = 2;
            } else {
                low++;
            }

        }

        return low;
    }

}
