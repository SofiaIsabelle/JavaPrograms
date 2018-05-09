package com.sofiaisabelle;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int has a width of 32
        int myMinValue = -2_1_474_83_648;
        int myMaxValue = 2_147_48_3_6_47;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);
        // byte has a width of 8
       // byte myByteValue = 10;
        byte myByteValue = 127; //largest number that can be stored in a byte
        byte myNewByteValue = (byte)(myByteValue/2); // (byte) converts a number into a byte value
        System.out.println("myNewByteValue = " + myNewByteValue);
        // short has a width of 16
        short myShortValue = 32767; //largest number that can be a short value.
        short myNewShortValue = (short) (myShortValue/2);
        // a byte is more efficient because it would take a quarter of the amount of space of an integer.

        //long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;
    }
}



//1. Create a Byte Variable and Set it to any Valid Byte Number
//2. Create a short variable and set it to any valid short number
//3. Create an int variable and set it to any valid int number
//4. Create a variable of type long, and make it equal to :
//   50000 + 10 times the sum of the byte , plus the short plus the int

/*
public class Main {
    public static void main(String[] args){
        byte anyValidByteNum = 10;
        short myShortNum = 32;
        int anyValidInt = 989;
        long anyLongVal = 50000L + 10L * (anyValidByteNum + myShortNum + anyValidInt);
        System.out.println("anyLongVal = " + anyLongVal);

      }
    }

*/