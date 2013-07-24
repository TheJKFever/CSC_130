/*Author: Jon Koehmstedt
Date: 12/4/12
This is a class definition for a home address
*/


import java.util.Scanner;

public class Address
{

	Scanner keyboard = new Scanner(System.in);
	//Instance variables
	private String state; 
	private String city; 
	private String zip; 
	private String street; 
	private String apt="None";
	private int house;

	//Constructors
	public Address()
	{	set(0, "None yet", "None", "None yet", "None yet", "None yet");
	}
	public Address(int house, String street, String city, String state, String zip)
	{	set(house, street, "None", city, state, zip);
	}
	public Address(int house, String street, String apt, String city, String state, String zip)
	{	set(house, street, apt, city, state, zip);
	}
	
	//public methods
	public void readInput()
	{	System.out.println("Please enter the hosue number and street name");
		house = keyboard.nextInt();
		street = keyboard.nextLine();
		street = street.trim();
		System.out.println("Please enter the city");
		city = keyboard.next();
		System.out.println("Please enter the state");
		state = keyboard.next();
		System.out.println("Please enter the zip code");
		zip = keyboard.next();
		System.out.println("Is there an apartment number?");
		String tempAnswer = keyboard.next();
		while ((!tempAnswer.equalsIgnoreCase("yes"))||(!tempAnswer.equalsIgnoreCase("no")))
			{System.out.println("Please enter either \"yes\" or \"no\"");
			tempAnswer = keyboard.next();
			}
		if (tempAnswer.equalsIgnoreCase("yes"))
			{System.out.println("Please enter the Apt. number");
			apt = keyboard.next();
			}
		else apt = "None";
	}

	public void writeOutput()
	{	System.out.println("The address is: \n"+house+" "+street);
		if (apt.equals("None"));
		else
			System.out.println("Apt. #: "+apt);
		System.out.println(city+", "+state+" "+zip); 
	}

	boolean comesBefore(Address otherAddress)
	{	return  (state.compareTo(otherAddress.state)<=0)&&
				(city.compareTo(otherAddress.city)<=0)&&
				(zip.compareTo(otherAddress.zip)<=0)&&
				(street.compareTo(otherAddress.street)<=0)&&
				(house<=(otherAddress.house))&&
				(apt.compareTo(otherAddress.apt)<0);
	}	
	
	
	//Private methods
	private void set(int house1, String street1, String apt1, String city1, String state1, String zip1)
	{	house=house1;
		street=street1;
		apt=apt1;
		city=city1;
		state=state1;
		zip=zip1;
	}
	
	
	//method tests
	public boolean testDefault()
	{	return ((state.equals("None yet"))&&
				(city.equals("None yet"))&&
				(zip.equals("None yet"))&&
				(street.equals("None yet"))&&
				(apt.equals("None"))&&(house==0));
	}
	
	public boolean testNoApt(int house, String street, String city, String state, String zip)
	{	return ((state.equals(state))&&
				(city.equals(city))&&
				(zip.equals(zip))&&
				(street.equals(street))&&
				(apt.equals("None"))&&(house==house));
	}
	
	public boolean testApt(int house, String street, String Apt, String city, String state, String zip)
	{	return ((state.equals(state))&&
				(city.equals(city))&&
				(zip.equals(zip))&&
				(street.equals(street))&&
				(apt.equalsIgnoreCase(Apt))&&(house==house));
	}
	
	//main for testing
	public static void main (String[] args)
	{	
		//default constructor test
		Address address1 = new Address();
		System.out.println("Test default constructor: ");
		System.out.println("input: \"Address address1 = new Address()\"");
		System.out.println("output: ");
		address1.writeOutput();
		System.out.print("Default constructor test: ");
			if (address1.testDefault())
				System.out.println("PASS");
			else
				System.out.println("FAIL");
		System.out.println();
		
		//noApt constructor test				
		Address address2 = new Address(4555, "Main Street", "Annandale", "VA", "22003");
		System.out.println("Test noApt constructor: ");
		System.out.println("input: \"Address address2 = new Address(4555, \"Main Street\", \"Annandale\", \"VA\", \"22003\")\"");
		System.out.println("output: ");
		address2.writeOutput();
		System.out.print("NoApt constructor test: ");
			if (address2.testNoApt(4555, "Main Street", "Annandale", "VA", "22003"))
				System.out.println("PASS");
			else
				System.out.println("FAIL");
		System.out.println();				

		//Apt constructor test				
		Address address3 = new Address(4555, "Main Street", "A", "Annandale", "VA", "22003");
		System.out.println("Test Apt constructor: ");
		System.out.println("input: \"Address address2 = new Address(4555, \"Main Street\", \"A\", \"Annandale\", \"VA\", \"22003\")\"");
		System.out.println("output: ");
		address3.writeOutput();
		System.out.print("Apt constructor test: ");
			if (address3.testApt(4555, "Main Street", "A", "Annandale", "VA", "22003"))
				System.out.println("PASS");
			else
				System.out.println("FAIL");
		System.out.println();				

		
	}



	






}//class Address