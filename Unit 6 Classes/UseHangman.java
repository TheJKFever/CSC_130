import java.util.Scanner;


public class UseHangman
{

	public static void main (String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	HangMan play = new HangMan();
	
	System.out.println("Let's play hangman!");
	System.out.println("This is the disguised word");
	System.out.println(play.getDisguisedWord());
	while ((play.getGuessCount()<10)&&(play.isFound()==false))
	{System.out.println("Guess a letter that you think is in this word?");
	String c = keyboard.next();
		while (c.length()>1)
			{System.out.println("Please input only a single letter");
			c = keyboard.next();}
	char guessLetter = c.charAt(0);
	play.MakeGuess(guessLetter);	
	System.out.println("You've guessed " + play.getGuessCount() + " times");
	play.getWrongCount();
	System.out.println("You've guessed wrong " + play.getWrongCount() + " times");
	System.out.println("You have " + (10-play.getWrongCount()) + " errors left");	
	System.out.println("The disguised word is " + play.getDisguisedWord());
	}
	if(play.isFound()==true)
	System.out.println("CONRATULATIONS!");
	else
	System.out.println("Sorry, better luck next time.");
	
	}//main

}//UseCounter