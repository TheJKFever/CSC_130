/*Author: Jon Koehmstedt
Date: 12/4/12
This is a class definition for a Car
*/

/*<METHODS: readInput(), writeOutput(), calculateSodaCanSurfaceArea(height, radius), 
calculateSodaCanVolume(height, radius), getSodaCanSurfaceArea(), getSodaCanVolume()>

<TEST METHODS: testSurfaceArea(), testVolume()>*/

import java.util.Scanner;

public class Car
{
	Scanner keyboard = new Scanner(System.in);

	//Instance variables
	private double fuelEff /*Miles/Gallon*/, fuelAmount /*in Gallons*/, tankSize /*Gallons in tank*/;
	
	//Constructors
	public Car()
	{	do {System.out.println("Please enter the fuel effeciency of this car in miles/gallon");
			fuelEff = keyboard.nextDouble();
			} while (fuelEff<=0);
		fuelAmount=0;
		do {System.out.println("Please enter maximum amount of gallons this car can hold in gallons");
			tankSize = keyboard.nextDouble();
			} while (tankSize<=0);
	}
	public Car(double fuelEff1)
	{	set(fuelEff1);
	}
		
	//public methods
	
	public void addGas()
	{ 	if (fuelAmount==tankSize)
			System.out.print("The tank is already full");
		else
		{	System.out.println("There is currently "+fuelAmount+" gallons in this car's tank");
			System.out.println("How much gas would you like to add? (in gallons)");
			double fuelAmount1 = keyboard.nextDouble();
			while ((fuelAmount+fuelAmount1) > tankSize)
				{System.out.println("You cannot put that much gas in this car");
				System.out.println("There is currently "+fuelAmount+" gallons in this car's tank");
				System.out.println("and the tank can only hold a total of "+tankSize+" gallons");
				System.out.println("How much gas would you like to add?");
				fuelAmount1 = keyboard.nextDouble();
				}
			while (fuelAmount1<0)
				{System.out.println("Please put only a positive amount of gas");
				System.out.println("How much gas would you like to add?");
				fuelAmount1 = keyboard.nextDouble();
				}
			System.out.println("There was "+fuelAmount+" gallons in this car's tank");
			System.out.println("Now there is "+(fuelAmount+fuelAmount1)+" gallons");
			fuelAmount = (fuelAmount+fuelAmount1);
		}
	}
	
	public void drive()
	{	double miles;
		do {System.out.println("How many miles would you like to drive?");
		miles = keyboard.nextDouble();
		if ((miles/fuelEff)>(tankSize))
			System.out.println("This car cannot drive that far, it only has a "+tankSize+" gallon capacity");
		} while ((miles/fuelEff)>(tankSize));
		while ((miles/fuelEff)>fuelAmount)
		{	if (fuelAmount==0)
			{	System.out.println("There is no gas in this car."); 
				System.out.println("Would you like to add gas?");
				if (yesOrNoOnly().equalsIgnoreCase("yes"))
					addGas();
			}
			else
			{	System.out.println("There is not enough fuel in this car to drive that far.");
				System.out.println("There is currently "+fuelAmount+" gallons in this car's tank");
				System.out.println("Would you like to add gas?");
					if (yesOrNoOnly().equalsIgnoreCase("yes"))
						addGas();
			}
		}
		System.out.println("You have now traveled "+miles+" miles.");
		fuelAmount = (fuelAmount - (miles/fuelEff));
	}

	public double getGasLevel()
	{	return fuelAmount;
	}

	public int whatToDoNext()
	{	int tempNum;
		System.out.println("What would you like to do?");
		do {if (getGasLevel()==tankSize)
				System.out.println("Enter \"1\" to drive the car\n\"3\" to see how much gas is in the car currently\nOr \"4\" to exit the program");	
			else 
				System.out.println("Enter \"1\" to drive the car\n\"2\" to add gas to the car\n\"3\" to see how much gas is in the car currently,\nOr \"4\" to exit the program");	
		 tempNum = (int)(keyboard.nextInt());			
			if ((tempNum<0)||(tempNum>4))
				{System.out.println("Please enter only 1, 2, 3, or 4");
				System.out.println();}
			} while ((tempNum<0)&&(tempNum>4));
		switch(tempNum)
		{	case 1: drive();
					System.out.println();
			break;
			case 2: addGas();
					System.out.println();
			break;
			case 3: System.out.println("There is currently "+getGasLevel()+" gallons in this car");
					System.out.println();
			break;
			case 4:
			return 4;
		}
		return 1;
	}	
	
	public static String yesOrNoOnly()
	{	Scanner keyboard2 = new Scanner(System.in);
		String yesOrNoAnswer = keyboard2.next();
		while ((!yesOrNoAnswer.equalsIgnoreCase("yes"))&&(!yesOrNoAnswer.equalsIgnoreCase("no")))
		{	System.out.println("Please enter either \"yes\" or \"no\"");
			yesOrNoAnswer = keyboard2.next();
		} return yesOrNoAnswer;
	}
	
	//Private methods
	private void set(double fuelEff1)
	{	while (fuelEff1<=0)
		{System.out.println("Please enter a positive fuel effeciency");
		fuelEff1 = keyboard.nextDouble();}
		fuelEff=fuelEff1;
		fuelAmount=0;
		do {System.out.println("Please enter maximum amount of gallons this car can hold in gallons");
			tankSize = keyboard.nextDouble();
			} while (tankSize<=0);
	}
		
}//class Car