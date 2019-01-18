package com.arun;


import java.math.BigInteger;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("The greatest common divisor is " + getGreatestCommonDivisor(25, 15));
        System.out.println("The greatest common divisor is " + getGreatestCommonDivisor(12, 30));
        System.out.println("The greatest common divisor is " + getGreatestCommonDivisor(9, 18));
        System.out.println("The greatest common divisor is " + getGreatestCommonDivisor(81, 153));

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }

//         BigInteger b1 = BigInteger.valueOf(first);
//         BigInteger b2 = BigInteger.valueOf(second);
//
//         BigInteger gcd = b1.gcd(b2);
//
//         return gcd.intValue();
        int remain1;
        int remain2;

        for(int i = first/2; i >= 2; i--) {
            if((first % i == 0)  && (second %i == 0) ) {
                return i;

            }

        }
         return -1;

    }

}
