import java.util.Scanner;
/**
Class to store all Customer Profile Information
*/

public class CustomerProfile
{
	Scanner keyboard = new Scanner(System.in);

		
	//Instance Variables
	private String name;
	private String address;
	private String phone;
	private String email;
	private CheckingAccount[] checkingAccounts;
	private SavingsAccount[] savingsAccounts;
	private CreditAccount creditCard;
	private boolean onlineBanking;
	private boolean emailStatement;
	private String onlineUsername;
	private String onlinePassword;
	
	private int i=0;
	private String tempAnswer;
			
	//Static Variables
	private static boolean equals;
	
	//CONSTRUCTORS
	public CustomerProfile()
	{name="NONE";
	address="NONE";
	phone="NONE";
	email="NONE";
	checkingAccounts = new CheckingAccount();	   /*I'm Not sure what to put here*/
	savingsAccounts = new SavingsAccount();   	   /*I'm Not sure what to put here*/
	creditCard = new CreditAccount();			   /*I'm Not sure what to put here*/
	onlineBanking=false;
	emailStatement=false;
	onlineUsername="NONE";
	onlinePassword="NONE";
	}
	
	//METHODS
	public void readInput()//input customer information
	{if (name.equals("NONE"))
		{System.out.print("Name?: ");
		name = keyboard.next();}
	else
		{System.out.println("Is this the correct name?: "+getName());
		tempAnswer=getYesOrNo();
		if (tempAnswer.equals("no");
			{System.out.print("Name?: ");
			name = keyboard.next();}
	if (address.equals("NONE"))
		{System.out.print("Address?: ");
		address = keyboard.next();}
	else
		{System.out.println("Is this the correct address?: "+getAddress());
		tempAnswer=getYesOrNo();
		if (tempAnswer.equals("no");
			{System.out.print("Address?: ");
			address = keyboard.next();}
	if (phone.equals("NONE"))
		{System.out.print("Phone?: ");
		phone = keyboard.next();}
	else
		{System.out.println("Is this the correct phone?: "+getPhone());
		tempAnswer=getYesOrNo();
		if (tempAnswer.equals("no");
			{System.out.print("Phone?: );
			phone = keyboard.next();}
	if (email.equals("NONE"))
		{System.out.print("E-mail?: ");
		email = keyboard.next();}
	else
		{System.out.println("Is this the correct E-mail?: "+getEmail());
		tempAnswer=getYesOrNo();
		if (tempAnswer.equals("no");
			{System.out.print("E-mail?: );
			email = keyboard.next();}
	checkingAccounts={/*I'm Not sure what to put here*/};//If index one out of threee is empty, then ask if they'd like to open an account, then if two is empty, would you like to open another? and so on for three
	savingsAccounts={/*I'm Not sure what to put here*/};//If index one out of threee is empty, then ask if they'd like to open an account, then if two is empty, would you like to open another? and so on for three
	creditCard={/*I'm Not sure what to put here*/};//If credit card is empty, ask if they'd like to open a credit account
	onlineBanking=false;//If online banking is true for any of the above accounts, than online banking should be true here and username and password should already be set. If online banking in false for all acounts, then prompt.
	emailStatement=false;//If emailStatement is true for any of the above accounts, than emailStatement should be true here. If emailStatement in false for all acounts, then prompt.
	}

	
	
	public String getName()
	{return name;
	}
	
	public String getAddress()
	{return address;
	}

	public String getPhone()
	{return phone;
	}
	
	public String getEmail()
	{return email;
	}

	public int getNumChecking()
	{int numChecking=0
	for (i=1;i<checkingAccounts.length;i++)
	{if (checkingAccounts[i]!=null;)
		{numChecking++;}
	return numChecking;
	}
	
	public int[] getCheckingAccountNum(i)
	{ return (checkingAccounts[i].getAccountNum());
	}
	
	public int getNumSavings()
	{int numSavings=0
	for (i=1;i<savingsAccounts.length;i++)
	{if (savingsAccounts[i]!=null;)
		{numSavings++;}
	return numSavings;
	}
	
	public int[] getSavingsAccountNum(i)
	{ return (savingsAccounts[i].getAccountNum());
	}
	
	public boolean getIfCredit()
	{boolean IfCredit=false;
	if (creditCard!=null;)
		{IfCredit=true;}
	return IfCredit;
	}
	
	public int[] getCreditAccountNum()
	{ return (creditCard.getAccountNum());
	}
	
	public boolean getOnlineBanking()
	{return onlineBanking;
	}
	
	public boolean getEmailStatements()
	{return emailStatement;
	}


	
	
	public void setName(String newName)
	{name=newName;}
	
	public void explainAllDetails()
	{	System.out.println("By creating a Savings Account, you now are able to store your funds at our bank.\n"
		+"You will earn interest on the average monthly balance you hold in this account at the rate of: " + INTERESTRATE +"%\n"
		+"We will issue you checks at $" + CHECKBOOKCOST + " per checkbook.\n"
		+"We will issue you an " + CARDTYPE + " at no charge.\n"
		+"With this " + CARDTYPE + ", you will be able to check your balance, make withdrawals, and make deposits.\n"
		+"We also offer online banking at no charge.\n"
		+"We will send you a statement at the end of each month.\n");
	}
	
	public void explainInterest()
	{	System.out.println("As long as you have an average monthly balance of $100 or more in your account,\n"
		+"You will earn interest on the average monthly balance you hold at the rate of: " + INTERESTRATE +"%\n");
	}	

	public void explainOverdraftCharges()
	{	System.out.println("If for whatever reason, you're balance goes below zero, you will be charge overdraft charges.");
		System.out.println("You will be charged $" + OVERDRAFTCHARGE + " for every withdrawal you make that leaves your balance negative.");
		System.out.println("Additionally, you will be charged $" + OVERDRAFTCHARGE + " if your balance is negative after a month with 0 transactions.\n");
	}		
	
	public int checkbooksAmount(int checksAmount)
	{	String answer="yes";
	Scanner keyboard2 = new Scanner(System.in);
		do {System.out.println("How many checkbooks would you like?");
				checksAmount = keyboard.nextInt();
				if (checksAmount<0)
				{	System.out.println("Please enter an amount greater or equal to 0");
				}
				else if (checksAmount>0)
				{	System.out.println("at $" + CHECKBOOKCOST + " per checkbook, that will cost $" + (CHECKBOOKCOST * checksAmount));
					checkbooksBalance = (CHECKBOOKCOST * checksAmount);
					System.out.println("Is that okay (yes or no)?");
					answer = keyboard2.nextLine();
				}
				else if (checksAmount==0)
				{	System.out.println("You do not want any checks.");
					checkbooksBalance = (CHECKBOOKCOST * checksAmount);
					System.out.println("Is that correct (yes or no)?");			
					answer = keyboard2.nextLine();
				}
			} while (!(answer.equalsIgnoreCase("yes"))||(checksAmount<0));
			return checksAmount;
	}	

	public void wantOnlineBanking()
	{	String answer;
		System.out.println("With online bnaking you are able to check your balance, make withdrawals, make deposits, and pay your bills, all from the comfort of your home.");
		do {System.out.println("Do you want to signup for online banking?");
			answer = keyboard.next();
			onlineBanking=(answer.equalsIgnoreCase("yes"));
			if(onlineBanking)
			{	System.out.println("Great! Now we just need to setup a username and password");
				System.out.println("Please type in your desired username (please no spaces or special characters)");
				username = keyboard.nextLine();
				System.out.println("Please type in your desired password (please no spaces or special characters)");
				username = keyboard.nextLine();
				System.out.println("We will send you an email with your login information so you do not forget.");
				System.out.println("What is you're email address?");
				email = keyboard.nextLine();
				while (email.indexOf("@")==-1)
				{	System.out.println("Please input a valid email address.");
					System.out.println("What is you're email address?");
					email = keyboard.nextLine();
				}
				System.out.println();
			}
			else if((!(answer.equalsIgnoreCase("yes")))&&(!(answer.equalsIgnoreCase("no"))))
			{	System.out.println("Please enter either \"yes\" or \"no\"");
			}
			else 
			{	System.out.println("You can always change your mind.");
			}
		} while ((!(answer.equalsIgnoreCase("yes")))&&(!(answer.equalsIgnoreCase("no"))));
	}
	
	public void ATMCard()
	{	String answer;
		System.out.println("With this "+CARDTYPE+", you will be able to check your balance, make withdrawals, and make deposits.");
		do {System.out.println();
			System.out.println("Would you like an "+CARDTYPE+" (yes or no)?");
			answer = keyboard.next();
			if((!(answer.equalsIgnoreCase("yes")))&&(!(answer.equalsIgnoreCase("no"))))
			{	System.out.println("Please enter either \"yes\" or \"no\"");
			}
			else {wantATMCard=(answer.equalsIgnoreCase("yes"));}
		} while ((!(answer.equalsIgnoreCase("yes")))&&(!(answer.equalsIgnoreCase("no"))));

	}
	
	public boolean getWantATMCard()
	{return wantATMCard;
	}

	
	
	public void statementDestination()
	{	Scanner keyboard2 = new Scanner(System.in);
		Scanner keyboard3 = new Scanner(System.in);
		System.out.println("Would you like this Statement sent to your address, to your email, or to both?");
		while (statementNum<1||statementNum>3)
		{	System.out.println("Please enter \"1\" for address only, \"2\" for email only, or \"3\" for both");		
			statementNum = keyboard.nextInt();
			switch (statementNum)
			{
				case 1:
				{	if((checksAmount>0)||(wantATMCard))
					{	System.out.println("Great! We will send the Statements to your house at the end of every month.");
					}
					else
					{	System.out.println("Great! We will send the Statements to your house at the end of every month.\n"
						+"What is your address?");
						address = keyboard2.nextLine();
					}
				break;
				}
				case 2:
				{	if(onlineBanking)
					{	System.out.println("Great! We will send the Statements to your email address at the end of every month.");
					}
					else
					{	System.out.println("Great! We will send the Statements to your email address at the end of every month.\n"
						+"What is your email address?");
						email = keyboard2.nextLine();
						while (email.indexOf("@")==-1)
						{	System.out.println("Please input a valid email address.");
							System.out.println("What is you're email address?");
							email = keyboard3.nextLine();
						}
					}
				break;
				}
				case 3:
				{	if((checksAmount>0)&&(onlineBanking))
					{	System.out.println("Great! We will send the Statements to both your house and your email address at the end of every month.");
					}
					else if (onlineBanking)
					{	System.out.println("Great! We will send the Statements to both your house and your email address at the end of every month.\n"
						+"What is your address?");
						address = keyboard2.nextLine();
					}
					else if (checksAmount>0)
					{	System.out.println("Great! We will send the Statements to both your house and your email address at the end of every month.\n"
						+"What is your email address?");
						email = keyboard2.nextLine();
						while (email.indexOf("@")==-1)
						{	System.out.println("Please input a valid email address.");
							System.out.println("What is you're email address?");
							email = keyboard3.nextLine();
						}
					}
					else
					{	System.out.println("Great! We will send the Statements to both your house and your email address at the end of every month.\n"
						+"What is your email address?");
						email = keyboard2.nextLine();
						while (email.indexOf("@")==-1)
						{	System.out.println("Please input a valid email address.");
							System.out.println("What is you're email address?");
							email = keyboard2.nextLine();
							System.out.println("What is your address?");
							address = keyboard3.nextLine();
						}
					}
				break;
				}
			}
		}
	}
	
	public String newAddress()
	{Scanner keyboard2 = new Scanner(System.in);
	System.out.println("What is your address?");
	address = keyboard2.nextLine();
	return address;
	}
	
	public String getAddress()
	{return address;
	}
	
	public String getCusName()
	{return cusName;
	}
	
	public double initialBalance()
	{	System.out.println("How much will you be depositing to open your account?");
		initialBalance = keyboard.nextDouble();
		while (initialBalance<100)
			{System.out.println("I'm sorry, but to open an account you must make an initial deposit of $100 or greater");
			System.out.println("How much will you be depositing to open your account?");
			initialBalance = keyboard.nextDouble();
			}
		return initialBalance;
	}
	
	public void writeOutput()
	{	System.out.println("You're Savings account will be opened with an inital deposit of $"+initialBalance);
		System.out.println("You will have a APR rate of "+INTERESTRATE+"% charged monthly");
			if(checksAmount>0)
			{	System.out.print("We will be sending "+checksAmount+" checkbooks ");
				if (wantATMCard)
				{	System.out.print("and your "+CARDTYPE);
				}
					if ((statementNum==1)||(statementNum==3))
					{	System.out.print(" and your monthly statement");
					}
			System.out.println("to this address: \n" + address);
			}	
			else if (wantATMCard)
			{	System.out.print("We will be sending your "+CARDTYPE);
				if ((statementNum==1)||(statementNum==3))
				{	System.out.print(" and your monthly statement");
				}
			System.out.println(" to this address: \n" + address);
			}
			else if (statementNum==1||statementNum==3)
			{	System.out.print("We will be sending your monthly statement to this address: \n" + address);
			}
		if (onlineBanking)
		{System.out.println("You have choose to opt in for Online Banking\n"
		+"You're username and password are:\n"
		+"username: "+username+"\n"
		+"password: "+password+"\n");
		}
		if (statementNum==2)
		{System.out.println("We will send a monthly statement to your email address at: "+email);
		}
		if (checksAmount>0)
		{System.out.println("After subtracting the cost of your checkbooks, your current balance is $"+(initialBalance-checkbooksBalance));
		}
	}
	

}//class SavingsAccount