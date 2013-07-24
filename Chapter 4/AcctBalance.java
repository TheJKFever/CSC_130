/*Author: Jon Koehmstedt
Date 11/20/12
This program calculates your month-by-month savings account balance*/

import java.util.Scanner;

public class AcctBalance
{
	public static void main(String[] args)
	{
	
	Scanner keyboard = new Scanner(System.in);
	String transaction;
	double balance, withdraw, deposit, interestRate;
	
	System.out.println("Please enter your balance amount");
	balance = keyboard.nextDouble();
	System.out.println();
	
	do {System.out.println("Please enter the interest amount \n(any number greater than 0 or less than 10)");
	interestRate = keyboard.nextDouble();
	if((interestRate<=0)||(interestRate>=10))
		System.out.println("Please enter a number greater than 0 or less than 10");
	} while ((interestRate<=0)||(interestRate>=10));
	System.out.println();
	do {System.out.println("You are allowed to make one transaction to your account");
		do {System.out.println("Would you like to make a deposit or withdrawal?");	
		transaction = keyboard.next();
		} while (!(transaction.equalsIgnoreCase("withdrawal"))&&(!(transaction.equalsIgnoreCase("deposit"))));
		
			if (transaction.equalsIgnoreCase("withdrawal")) 
			{	do {System.out.println("How much would you like to withdraw?");
				withdraw = keyboard.nextDouble();
				if ((balance - withdraw)<=0)
					System.out.println("You have insufficient funds to withdraw that amount");
				} while ((balance - withdraw)<=0);
				balance = (balance - withdraw);
			}
			else if (transaction.equalsIgnoreCase("deposit")) 
			{	System.out.println("How much would you like to deposit");
				deposit = keyboard.nextDouble();
				balance = (balance + deposit);
			}
			else
				System.out.println("Contact Bank");
		balance = (balance + ((interestRate/12.0)*balance));

		System.out.println("\nYour new balance this month is now "+balance);
		System.out.println("Would you like to make another transaction?\nYes or No?");	
		do transaction = keyboard.next();
		while (!(transaction.equalsIgnoreCase("yes"))&&!(transaction.equalsIgnoreCase("no")));
	} while (transaction.equalsIgnoreCase("yes"));

	
	}//main
}//class