/*Author: Jon Koehmstedt
11/20/2012
This program gives the nth term of the fibonacci sequence*/

import java.util.Scanner;

public class FibSeq
{
	public static void main(String[] args)
	{
		int n, i=3, fOld1=1, fOld2=1, fNew=2;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("The Fibonacci Sequence is a sequence of numbers\n"
		+"that finds the next term by adding the privious two.\n"
		+"I will determine the value of the term at the nth term that you choose.");
		System.out.println("Please tell at which term you would like to know the value?");
		n = keyboard.nextInt();
		System.out.print("\n");
		
		if(n<1)
		System.out.println("Please enter a positive integer");
		
		else if(n==1)
		System.out.println("The value of the 1st term of the Fibonacci Sequence is 1");
		
		else if(n==2)
		System.out.println("The value of the 2nd term of the Fibonacci Sequence is 1");
		
		else if(n==3)
		System.out.println("The value of the 3rd term of the Fibonacci Sequence is 2");
		
		else
		{	while(i <= n)
			{fNew=fOld1+fOld2;
			fOld1=fOld2;
			fOld2=fNew;
			i++;		
			}
		System.out.println("The value of the "+n+" term of the Fibonacci Sequence is "+fNew);
		}
	}//main
}//class


