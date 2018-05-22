package com.sofiaisabelle;

import java.awt.image.BandCombineOp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount sofiasAccount = new BankAccount("23948282901", 500000000, "Sofia Isabelle Rahimi", "sofiainvestments@gmail.com","571-294-9677" );
        System.out.println(sofiasAccount.getNumber());
        System.out.println(sofiasAccount.getBalance());
        sofiasAccount.deposit(500.0);
        sofiasAccount.withdrawal(150);

    }
}
