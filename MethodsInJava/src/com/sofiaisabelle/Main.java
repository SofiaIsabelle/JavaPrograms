package com.sofiaisabelle;


public class Main {
    //Line 7 - 30 is a Method , the method has a name of main , and all the the code in the middle of it are the statements that form the method
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        calculateScore(true, 800, 5, 100);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(true, 10000, 8, 200);




    }

    //Let's create another method, it has to be within the class Main.
    // void : means don't send any value back, because we do want to return something , we're going to change the word void to the data-type of the information that we want to send back
    //There can only be one public top-level class per .java file
    //You have to use the words public and static when you are defining a new method.
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {



        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
            return finalScore;
        } else {
            return -1;
        }

    }


}

// In programming terms -1 is conventionally used to indicate an error
// In searching algorithms -1 indicates an invalid value or a value not found