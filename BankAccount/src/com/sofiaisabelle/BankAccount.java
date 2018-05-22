package com.sofiaisabelle;

public class BankAccount {

    //create bank account class
    // create fields for  account number, balance, customer name, email, phone number
    //create getters and setters for each field
    //create two additional methods
      // 1. to allow customers to deposit funds
      // 2. to allow customers to withdraw funds, this should deduct from the balance field
      // 3. do not allow withdrawal to complete if their insufficient funds
      // 4. create code in the Main class to confirm that your code is working
      // 5. Add some System.out.println in the two methods above as well

      private String number;
      private double balance;
      private String customerName;
      private String customerEmailAddress;
      private String customerPhoneNumber;



     public BankAccount(){
         System.out.println("Empty constructor called");

     }


     public BankAccount(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
         System.out.println("Account constructor with parameters called ");
         this.number = number;
         this.balance = balance;
         this.customerName = customerName;
         this.customerEmailAddress = customerEmailAddress;
         this.customerPhoneNumber = customerPhoneNumber;

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


