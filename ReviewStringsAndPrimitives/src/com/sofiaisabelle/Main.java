package com.sofiaisabelle;

public class Main {

    public static void main(String[] args) {
	// write your code here
//primitive data types in Java , you can also create your own data-types in java
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
//sometimes referred to as the ninth data-type in Java is a string which is a sequence as characters, which can contain more than one character , unlike the char which can only contain
//one character or a unicode character within it
//Strings in java need to be surrounded by double qoutes
//Unicode / Char are surrounded by single qoutes
        //string
        String myString = "This is a string";
        System.out.println("myString is equal to : " + myString);
        myString = myString + " , and this is more.";
        System.out.println("myString is equal to : " + myString);
        myString = myString + "\u00A9 2018";
        System.out.println("myString is equal to : " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is a result of concatenation " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);



    }
}

