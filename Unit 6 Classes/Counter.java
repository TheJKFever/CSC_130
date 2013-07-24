import java.util.Scanner;
/**
Class for HangMan
*/

public class HangMan
{
	Scanner keyboard = new Scanner(System.in);
	
	private String secretWord;
	private int numGuess=0, numWrong=0;
	private String secretWord = "swiftly";
	private disguisedWord = "???????";
	
	/*MakeGuess(c) guesses that character c is in the word*/
	public void MakeGuess(c)
	{	if (secretWord.indexOf(c)=-1)
		{	System.out.println("Sorry, that letter is not in the secret word. Guess again!");
			numGuess+=1;
			numWrong+=1;}
		else ()
		{
			System.out.println("Good Guess");
			changeWord();
			numGuess+=1;
		}
	}
	
	/*getDisguisedWord returns a string containing correctly 
	guessed letters in their correct positions and unknown 
	letters replaced with ?*/
	public void getDisguisedWord()
	
	/*getSecretWord returns the secret word*/
	private void getSecretWord()
	{
	return secretWord()
	}
	
	/*getGuessCount returns the number of guesses made*/
	public void getGuessCount()
	
	/*isFound returns true if the hidden word has been discovered.*/
	public boolean isFound()
	
	
}//class Count