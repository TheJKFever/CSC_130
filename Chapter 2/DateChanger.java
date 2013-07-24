/*Author: Jon Koehmstedt
Date: 11/12/12
This program turns an American date into a European date*/

import javax.swing.JOptionPane;

public class DateChanger
{
	public static void main(String[] args)
	{
		String americanDate = JOptionPane.showInputDialog("Enter a date in this format MM/DD/YY");
		
		String month, day, year;
		month = americanDate.substring(0,2);
		day = americanDate.substring(3,5);
		year = americanDate.substring(6,8);
		String europeanDate = (day + "." + month + "." + year);
		
		JOptionPane.showMessageDialog(null,europeanDate);
		
		System.exit(0);		
	
	}//main
}//DateChanger
