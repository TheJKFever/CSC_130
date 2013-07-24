import java.util.Scanner;

/*

This is a program to purchase seats at a theater
*/


public class Theater
{

Scanner keyboard = new Scanner(System.in);

private static int rowToPurchase=0;
private static int seatToPurchase=0;
private static int dollar=0;
private static int i;

//Set Theater Seating Chart
private static int[][] theaterSeatingChart = {
{30,40,50,50,50,50,50,50,40,30},
{20,30,30,40,50,50,40,30,30,20},
{20,20,30,30,40,40,30,30,20,20},
{10,10,20,20,20,20,20,20,10,10},
{10,10,20,20,20,20,20,20,10,10},
{10,10,20,20,20,20,20,20,10,10},
{10,10,10,10,10,10,10,10,10,10},
{10,10,10,10,10,10,10,10,10,10},
{10,10,10,10,10,10,10,10,10,10}
};



//I decided not to use this
/*set unique price ArrayList
private static void unique(int[][])
	{ArrayList<String> uniquePrices = new ArrayList<String>();
	uniquePrices.add(theaterSeatingChart[0][0]);
		for (i=0;i<theaterSeatingChart.length; i++) 
		{	for (int j=0;j<theaterSeatingChart[i].length;j++) 
			{	if ((uniquePrices.indexOf(theaterSeatingChart[i][j]))==-1)
					uniquePrices.add(theaterSeatingChart[i][j]);
			}
		}
	}
*/


//method to purchase by price
public void purchaseByPrice()
{	boolean tryAgain=false;
	String tempAnswer;
	//asks for a certain price
	do {System.out.println("Please choose the price that you are willing to pay?");
		System.out.println("($10, $20, $30, $40, or $50)");
		dollar = keyboard.nextInt();//takes in dollar amount
		if (dollar==10)
		if ((dollar!=10)&&(dollar!=20)&&(dollar!=30)&&(dollar!=40)&&(dollar!=50))
		{	System.out.println("Please choose only from $10, $20, $30, $40, or $50");
			tryAgain=true;
		}
		else
		{	//seat is not available want to try again
			if (priceAvailable(dollar)==false)
			{	System.out.println("Sorry but no seats are available at that price.");
				System.out.println("Would you like to try another price?");
				tempAnswer = keyboard.next();
				while (!tempAnswer.equalsIgnoreCase("yes")&&!tempAnswer.equalsIgnoreCase("no")&&!tempAnswer.equalsIgnoreCase("y")&&!tempAnswer.equalsIgnoreCase("n"))
				{	System.out.println("Please only enter yes or no");
					tempAnswer = keyboard.next();}
				if ((tempAnswer.equalsIgnoreCase("yes"))||(tempAnswer.equalsIgnoreCase("y")))
					tryAgain=true;
			}
		}
	}	while (tryAgain);
	if (priceAvailable(dollar))
	{do {	System.out.println("Here are all the seats at that price that are still available");
		for (i=0;i<theaterSeatingChart.length; i++) 
			{	for (int j=0;j<theaterSeatingChart[i].length;j++) 
				{	if (dollar==theaterSeatingChart[i][j])
					{System.out.print("ROW: "+(i+1)+", ");
					System.out.println("SEAT: "+(j+1));
					}
				}
			}
	chooseSeat();
	if (seatAvailable(rowToPurchase,seatToPurchase)==false)
		System.out.println("Sorry, that seat is unavailable, please choose only from the list below");
	} while (seatAvailable(rowToPurchase,seatToPurchase)==false);
	finalizePurchase();
	}
}

//method to purchase by seat number
public void purchaseBySeat()
{do{System.out.println("Here is a list of all available seats");
	for (i=0;i<theaterSeatingChart.length; i++) 
		{	for (int j=0;j<theaterSeatingChart[i].length;j++) 
			{	if (seatAvailable((i+1),(j+1))==true)
				{System.out.print("ROW: "+(i+1)+", ");
				System.out.println("SEAT: "+(j+1));
				}
			}
		}
	chooseSeat();
	if (seatAvailable(rowToPurchase,seatToPurchase)==false)
		System.out.println("Sorry, that seat is unavailable, please choose only from the list below");
	} while (seatAvailable(rowToPurchase,seatToPurchase)==false);
finalizePurchase();
}

public void finalizePurchase()
{	String tempAnswer;
	System.out.println("You have choosen to purchase ROW: "+rowToPurchase+", SEAT: "+seatToPurchase);
	System.out.println("That seat cost: $"+theaterSeatingChart[(rowToPurchase-1)][(seatToPurchase-1)]);
	System.out.println("Would you like to finalize this purchase now?");
	tempAnswer = keyboard.next();
	while (!tempAnswer.equalsIgnoreCase("yes")&&!tempAnswer.equalsIgnoreCase("no")&&!tempAnswer.equalsIgnoreCase("y")&&!tempAnswer.equalsIgnoreCase("n"))
		{	System.out.println("Please only enter yes or no");
			tempAnswer = keyboard.next();}
	if ((tempAnswer.equalsIgnoreCase("yes"))||(tempAnswer.equalsIgnoreCase("y")))
		theaterSeatingChart[(rowToPurchase-1)][(seatToPurchase-1)]=0;					
}


public int getNumTicketsAvailable()
{	int numAvailable = 0;
	for (i=0;i<theaterSeatingChart.length; i++) 
		{	for (int j=0;j<theaterSeatingChart[i].length;j++) 
			{	if (theaterSeatingChart[i][j]!=0)
				{numAvailable++;}
			}
		}
	return numAvailable;
}
	
	//tests to see if seats are available at given price	
private boolean priceAvailable(int dollar1)
{	boolean priceAvailable=false;
	i=0;
	while ((priceAvailable==false)&&(i<theaterSeatingChart.length))
	{	for (i=0;i<theaterSeatingChart.length; i++) 
		{	for (int j=0;j<theaterSeatingChart[i].length;j++) 
			{	if (dollar1==theaterSeatingChart[i][j])
				{priceAvailable=true;}
			}
		}
	} 
	return priceAvailable;
}
	

private boolean seatAvailable(int rowToPurchase1, int seatToPurchase1)
{	boolean seatAvailable=false;
	if (seatCost(rowToPurchase1,seatToPurchase1)!=0)
		seatAvailable=true;
	return seatAvailable;
}

private int seatCost(int rowToPurchase1, int seatToPurchase1)
{ return (theaterSeatingChart[rowToPurchase1-1][seatToPurchase1-1]);
}
	
	
private void chooseSeat()
{do {System.out.println("Please type in the Row and Seat number you would like to purchase?");
	rowToPurchase = keyboard.nextInt();
	seatToPurchase = keyboard.nextInt();
	if ((rowToPurchase>=(theaterSeatingChart.length-1))||(seatToPurchase>=(theaterSeatingChart[0].length-1)))
		System.out.println("That is not a valid seat, please choose between rows 1-9, and seats 1-10");
	} while ((rowToPurchase>=(theaterSeatingChart.length-1))||(seatToPurchase>=(theaterSeatingChart[0].length-1)));
}	
		
}//class Theater