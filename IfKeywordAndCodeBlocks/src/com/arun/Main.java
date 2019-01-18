package com.arun;


public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 4;
        int bonus = 100;
//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//
//
//        } else {
//            System.out.println("Got here");
//        }



        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        }

        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure to first printout above still displays as well


//        boolean newgameOver = true;
//        int secondScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//        System.out.println("secondScore is " + secondScore);
//        System.out.println("levelCompleted is " + newLevelCompleted);
//        System.out.println("bonus is " + newBonus);
//
//
//        if (newgameOver) {
//            int finalScore = secondScore + (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + finalScore);
//
//        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        }


    }
}
