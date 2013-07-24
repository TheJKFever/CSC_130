/*Jon Koehmstedt
Unit 6 - Problem 3 
11/27/12
This file defines the class MovieRatings 
*/
import java.util.Scanner;

public class MovieRatings
{
	private String name, mPAARating;
	private int tempRating, terribleCount=0, badCount=0, oKCount=0, goodCount=0, greatCount=0, totalRatings=0;

	Scanner keyboard = new Scanner(System.in);
	
	/**Read in all the inputs*/
	public void readInput()
	{boolean goodParameters;
		System.out.println("What is the name of the movie?");
		name = keyboard.nextLine();
		do {System.out.println("What is the MPAA Rating of this movie? (please enter G, PG, PG-13, or R)");
		mPAARating = keyboard.nextLine();
		goodParameters = (mPAARating.equalsIgnoreCase("G")||mPAARating.equalsIgnoreCase("PG")||mPAARating.equalsIgnoreCase("PG-13")||mPAARating.equalsIgnoreCase("R"));
		} while (goodParameters==false);
	}

	/**This outputs a summary of this object*/	
	public void writeOutput()
	{	System.out.println("The movie name is: "+name);
		System.out.println("The MPAA Rating of this movie is: "+mPAARating);
		System.out.println("This movie has revied "+terribleCount+" terrible ratings.");
		System.out.println("This movie has revied "+badCount+" bad ratings.");
		System.out.println("This movie has revied "+oKCount+" OK ratings.");
		System.out.println("This movie has revied "+goodCount+" good ratings.");
		System.out.println("This movie has revied "+greatCount+" great ratings.");
		System.out.println("This movie has had a total of "+totalRatings+" ratings");
		System.out.println("The average rating for this movie is "+getAverage());	
	}
	
	public void addRating()
	{String tempAnswer2;
	Scanner keyboard2 = new Scanner(System.in);
	do{System.out.println("How would you rate this movie?");
		System.out.println("Please enter \n\"1\" for terrible \n\"2\" for bad\n\"3\" for OK\n\"4\" for good\n\"5\" for great!");
		tempRating = keyboard.nextInt();
		while ((tempRating<1||tempRating>5))
		{System.out.println("Please enter only 1, 2, 3, 4, or 5");
		System.out.println("Please enter \n\"1\" for terrible \n\"2\" for bad\n\"3\" for OK\n\"4\" for good\n\"5\" for great!");
		tempRating = keyboard.nextInt();}
		totalRatings+=1;
		switch (tempRating)
		{	case 1: terribleCount++;
			break;
			case 2: badCount++;
			break;
			case 3: oKCount++;
			break;
			case 4: goodCount++;
			break;
			case 5: greatCount++;
			break;
		}
		System.out.println("Would you like to add another rating?");
		tempAnswer2 = keyboard2.nextLine();
		switch (tempAnswer2)
		{	case "Y":
			case "y":
			break;
			case "N":
			case "n":
			break;
			default: System.out.println("That's Ridiculous!\n");
			break;
		}
		} while (tempAnswer2.equalsIgnoreCase("Y"));		
	}
	
	/**This gives the Average rating*/
	public double getAverage()
	{	
		return (((terribleCount*1)+(badCount*2)+(oKCount*3)+(goodCount*4)+(greatCount*5))/totalRatings);
	}
	
	/**This gives the Terrible rating*/
	public int getTerrible()
	{	
		return terribleCount;
	}
		
	/**This gives the Bad rating*/
	public int getBad()
	{	
		return badCount;
	}

	/**This gives the OK rating*/
	public int getOK()
	{	
		return oKCount;
	}

	/**This gives the Good rating*/
	public int getGood()
	{	
		return goodCount;
	}

	/**This gives the Great rating*/
	public int getGreat()
	{	
		return greatCount;
	}
	
	/**This sets new info for a movie*/
	public void setMovieInfo(String newName,String newMPAARating)
	{	name = newName;
		mPAARating = newMPAARating;
		boolean goodParameters = (mPAARating.equalsIgnoreCase("G")||mPAARating.equalsIgnoreCase("PG")||mPAARating.equalsIgnoreCase("PG-13")||mPAARating.equalsIgnoreCase("R"));
		while (goodParameters==false)
			{System.out.println("What is the MPAA Rating of this movie? (please enter G, PG, PG-13, or R)");
			mPAARating = keyboard.nextLine();
			goodParameters = (mPAARating.equalsIgnoreCase("G")||mPAARating.equalsIgnoreCase("PG")||mPAARating.equalsIgnoreCase("PG-13")||mPAARating.equalsIgnoreCase("R"));
			}
		System.out.println("Reset the rating values? Y or N");
		String tempAnswer = keyboard.nextLine();
		switch (tempAnswer)
		{	case "Y":
			case "y": terribleCount=0; badCount=0; oKCount=0; goodCount=0; greatCount=0; totalRatings=0;
			break;
			case "N":
			case "n":
			break;
			default: System.out.println("That's Ridiculous!\n");
			break;
		}
	}
	
	/**This checks it two movies are the same*/
	public boolean equals(MovieRatings otherMovie)
	{
		return ((name.equalsIgnoreCase(otherMovie.name))&&(mPAARating.equalsIgnoreCase(otherMovie.mPAARating)));
	}
	
	
	
	
	
	


}//MovieRatings