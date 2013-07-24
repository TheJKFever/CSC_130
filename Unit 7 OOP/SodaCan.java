/*Author: Jon Koehmstedt
Date: 12/4/12
This is a class definition for a Soda can and it's shape and volume
*/

/*<METHODS: readInput(), writeOutput(), calculateSodaCanSurfaceArea(height, radius), 
calculateSodaCanVolume(height, radius), getSodaCanSurfaceArea(), getSodaCanVolume()>

<TEST METHODS: testSurfaceArea(), testVolume()>*/

import java.util.Scanner;

public class SodaCan
{

	Scanner keyboard = new Scanner(System.in);
	//Instance variables
	private double height, radius, volume, surfaceArea;
	private String radiusString, heightString, volumeString, surfaceAreaString;

	//Constructors
	public SodaCan()
	{	set(0, 0, 0, 0);}
	public SodaCan(double height, double radius)
	{	set(height, radius, 0, 0);
		setCalculations(height, radius);
	}
		
	//public methods
	public void readInput()
	{	System.out.println("Please enter the height of the soda can");
		height = keyboard.nextInt();
		while(height<=0)
			{System.out.println("Please enter a positive number for the height of the soda can.");
			System.out.println("Please enter the height of the soda can");
			height = keyboard.nextInt();
			}
		heightString = new Double(height).toString();	
		System.out.println("Please enter the radius of the soda can");
		radius = keyboard.nextInt();
		while(radius<=0)
			{System.out.println("Please enter a positive number for the radius of the soda can.");
			System.out.println("Please enter the radius of the soda can");
			radius = keyboard.nextInt();
			}
		radiusString = new Double(radius).toString();
		setCalculations(height, radius);
	}

	public void writeOutput()
	{	System.out.println("The height of the can is: "+heightString);
		System.out.println("The radius of the can is: "+radiusString);
		System.out.println("The surface area of the soda can is: "+surfaceAreaString);
		System.out.println("The volume of the soda can is: "+volumeString);
		System.out.println(); 
	}
	
	public double calculateSodaCanSurfaceArea(double height, double radius)
	{	return ((2*Math.PI * radius * radius)+(2 * Math.PI * radius * height));
	}

	public double calculateSodaCanVolume(double height, double radius)
	{	volume = (Math.PI * radius * radius * height);
		return volume;
	}

	public double getSodaCanSurfaceArea()
	{	return surfaceArea;
	}

	public double getSodaCanVolume()
	{	return volume;
	}
	
	
	//Private methods
	private void set(double height1, double radius1, double volume1, double surfaceArea1)
	{	height=height1;
		if (height==0)
			heightString="None Yet";
		else 
			heightString = new Double(height).toString();
		
		radius=radius1;
		if (radius==0)
			radiusString="None Yet";
		else 
			radiusString = new Double(radius).toString();
		
		volume=volume1;
		if (volume==0)
			volumeString="N/A";
		else 
			volumeString = new Double(volume).toString();	
		
		surfaceArea=surfaceArea1;
		if (surfaceArea==0)
			surfaceAreaString="N/A";
		else 
			surfaceAreaString = new Double(surfaceArea).toString();		
	}
	
	private void setCalculations(double height1, double radius1)
	{	volume = calculateSodaCanVolume(height1, radius1);
		volumeString = new Double(volume).toString();
		surfaceArea = calculateSodaCanSurfaceArea(height1, radius1);
		surfaceAreaString = new Double(surfaceArea).toString();
	}
	
	//method tests
	public boolean testSurfaceArea(double height1, double radius1)
	{	return (surfaceArea==calculateSodaCanSurfaceArea(height1, radius1));
	}

	public boolean testVolume(double height1, double radius1)
	{	return (volume==calculateSodaCanVolume(height1, radius1));
	}
	
	
	//main for testing
	public static void main (String[] args)
	{	
		//Surface area test
		System.out.println("Test surface area calculator: ");
		System.out.println("height = 4, raidus = 2");
		System.out.println("Surface area should equal 75.39822368615503");
		SodaCan testCan = new SodaCan(4,2);
		System.out.print("Surface area test: ");
			if (testCan.testSurfaceArea(testCan.height, testCan.radius))
				System.out.println("PASS");
			else
				System.out.println("FAIL");
		System.out.print("75.39822368615503 = ");
		testCan.getSodaCanSurfaceArea();
		System.out.println();
		
		System.out.println();
		//Volume test
		System.out.println("Test volume calculator: ");
		System.out.println("height = 4, raidus = 2");
		System.out.println("Volume should equal 50.26548245743669");
		System.out.print("Volume test: ");
			if (testCan.testVolume(testCan.height, testCan.radius))
				System.out.println("PASS");
			else
				System.out.println("FAIL");
		System.out.print("50.26548245743669 = ");
		testCan.getSodaCanVolume();
		System.out.println();		
	}



	






}//class Address