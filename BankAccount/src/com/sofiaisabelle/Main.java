package com.sofiaisabelle;


public class Main {

    public static void main(String[] args) {


        BankAccount sofiaAccount = new BankAccount();

       // BankAccount sofiasAccount = new BankAccount("23948282901", 500000000, "Sofia Isabelle Rahimi", "sofiainvestments@gmail.com","571-294-9677" );
        System.out.println(sofiaAccount.getNumber());
        System.out.println(sofiaAccount.getBalance());
        sofiaAccount.deposit(500);
        sofiaAccount.withdrawal(100);


    }
}
