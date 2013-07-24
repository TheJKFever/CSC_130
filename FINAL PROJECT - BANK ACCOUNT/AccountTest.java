/*
Author: Jon Koehmstedt
FINAL PROJECT: BANK ACCOUNT
Date: 12/12/2012
This is a program that simulates a Bank Account
*/

public class AccountTest
{

public static void main (String[] args)
{

System.out.println();
System.out.println("TEST: Create a new account from Account.java with account name: \"Mike\" \nWith initial balance of 500. Then Make $500 deposit.");
System.out.println();
Account mike = new Account("Mike",500);
mike.printReceipt();
mike.deposit(500);
mike.printReceipt();
System.out.println();
System.out.println("TEST: Create a new account from Account.java with account name \"Susan\" \nWith initial balance of 100. \nThen withdraw 50, then withdraw 70.");
System.out.println();
Account susan = new Account("Susan",100);
susan.printReceipt();
susan.withdraw(50);
susan.printReceipt();
susan.withdraw(70);
System.out.println();
System.out.println("The number of accounts is: "+Account.getNumOfAccounts());

}//main
}//clas AcountTest