/*Author: Jon Koehmstedt
Date 11/20/12
This program shows the Drunkard's Walk location*/

import java.util.Random;

public class DrunkardsWalk
{
	public static void main(String[] args)
	{
	
	Random generator = new Random();
	
	int x=0,y=0,i=0,random;
	double distance;
	
	System.out.println("This program shows you where a drunk man would end up after 100 random intersections");
	
	
	while (i<100)
		{random = generator.nextInt(3);
		switch (random)
			{case 0: 
				x=x-1;
				break;
			case 1: 
				x=x+1;
				break;
			case 2: 
				y=y-1;
				break;
			case 3: 
				y=y+1;
				break;
			default:
				System.out.println("Random number generator not working properly");
				break;
			}
		i++;}
	distance = (Math.sqrt(((x*x)+(y*y))));
	
	System.out.print("The drunkard started at (0,0) \n"
		+"and is not at ("+x+","+y+").");
	System.out.print("The drunkard is now "+distance+" away from (0,0)");
	
	}//main
}//class