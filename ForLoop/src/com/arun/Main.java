package com.arun;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
//        System.out.println("10,000 at 6% interest = " + calculateInterest(10000.0, 6.0));



//        for (int i = 2; i < 9; i++) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
//
//        }
//        System.out.println("******************");
//
//        for (int i = 8; i > 1; i--) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
//
//        }
//          int count = 0;
//          for(int i = 10; i < 50; i++) {
//              if(isPrime(i)) {
//                  count++;
//                  System.out.println("Number " + i + " is a prime number");
//                  if(count == 10) {
//                      System.out.println("Exiting for loop");
//                      break;
//
//              }
//
//              }
//
//
//          }
//        System.out.println("The total number of prime numbers are " + count);
        int Sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++) {
            if(((i % 3) == 0) && ((i % 5) == 0)) {
                count++;
                Sum += i;
                System.out.println("Number " + i + " is both divisible by 3 and by 5");


            }
            if(count == 5) {
                System.out.println("Exiting the loop");
                break;
            }


        }
        System.out.println("Sum of the numbers is " + Sum);


    }



    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            System.out.println("Looping " + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate/100));
    }
}
