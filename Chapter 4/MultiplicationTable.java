/*Author: Jon Koehmstedt
11/20/2012
This program gives you a multiplication table up to 10*/

public class MultiplicationTable
{
	public static void main(String[] args)
	{
		int n = 1,i=10;
		
		System.out.println("I will print a Multiplication Table up to 10\n");
		
		while ( n <= 10 )
		{
		System.out.println(n+" "+2*n+" "+3*n+" "+4*n+" "+5*n+" "+6*n+" "+7*n+" "+8*n+" "+9*n+" "+10*n);
		n++;
		}
		
	}//main
}//class


