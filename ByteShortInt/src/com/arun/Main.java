


package com.arun;

public class Main {

    public static void main(String[] args) {

        byte myByte = 120;
        short myShort = 5000;
        int myInt = 50_000_00;
        long myLong = 50_000L + (10L * (myInt + myShort + myByte));
        short shortTotal =  (short) (20 + (myByte));


      System.out.println("myLong = " + myLong);






    }
}
