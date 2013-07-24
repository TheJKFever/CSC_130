import java.util.Scanner;
/**
Class for Savings Accounts
*/

public class SavingsAccount
{
	Scanner keyboard = new Scanner(System.in);
	
	//Savings accounts can only have ATM Cards
	public static final String CARDTYPE = "ATM Card";
	
	//Instance Variables
	private double balance, checkbookCost = 5.99, overDraftCharge=39.99, interestRate=0;
	private boolean ATMCard, onlineBanking, onlineStatement;
	
	//Static Variables
	private static int checksCount, statementNum=0;
	private static double checkbooksBalance=0, initalBalance;
	
	
	//Constructors
	public SavingsAccount()
	{	balance=0;
		getInterestRate();
		ATMCard=false;
		onlineBanking=false;
		onlineStatement=false;
	}
	public SavingsAccount(boolean ATMCard1, boolean onlineBanking1, boolean onlineStatment1)
	{	balance=0;
		getInterestRate();
		ATMCard=ATMCard1;
		onlineBanking=onlineBanking1;
		onlineStatement=onlineStatment1;
	}
	
	/*public Methods
	<orderChecks, orderATMCard, registerOnlineBanking, makeDeposit, makeWithdrawal, 
	getBalance, openAccount, setInterestRate, explainHowSavingsAccountWorks, setInterestRate>
	*/
	
	public void orderChecks()
	{	String tempanswer="no";
		while (tempanswer="no")
		{	System.out.println("How many checkbooks would you like to order?");
			numberOfChecks = keyboard.nextInt();
			while(numberOfChecks<0)
				{System.out.println("Please enter a positive integer or 0 for none");
				numberOfChecks = keyboard.nextInt();
				}
			if(numberOfChecks==0)
				{System.out.println("Are you sure you don't want any checks?");
				yesOrNoOnly(tempanswer = keyboard.next());
				}
			else if (numberOfChecks>0)
				{
				while ((balance - (numberOfChecks * checkbookCost))<0)
					{
					System.out.println("Sorry but you have insufficient funds to purchase that many checkbooks.");
					System.out.println("Would you like to make a deposit now?");
					yesOrNoOnly(tempanswer = keyboard.next());
					if (tempanswer.equalsIgnoreCase("yes"))
						this.makeDesposit();
					}
				System.out.println("That will cost "+(numberOfChecks * checkbookCost)+".");
				System.out.println("Is that alright?");
				yesOrNoOnly(tempanswer = keyboard.next());
				if(tempanswer.equalsIgnoreCase("yes");
					System.out.println("Great!");
				checksCount = (checksCount + numberOfChecks)
				}
		}
	}

	public void orderATMCard
	{	String tempanswer="no";
		while (tempanswer="no")
		{	if(ATMCard=true)
				{System.out.println("It seems that you already have an ATM card.");
				System.out.println("Do you need to order a new one?");}
			else 
				System.out.println("Would you like to order an ATM card?");
			yesOrNoOnly(tempanswer = keyboard.next());
			if(tempanswer.equalsIgnoreCase="yes")
				System.out.println("Great we'll send one to you right away");
			else
				{System.out.println("Are you sure you do not want an ATM Card?");
				yesOrNoOnly(tempanswer = keyboard.next());
				}
		}
	}
	
	
	private String yesOrNoOnly(tempanswer)
		while ((!tempanswer.equalsIgnoreCase("yes"))||(!tempanswer.equalsIgnoreCase("no")))
			{System.out.println("Please enter \"yes\" or \"no\"");
			tempanswer = keyboard.next();
			}
		return tempanswer;
	
	public void explainHowSavingsAccountWorks()
	{	System.out.println("By creating a Savings Account, you now are able to save your money at our bank.\n");
		if (interestRate=0)
			{System.out.println("You will earn interest on the average monthly balance you hold in this account at a rate determined based on your credit score+\n");
			}
		else {System.out.println("You will earn interest on the average monthly balance you hold in this account at the rate of: " + INTERESTRATE +"%\n");
			}
		System.out.println("We will issue you checks at $" + checkbookCost + " per checkbook.\n");
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
	
	public int checkbooksAmount(int checksCount)
	{	String answer="yes";
	Scanner keyboard2 = new Scanner(System.in);
		do {System.out.println("How many checkbooks would you like?");
				checksCount = keyboard.nextInt();
				if (checksCount<0)
				{	System.out.println("Please enter an amount greater or equal to 0");
				}
				else if (checksCount>0)
				{	System.out.println("at $" + CHECKBOOKCOST + " per checkbook, that will cost $" + (CHECKBOOKCOST * checksCount));
					checkbooksBalance = (CHECKBOOKCOST * checksCount);
					System.out.println("Is that okay (yes or no)?");
					answer = keyboard2.nextLine();
				}
				else if (checksCount==0)
				{	System.out.println("You do not want any checks.");
					checkbooksBalance = (CHECKBOOKCOST * checksCount);
					System.out.println("Is that correct (yes or no)?");			
					answer = keyboard2.nextLine();
				}
			} while (!(answer.equalsIgnoreCase("yes"))||(checksCount<0));
			return checksCount;
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
				{	if((checksCount>0)||(wantATMCard))
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
				{	if((checksCount>0)&&(onlineBanking))
					{	System.out.println("Great! We will send the Statements to both your house and your email address at the end of every month.");
					}
					else if (onlineBanking)
					{	System.out.println("Great! We will send the Statements to both your house and your email address at the end of every month.\n"
						+"What is your address?");
						address = keyboard2.nextLine();
					}
					else if (checksCount>0)
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
			if(checksCount>0)
			{	System.out.print("We will be sending "+checksCount+" checkbooks ");
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
		if (checksCount>0)
		{System.out.println("After subtracting the cost of your checkbooks, your current balance is $"+(initialBalance-checkbooksBalance));
		}
	}
	

}//class SavingsAccount