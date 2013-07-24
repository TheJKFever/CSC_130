/*Author: Jon Koehmstedt
11/13/2012
This program counts the ages of three people and then determines who's the oldest*/

import javax.swing.JOptionPane;

public class AgeOf3
{
	public static void main(String[] args)
	{
		int user1, user2, user3;
		
		user1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the age of the first person"));
		user2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the age of the second person"));
		user3 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the age of the third person"));
		
		
		if ( user1 == user2 )
		{	if( user1 == user3 )
			{	JOptionPane.showMessageDialog(null,"Good trick, but I caught it.\nAll three people are the same age!");
			}	
			else if ( user1 > user3)
			{JOptionPane.showMessageDialog(null,"The first and second person are the same age,\nbutolder than the third person!");
			}
			else
			{JOptionPane.showMessageDialog(null,"The third person is the oldest!");
			}
		}
		else if ( user1 > user2 )
		{	if( user1 == user3 )
			{JOptionPane.showMessageDialog(null,"The first and third person are the same age,\nbut older than the second person!");
			}
			else if ( user1 > user3)
			{JOptionPane.showMessageDialog(null,"The first person is the oldest!");
			}
			else
			{JOptionPane.showMessageDialog(null,"The third person is the oldest!");
			}		
		}
		else if (user2 == user3)
		{	JOptionPane.showMessageDialog(null,"The second and third person are the same age,\nbut older than the second person!");
		}
		else if (user2 > user3 )
		{	JOptionPane.showMessageDialog(null,"The second person is the oldest!!");
		}
		else
		{	JOptionPane.showMessageDialog(null,"The third person is the oldest!!");
		}		
		
		System.exit(0);
	
	
	}//main
}//class


