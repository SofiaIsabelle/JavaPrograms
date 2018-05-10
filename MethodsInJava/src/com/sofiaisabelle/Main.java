package com.sofiaisabelle;


public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);

/* ________________________________________________________________________________________________________ */
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Sofia", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Audrey", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Jonathan", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Godwin", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Louise", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " +
                             highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        } else if(playerScore >= 500 && playerScore < 1000){
            return 2;
        }else if(playerScore >= 100 && playerScore < 500){
            return 3;
        }else{
            return 4;
        }

    }



    //Let's create another method, it has to be within the class Main.
    // void : means don't send any value back, because we do want to return something , we're going to change the word void to the data-type of the information that we want to send back
    //There can only be one public top-level class per .java file
    //You have to use the words public and static when you are defining a new method.
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 3000;
            return finalScore;
        } else {
            return -1;
        }

    }


}

// In programming terms -1 is conventionally used to indicate an error
// In searching algorithms -1 indicates an invalid value or a value not found