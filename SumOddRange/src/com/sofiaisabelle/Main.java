package com.sofiaisabelle;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int x;
        System.out.println("Enter an integer , and we'll check if it is even or odd: ");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();

        if(x % 2 == 0)
            System.out.println("You entered an Even Number");
        else
            System.out.println("You entered an Odd Number");
    }

}