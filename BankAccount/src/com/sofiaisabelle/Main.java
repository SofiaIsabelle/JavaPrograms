package com.sofiaisabelle;


public class Main {

    public static void main(String[] args) {


        BankAccount sofiaAccount = new BankAccount();

       // BankAccount sofiasAccount = new BankAccount("23948282901", 500000000, "Sofia Isabelle Rahimi", "sofiainvestments@gmail.com","571-294-9677" );
        System.out.println(sofiaAccount.getNumber());
        System.out.println(sofiaAccount.getBalance());
        sofiaAccount.deposit(500);
        sofiaAccount.withdrawal(100);


        BankAccount bobsAccount = new BankAccount("Bob", "bob@email.com", "1223456");
        System.out.println(bobsAccount.getNumber() + " name " + bobsAccount.getCustomerName());

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 2500.00 );
        System.out.println(person2.getName());
        System.out.println(person2.getEmailAddress());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());





    }
}
