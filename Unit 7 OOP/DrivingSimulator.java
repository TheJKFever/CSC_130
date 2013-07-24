/*Author: Jon Koehmstedt
Date: 12/4/12
This is a simulator for driving a car
*/

public class DrivingSimulator
{

public static void main(String[] args)
	{	System.out.println();
		Car simulator = new Car();
		System.out.println("Great! Now that you are in your car, let's let the fun begin.");
		System.out.println();
		while (simulator.whatToDoNext()!=4);

	}//main
}//DrivingSimulator class