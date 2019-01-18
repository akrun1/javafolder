package com.arun;




public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(2);
    }

    public static final String INVALID_VALUE = "Invalid Value";
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println(INVALID_VALUE);
        } else {


            for (int i = 0; i < number; i++) {

                for (int j = 0; j < number; j++) {
                    if ((i == 0) || (i == j) || (j == 0) || (i == number - 1) || (j == number - 1) || (i + j == number - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }


                }
                System.out.println();


            }


        }
    }

}


