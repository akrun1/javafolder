package com.arun;
import java.util.Scanner;

public class EvenDigitSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        System.out.println("The sum of even digit numbers is " + getEvenDigitSum(sc.nextInt()));
    }



    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }

        int rev = 0;
        int sum = 0;
        while(number > 0) {
            rev = number % 10;
            if(rev % 2 == 0) {
                sum += rev;
            }
           number /= 10;

        }
        return sum;

    }
}
