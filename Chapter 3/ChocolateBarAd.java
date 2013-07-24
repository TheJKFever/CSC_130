/*Author: Jon Koehmstedt
11/13/2012
This program is answering question number 10 in the Programming Projects section of Chapter 3 in the book:
10. Repeat the calorie-counting program described in Programming Project 13 from Chapter 2. 
This time ask the user to input the string "M" if the user is a man and "W" if the user is a woman. 
Use only the male formula to calculate calories if "M" is entered and use only the female formula to 
calculate calories if "W" is entered. Output the number of chocolate bars to consume as before.*/

/* Formula for program
basal metabolic rate for woman or bMRWomen == 
655 + (4.3 * weight in pounds) + (4.7 * height in inches) - (4.7 * age in years)
basal metabolic rate for man or bMRMen == 
66 + (6.3 * weight in pounds) + (12.9 * height in inches) - (6.8 * age in years)

A typical chocolate bar contains around 230 calories
*/

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ChocolateBarAd
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int feet, inches, height = 0, age = 0;
		double weight = 0, bMRMen, bMRWomen;
		String gender = "FALSE", weightS, feetS, inchesS, ageS;
		
		JOptionPane.showMessageDialog(null,"You look a little famished, have you checked your BMR lately?\n"
			+ "You know you need to eat a certain amount just to maintain your weight, right?");
		JOptionPane.showMessageDialog(null,"Don't worry, I can tell you exactly how much you need to eat.\n"
			+ "Let me just ask you a few questions first");
		while (!(gender.equals("M"))&&!(gender.equals("W")))
		{	gender = JOptionPane.showInputDialog("First off, I need to know whether you\'re a man or woman?\n"
			+ "Please enter \"M\" or \"W\":");
			if(!(gender.equals("M"))&&!(gender.equals("W")))
				{JOptionPane.showMessageDialog(null,"Hmmm, I'm not sure what kind of gender that it.\nPlease put either \"M\" or \"W\" only.");
				}
		}
		while ((age <= 0)||(age > 120))
		{	ageS = JOptionPane.showInputDialog("Now tell me you\'re age:");
			age = Integer.parseInt(ageS);
			if (age <= 0)
				{JOptionPane.showMessageDialog(null,"It\'s okay to lie about your age by a couple years\n but come on...really?");}
			else if (age > 120)
				{JOptionPane.showMessageDialog(null,"Wow, you're old! Let\'s try again");}
		}
		while ((height <= 0)||(height > 100))
		{	feetS = JOptionPane.showInputDialog("Now tell me you're height \nFirst in feet:");
				feet = Integer.parseInt(feetS);
			inchesS = JOptionPane.showInputDialog("Now in inches:");
				inches = Integer.parseInt(inchesS);
			height = (feet * 12) + inches;
			if (height <= 0)
				{JOptionPane.showMessageDialog(null,"Sorry, you must be 3 dimentional for this program to work");}
			else if (height > 100)
				{JOptionPane.showMessageDialog(null,"You are one tall person!\n My advice, just dont stop eating!");}
		}
		while ((weight <= 0)||(weight > 500))
		{	weightS = JOptionPane.showInputDialog("Now tell me you\'re weight in pounds:");
			weight = Double.parseDouble(weightS);
		}
		//The shape thing is just a joke, but it also serves for a message to let the user know the calculation is done
		String shapeJoke = JOptionPane.showInputDialog("What shape are you?");
		JOptionPane.showMessageDialog(null,"Wow, what interesting dimentions you have...\n"
			+ "I've finished my calculations.\n"
			+ "Click OK to see my analysis.");
	/* Formula for program
	basal metabolic rate for woman or bMRWomen == 
	655 + (4.3 * weight in pounds) + (4.7 * height in inches) - (4.7 * age in years)
	
	basal metabolic rate for man or bMRMen == 
	66 + (6.3 * weight in pounds) + (12.9 * height in inches) - (6.8 * age in years)*/
		
		bMRMen = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
		bMRWomen = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
		int bMRMenInt = (int)(bMRMen * 100.0);
		int bMRWomenInt = (int)(bMRWomen * 100.0);
		double bMRMen2 = (bMRMenInt/100.0);
		double bMRWomen2 = (bMRWomenInt/100.0);
		
		if (gender == "M")
		{	JOptionPane.showMessageDialog(null,"Good News! You're basal metabolic rate is " + bMRMen2
			+ "\nIn other words, you should eat " + ((int)(bMRMen2/230.0)+1) + "bars of chocolate each day to maintain your weight.");
		}
		else
		{	JOptionPane.showMessageDialog(null,"Good News! You're basal metabolic rate is " + bMRWomen2
			+ "\nIn other words, you should eat " + ((int)(bMRWomen2/230)+1) + " bars of chocolate each day to maintain your weight.");
		}
		

		
		System.exit(0);
	
	
	}//main
}//class


