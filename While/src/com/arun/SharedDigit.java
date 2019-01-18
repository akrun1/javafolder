package com.arun;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println("Is there any digits shared - " + hasSharedDigit(39, 43));

    }

    public static boolean hasSharedDigit(int number1, int number2) {
            if((number1 < 10) || (number1 > 99) || (number2 < 10) || (number2 > 99) ) {
                return false;
            }

            int tmp1 = 0;
            int tmp2 = 0;

            int tmp = number2;
            boolean bl = false;

            while(number1 != 0) {
                tmp1 = number1 % 10;
                number1 /= 10;
                while(number2 != 0) {
                    tmp2 = number2 % 10;
                    number2 /= 10;
                    if(tmp1 == tmp2) {
                        bl = true;
                        break;
                    }
                }
                number2 = tmp;
            }
            return bl;


    }
}
