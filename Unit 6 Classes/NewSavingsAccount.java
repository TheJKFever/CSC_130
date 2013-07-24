import java.util.Scanner;
/**
Class for New Savings Account Dialog
*/

public class NewSavingsAccount
{	
	public static void main (String[] args)
	{	
	
	Scanner keyboard = new Scanner(System.in);
	int checksAmount=0;
	
		SavingsAccount bob = new SavingsAccount();
	
		//Welcome	
		bob.newCustomerName();
		System.out.println();
		System.out.println("Welcome "+bob.getCusName()+"! We are glad you're interested in opening a Savings Account today!\n"
		+"We are sure you'll be pleased with our many features\n"
		+"I'm going to ask you a few questions to find out how we can best serve you");
		//make initial deposit
		System.out.println();
		System.out.println("First things first "+bob.getCusName()+". You must make an initial deposit to open your Savings Account.");
		System.out.println();
		bob.initialBalance();
		System.out.println();
		System.out.println("Wonderful! Now that you have funds in your account, let me tell you about the interest you'll be earning.");
		System.out.println();
		bob.explainInterest();
		System.out.println("You are also able to use checks for this account");
		checksAmount = bob.checkbooksAmount(checksAmount);
			if (checksAmount>0)
			{	System.out.println("Great! We will have them shipped to your house right away.");
				bob.newAddress();
				System.out.print("Great!");
			}
			else 
			{	System.out.println("That's okay, who needs checks for a Savings Account!");
			System.out.print("Moving on...");
			}
		System.out.println();
		System.out.println("You are entitled to a free ATM card.");
		bob.ATMCard();
			if(bob.getWantATMCard())
			{	if(checksAmount>0)
					{System.out.println("Great! We will have it shipped to your house right away, along with your checks.");}
				else
					{System.out.println("Great! We will have it shipped to your house right away.");
					bob.newAddress();
					}
			}
			else System.out.println("That's okay, who needs an ATM card with a Savings Account!");
		System.out.println();
		System.out.println("Before we move on I must tell you about overdraft charges");
		bob.explainOverdraftCharges();
		System.out.println("Enough about the overdraft charges, did I tell you about online banking?");
		bob.wantOnlineBanking();
		System.out.println("At the end of each month we will send you a Statement summarizing your account.");
		bob.statementDestination();
		System.out.println("Well it seems I have all the information I need");
		System.out.println();
		bob.writeOutput();
		System.out.println();
		System.out.println("Congratulations on opening a new savings account "+bob.getCusName());		
		System.out.println("I hope you have a great rest of your day!");
	
	}//main
}//class	