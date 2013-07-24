import java.util.Scanner;


public class PurchaseTheaterTickets
{

public static void main (String[] args)
{
Scanner keyboard = new Scanner(System.in);

boolean customer = false;
String tempAnswer;
String purchaseType="none yet";
Theater show = new Theater();
System.out.println();
System.out.println("WELCOME TO THE THEATER!");
System.out.println("We currently have "+show.getNumTicketsAvailable()+" tickets available for the show.");
System.out.println("But they're running out fast!");
System.out.println();
System.out.println("Would you like to purchase a ticket?");
tempAnswer = keyboard.next();
	while (!tempAnswer.equalsIgnoreCase("yes")&&!tempAnswer.equalsIgnoreCase("no")&&!tempAnswer.equalsIgnoreCase("y")&&!tempAnswer.equalsIgnoreCase("n"))
	{	System.out.println("Please only enter yes or no");
		tempAnswer = keyboard.next();}
	if ((tempAnswer.equalsIgnoreCase("yes"))||(tempAnswer.equalsIgnoreCase("y")))
{do {	System.out.println("Would you like to pick a particular seat, or would you like to search for available seats by price?");
	System.out.println("Please enter \"seat\" or \"price\"");
	purchaseType = keyboard.next();
	while (!purchaseType.equalsIgnoreCase("seat")&&!purchaseType.equalsIgnoreCase("price"))
	{	System.out.println("Please enter only \"seat\" or \"price\"");
		purchaseType = keyboard.next();}
	if (purchaseType.equalsIgnoreCase("seat"))
		{show.purchaseBySeat();}
	else if (purchaseType.equalsIgnoreCase("price"))
		{show.purchaseByPrice();}

		
System.out.println("Would you like to make another purchase?");
tempAnswer = keyboard.next();
while (!tempAnswer.equalsIgnoreCase("yes")&&!tempAnswer.equalsIgnoreCase("no")&&!tempAnswer.equalsIgnoreCase("y")&&!tempAnswer.equalsIgnoreCase("n"))
	{	System.out.println("Please only enter yes or no");
		tempAnswer = keyboard.next();}
} while ((tempAnswer.equalsIgnoreCase("yes"))||(tempAnswer.equalsIgnoreCase("y")));
}


}//main
}//class PurchaseTheaterTickets