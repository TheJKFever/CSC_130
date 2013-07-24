/*
Author: Jon Koehmstedt
FINAL PROJECT: BANK ACCOUNT
Date: 12/12/2012
This is a class for a Bank Account
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Account
{

DecimalFormat df = new DecimalFormat("#.00");
Scanner keyboard = new Scanner(System.in);

private static int numAccounts=0;
private String accountName;
private int[] accountNum = new int[14];
private double balance;
private String printBalance;
private int i=0;

//CONSTRUCTOR
public Account()
{System.out.println("What is the account name?");
accountName = keyboard.next();
for (i=0;i<accountNum.length;i++)
	{accountNum[i]=((int)(Math.round(Math.random()*9)));}
balance=0;
numAccounts++;
}

public Account(String name, double initialBalance)
{accountName = name;
for (i=0;i<accountNum.length;i++)
	{accountNum[i]=((int)(Math.round(Math.random()*9)));}
balance=initialBalance;
numAccounts++;
}

//STATIC METHODS
public static int getNumOfAccounts()
{return numAccounts;
}

//METHODS
public void deposit(double depositAmount)
{	if (depositAmount<0)
		{System.out.println("Please enter only a positive number, or 0 to cancel");}
	else
	{balance = (balance + depositAmount);}
}

public void withdraw(double withdraw)
{double withdrawAmount = withdraw;
while (withdrawAmount<0)
	{System.out.println("Please enter only a positive number, or 0 to cancel");
	System.out.println("How much would you like to withdraw from your account?");
	withdrawAmount = keyboard.nextDouble();}
	if ((balance-withdrawAmount)<0)
	{	System.out.println("Insufficient Funds");}
	else 
	{	balance = (balance - withdrawAmount);}
}

public void inquire()
{System.out.println();
System.out.println("Your current balance is: $"+getBalance());
System.out.println();
}

public void printReceipt()
{System.out.println();
System.out.println("Account Name: "+accountName);
System.out.print("Account Number: ");getAccountNum();
System.out.println();
System.out.println();
System.out.println("Balance: $"+getBalance());
System.out.println();
}

private String getBalance()
{ return df.format(balance);
}

private void getAccountNum()
{ for (i=0;i<accountNum.length;i++)
	System.out.print(accountNum[i]);
}


}//class Account