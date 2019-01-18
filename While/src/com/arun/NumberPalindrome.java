package com.arun;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println("Is 252 a palindrome? " + isPalindrome(252));
        System.out.println("Is -1221 a palindrome? " + isPalindrome(-1221));
        System.out.println("Is 707 a palindrome? " + isPalindrome(707));
        System.out.println("Is 11212 a palindrome? " + isPalindrome(11212));


    }


    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;

        }
        return reverse == palindrome;
    }

//
//    public static boolean isPalindrome(int integer) {
//        int palindrome = integer;
//        int reverse = 0;
//
//        // Compute the reverse
//        while (palindrome != 0) {
//            int remainder = palindrome % 10;
//            reverse = reverse * 10 + remainder;
//            palindrome = palindrome / 10;
//        }
//
//        // The integer is palindrome if integer and reverse are equal
//        return integer == reverse; // Improved by Peter Lawrey
//
//    }

}
