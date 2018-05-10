package com.sofiaisabelle;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean gameOver = true;
        int score = 3000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score is less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");


        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //Print out a second score on the screen with the following
        //score set to 1000
        //levelCompleted set to 8
        //bonus set to 200
        //But make sure the first print out above still displays as well

        boolean gameOverII = true;
        int scoreII = 3000;
        int levelCompletedII = 8;
        int bonusII = 200;

        System.out.println("Your second score is " + scoreII + " while you completed level " + levelCompleted + " with a " + bonusII + " point bonus!");
    }

}