/*Author: Jon Koehmstedt
11/20/2012
This program asks for three numbers and finds the average and the min anad max*/

import java.util.Scanner;

public class threeNum
{
	public static void main(String[] args)
	{
		float n1, n2, n3, ave, min, max;
		String phrase;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("I will ask you for three numbers and then\n"
		+"tell you the average, the least, and the greatest number\n");
		System.out.println("Now please enter the first number");
		n1 = keyboard.nextFloat();
		
		System.out.println("\nNow enter the second number");
		n2 = keyboard.nextFloat();
		
		System.out.println("\nNow enter the third and final number\n");
		n3 = keyboard.nextFloat();
		ave = ((n1+n2+n3)/3);
		
		if(n1==n2)
			if(n1==n3)
				{min = n1; max = n1;
				phrase = "The average is "+ave+
				"\n"+n1+", "+n2+", and "+n3+" are all the same value";}
			else if(n1<n3)
				{min = n1; max = n3;
				phrase = "The average is "+ave+
				"\n"+n1+" and "+n2+" are tied for the least"+
				"\n"+n3+" is the greatest";}
			else
				{min = n3; max = n1;
				phrase = "The average is "+ave+
				"\n"+n1+" and "+n2+" are tied for the greatest"+
				"\n"+n3+" is the least";}
		else if(n1<n2)
			if(n1==n3)
				{min = n1; max = n2;
				phrase = "The average is "+ave+
				"\n"+n1+" and "+n3+" are tied for the least"+
				"\n"+n2+" is the greatest";}
			else if(n1<n3)
				if(n2<n3)
					{min = n1; max = n3;
				phrase = "The average is "+ave+
				"\n"+n1+" is the least"+
				"\n"+n3+" is the greatest";}
				else
					{min = n1; max = n2;
				phrase = "The average is "+ave+
				"\n"+n1+" is the least"+
				"\n"+n2+" is the greatest";}
			else
				{min = n3; max = n2;
				phrase = "The average is "+ave+
				"\n"+n3+" is the least"+
				"\n"+n2+" is the greatest";}
		else if(n1==n3)
			{min = n2; max = n1;
			phrase = "The average is "+ave+
			"\n"+n2+" is the least"+
			"\n"+n1+" and "+n3+" are tied as the greatest";}
		else if(n1<n3)
			{min = n2; max = n3;
			phrase = "The average is "+ave+
			"\n"+n2+" is the least"+
			"\n"+n3+" is the greatest";}
		else if(n2>n3)
			{min = n3; max = n1;
			phrase = "The average is "+ave+
			"\n"+n3+" is the least"+
			"\n"+n1+" is the greatest";}
		else
			{min = n2; max = n1;
			phrase = "The average is "+ave+
			"\n"+n2+" is the least"+
			"\n"+n1+" is the greatest";}
		
		System.out.println("\n"+phrase);
	
	}//main
}//class


