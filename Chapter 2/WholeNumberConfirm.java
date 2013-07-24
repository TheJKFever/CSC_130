/*Jon Koehmstedt
11-12-12
this is a simple program that show's the user what whole number he input using JOptionPane*/

import javax.swing.JOptionPane;

public class WholeNumberConfirm
{
	public static void main(String[] args)
	{
		String wholeNum = JOptionPane.showInputDialog("Enter a whole number");
		int wholeNumInt = Integer.parseInt(wholeNum);
		
		JOptionPane.showMessageDialog(null,"The number you entered is " + wholeNumInt);
		
		System.exit(0);
	
	}//static void

}//class WholeNumberConfirm