package com.sofiaisabelle;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //width of a char is 16
        char myChar = '\u00A9';
        System.out.println("Unicode output is: " + myChar);

        boolean myBoolean = true;
        boolean isMale = true;

        //1. Find the code for the registered symbol on the same line as the copyright symbol.
        //2. Create a variable of the type char and assign it the unicode value for that symbol
        //3. Display it on the screen
        //4. Link for unicode symbols : https://unicode-table.com/en/#basic-latin

        char regChar = '\u00AE';
        System.out.println("Unicode symbol for register is " + regChar);

    }
}
