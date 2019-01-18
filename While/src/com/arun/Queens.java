package com.arun;

public class Queens {

    public static void main(String[] args) {

        int[] arr1 = {1, 4, 5, 6, 7, 8};

        System.out.println("The output of isConsistent is " + isConsistent(arr1,  4));
    }

    public static boolean isConsistent(int[] q, int n) {



        for(int i = 0; i < n; i++) {
            if(q[i] == q[n]) {
                System.out.println("q[i] == q[n] where q[i] is " + q[i] + " and q[n] is " + q[n] );
                    return false;
            }
            if((q[i] - q[n]) == (n - i)) {
                System.out.println("(q[i] - q[n]) == (n - i)) where q[i] is " + q[i] + " and q[n] is " + q[n] );
                return false;
            }

            if((q[n] - q[i]) == (n - i)) {
                System.out.println("(q[n] - q[i]) == (n - i)) where q[i] is " + q[i] + " and q[n] is " + q[n] );
                return false;
            }
        }
        return true;

    }
}
