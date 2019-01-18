package com.arun;

public class NumberToWords {

    public static void main(String[] args) {
        String out = "";
        numberToWords(-2521);
        System.out.println("The output of getDigitCount is " + getDigitCount(-2521));
        System.out.println("The output of reverse is " + reverse(-2521));

    }

    public static final String INVALID_VALUE = "Invalid Value";

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println(INVALID_VALUE);
        }
        int number2 = reverse(number);
        int remainNumber = number2;
      for(int i = 1; i <= getDigitCount(number); i++) {
          number2 = remainNumber;
          number2 %= 10;



          switch (number2) {
              case 0:
                  System.out.println("Zero");
                  break;
              case 1:
                  System.out.println("One");
                  break;
              case 2:
                  System.out.println("Two");
                  break;
              case 3:
                  System.out.println("Three");
                  break;
              case 4:
                  System.out.println("Four");
                  break;
              case 5:
                  System.out.println("Five");
                  break;
              case 6:
                  System.out.println("Six");
                  break;
              case 7:
                  System.out.println("Seven");
                  break;
              case 8:
                  System.out.println("Eight");
                  break;
              case 9:
                  System.out.println("Nine");
                  break;
              default:
                  System.out.println(INVALID_VALUE);
          }
          remainNumber /= 10;



      }

    }

    public static int reverse(int number) {



        int number2 = number;
        int remainder = number2 % 10;
        number2 /= 10;

       while(number2 != 0) {
            remainder *= 10;
            remainder += (number2 % 10);
            number2 /= 10;
        }
        return remainder;

    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }
        int count = 1;
        int numberdec = number;
        while(numberdec >= 10) {
            count++;
            numberdec /= 10;


        }
        return count;



    }
}
