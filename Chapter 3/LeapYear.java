/*Author: Jon Koehmstedt
11/13/2012
This program determines if a given year is a leap year*/

import javax.swing.JOptionPane;

public class LeapYear
{
	public static void main(String[] args)
	{
		int year=2005;
		while (((year%400!=0)&&(year%100==0))||(year%4!=0))
		{year = Integer.parseInt(JOptionPane.showInputDialog("Please enter a year that you think is a Leap Year (####): "));		
			if (((year%400!=0)&&(year%100==0))||(year%4!=0))
				JOptionPane.showMessageDialog(null,"Good guess! Try again.");
		}		
		JOptionPane.showMessageDialog(null,"Good job!\nYou've identified a leap year");			
		
		System.exit(0);
	
	
	}//main
}//class


