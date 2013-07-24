/*Author: Jon Koehmstedt
11/13/2012
This program calculates income tax based on 1913 tax brackets*/

import javax.swing.JOptionPane;

public class IncomeTax
{
	public static void main(String[] args)
	{
		
		String american = "Dan the man";
		double income, tax, taxPercent;
		
		income = Integer.parseInt(JOptionPane.showInputDialog("Hey " + employee + "!\nHope you some money this year,"
			+ "\nbecause the government's coming to collect their share."
			+ "\nLet me help you figure out how much you owe"
			+ "\n\nHow much money did you make this year?"));
		
		if ( income <= 0 )
		JOptionPane.showMessageDialog(null,"Well the good news is that you don't owe the Government anything."
		+ "\nThe bad news is, you didn't make any money!"
		+ "\n\nWhat were you doing all year!?"
		else if ( income <= 50000)
		{	taxPercent = 0.01;}
		else if ( income <= 75000)
		{	taxPercent = 0.02;}
		else if ( income <= 100000)
		{	taxPercent = 0.03;}
		else if ( income <= 250000)
		{	taxPercent = 0.04;}
		else if ( income <= 500000)
		{	taxPercent = 0.05;}
		else
		{	taxPercent = 0.06;}
		
		tax = taxPercent * income;
		
		JOptionPane.showMessageDialog(null,"Alright" + american + 
		"\nYou made: $" + income + " this year"
		"\nSo, the governments going to come after you for: $" + tax);
		
		System.exit(0);
	
	
	}//main
}//class


