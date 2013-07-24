import java.util.Scanner;
/**
Class for HangMan
*/

public class HangMan
{
	Scanner keyboard = new Scanner(System.in);
	
	private int numGuess=0, numWrong=0;
	private String secretWord = "swiftly";
	private String disguisedWord = "???????";
	private boolean isFound;
	
	/*MakeGuess(c) guesses that character c is in the word*/
	public void MakeGuess(char guessLetter)
	{	if (secretWord.contains(Character.toString(guessLetter)))
		{	System.out.println("Good guess!");
			char[] charDisguisedWord = disguisedWord.toCharArray();
			int arrayLocation=(secretWord.indexOf(guessLetter)); 
			charDisguisedWord[(arrayLocation)] = guessLetter;
			disguisedWord = String.valueOf(charDisguisedWord);
			numGuess+=1;
		}
		else
		{	System.out.println("Sorry, that letter is not in the secret word. Guess again!");
			numGuess+=1;
			numWrong+=1;
		}
	}
	
	/*getDisguisedWord returns a string containing correctly 
	guessed letters in their correct positions and unknown 
	letters replaced with ?*/
	public String getDisguisedWord()
	{
	return disguisedWord;
	}
	
	/*getSecretWord returns the secret word*/
	private void getSecretWord()
	{
	System.out.println(secretWord);
	}
	
	/*getGuessCount returns the number of guesses made*/
	public int getGuessCount()
	{
	return numGuess;
	}
	
	/*getGuessCount returns the number of guesses made*/
	public int getWrongCount()
	{
	return numWrong;
	}
	
	/*isFound returns true if the hidden word has been discovered.*/
	public boolean isFound()
	{	if(disguisedWord.contains(Character.toString('?')))
		{isFound=false;}
		else
		{isFound=true;}
		return isFound;
		
	}
	
	
}//class Count