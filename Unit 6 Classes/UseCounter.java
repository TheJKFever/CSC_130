import java.util.Scanner;


public class UseCounter
{

	public static void main (String[] args)
	{
	Counter cars = new Counter();
	cars.setZero();
	cars.writeInput();
	cars.addOne();
	cars.addOne();
	cars.addOne();	
	cars.writeInput();
	cars.minusOne();
	cars.minusOne();
	cars.minusOne();
	cars.minusOne();	
	cars.writeInput();
	
	}//main

}//UseCounter