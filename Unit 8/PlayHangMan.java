import java.util.Scanner;

public class PlayHangMan
{

public static void main (String[] args)
{
	Scanner keyboard = new Scanner(System.in);
	String tempAnswer;
	HangManArray game = new HangManArray();
	do {game.+;
		while ((game.Solved()==false)&&(game.getWrongCount()<10))
		{	game.MakeGuess();
			if ((game.getWrongCount()<10)&&(game.Solved()==false))
			game.printScore();	
		}
		System.out.println("Would you like to play again?");
		tempAnswer = keyboard.next();
		while (!tempAnswer.equalsIgnoreCase("yes")&&!tempAnswer.equalsIgnoreCase("no"))
		{	System.out.println("Please only enter yes or no");
			tempAnswer = keyboard.next();}
	} while (tempAnswer.equalsIgnoreCase("yes"));

}//main

}//class PlayHangMan