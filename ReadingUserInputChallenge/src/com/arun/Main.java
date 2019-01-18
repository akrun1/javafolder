package com.arun;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int n = 1;
//        int sum = 0;


//
//        while (n < 11) {
//            System.out.println("Enter number #:" + n);
//            boolean hasNextInt = scanner.hasNextInt();
//            if (hasNextInt) {
//
//                int val = scanner.nextInt();
//                scanner.nextLine();
//
//                sum += val;
//
//
//
//
//            } else {
//                System.out.println("Invalid Number");
//            }
//            n++;
//        }

        int counter = 0;
        int sum = 0;

        while(true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
               int number = scanner.nextInt();

                counter++;
                sum += number;

                if(counter == 10) {
                    break;
                }

            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();

        }
        System.out.println("Sum of the numbers is " + sum);

        scanner.close();


    }
}
