/*Author: Jon Koehmstedt
11/13/2012
This program calculates days in any particular month*/

import javax.swing.JOptionPane;

public class DaysOfMonth
{
	public static void main(String[] args)
	{
		int month = 13;
		String daysInMonth, d28 = "28 or 29", d30 = "30", d31 = "31";
		
		while ((month<=0)||(month>12))
			month = Integer.parseInt(JOptionPane.showInputDialog("Please enter a month in the format (1-12):"));		
			if( month == 2)
				daysInMonth = d28;
			else if ((month == 4)||(month == 6)||(month == 9)||(month == 11))
				daysInMonth = d30;
			else
				daysInMonth = d31;		
		
		JOptionPane.showMessageDialog(null,"That's easy!\nThe number of days in that month is: \n"
			+ daysInMonth);
		
		System.exit(0);
	
	
	}//main
}//class


