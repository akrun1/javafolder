package com.arun;

public class Main {

    public static void main(String[] args) {

//        int highScore = calculateScore(true, 800, 4, 100);
//        System.out.println("score = " + highScore);
//        highScore = calculateScore(false, 10000, 8, 200);
//        System.out.println("score = " + highScore);

        int position1 = calculateHighScorePosition(1500);
        displayHighScorePosition("Arun", position1);

        position1 = calculateHighScorePosition(900);
        displayHighScorePosition("Shaja", position1);

        position1 = calculateHighScorePosition(400);
        displayHighScorePosition("Ravi", position1);

        position1 = calculateHighScorePosition(50);
        displayHighScorePosition("Donald", position1);

        position1 = calculateHighScorePosition(1000);
        displayHighScorePosition("DonaldT", position1);

    }

//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//            return finalScore;
//
//        }
//
//        return -1;
//    }


    public static void displayHighScorePosition(String playerName, int Position) {

        System.out.println(playerName + " managed to get into position " + Position + " on the high score table");

    }

//    public static int calculateHighScorePosition(int playerScore) {
//
//
//        if (playerScore >= 1000) {
//            return 1;
//
//        } else if (playerScore >= 500 && playerScore < 1000) {
//            return 2;
//        } else if (playerScore >= 100 && playerScore < 500) {
//            return 3;
//        } else {
//            return 4;
//        }
//
//
//
//
//    }


//    public static int calculateHighScorePosition(int playerScore) {
//
//
//        if (playerScore >= 1000) {
//            return 1;
//
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//
//
//        return 4;
//
//
//    }




    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;  // assuming position 4 will be returned
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }
        return position;





    }

}
