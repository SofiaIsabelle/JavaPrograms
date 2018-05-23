package com.sofiaisabelle;

public class BankAccount {

      private String number;
      private double balance;
      private String customerName;
      private String customerEmailAddress;
      private String customerPhoneNumber;



     public BankAccount(){
         this("default num",2.50,"default name","default email","default phone");

     }

    public BankAccount(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
         System.out.println("Account constructor with parameters called ");
         this.number = number;
         this.balance = balance;
         this.customerName = customerName;
         this.customerEmailAddress = customerEmailAddress;
         this.customerPhoneNumber = customerPhoneNumber;

     }

    public BankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("9999999", 255.98, customerName, customerEmailAddress, customerPhoneNumber);
//        this.customerName = customerName;
//        this.customerEmailAddress = customerEmailAddress;
//        this.customerPhoneNumber = customerPhoneNumber;
    }


   // Let's create both our methods , our deposit and our withdrawal
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);

    }


    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0 ){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}


