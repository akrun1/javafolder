package com.arun;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 5;
        float myFloatValue = 5f/3f;
        float myFloatValue2 = (float) 6.4;
        double myDoubleValue = 5d/3d;
        int myIntValue2 = 5/2;
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        System.out.println("myIntValue2 = " + myIntValue2);

        // Challenge
        double myPounds = 200d;
        double myKilos = myPounds * 0.45359237d;
        System.out.println("myKilos = " + myKilos);

        double pi = 3.141_592_7d;
        System.out.println("pi = " + pi);
    }
}
