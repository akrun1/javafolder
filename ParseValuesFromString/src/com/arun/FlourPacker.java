package com.arun;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println("The output of canPack is " + canPack(1, 0, 4));
        System.out.println("The output of canPack is " + canPack(1, 4, 9));
        System.out.println("The output of canPack is " + canPack(2, 0, 9));
        System.out.println("The output of canPack is " + canPack(2, 2, 12));
        System.out.println("The output of canPack is " + canPack(0, 5, 4));
        System.out.println("The output of canPack is " + canPack(2, 1, 5));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if((bigCount < 0 ) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        for(int i = bigCount; i >= 0; i--) {
            for(int j = smallCount; j >=0; j--) {
                if((i * 5 + j == goal)) {
                    return true;
                }
            }
        }

        return false;


    }
}
