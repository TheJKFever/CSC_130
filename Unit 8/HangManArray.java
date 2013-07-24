import java.util.Scanner;
/**
Class for HangMan using an Array
*/

public class HangManArray
{
	Scanner keyboard = new Scanner(System.in);
	
	private int numGuess=0, numWrong=0;
	private String[] secretWord = {"abbey", "abruptly", "affix", "askew", "axiom", "azure", "bagpipes", "bandwagon", "banjo", "bayou", "bikini", "blitz", "bookworm", "boxcar", "boxful", "buckaroo", "buffalo", "buffoon", "cobweb", "croquet", "daiquiri", "disavow", "duplex", "dwarves", "equip", "exodus", "fishhook", "fixable", "foxglove", "galaxy", "galvanize", "gazebo", "gizmo", "glowworm", "guffaw", "haiku", "haphazard", "hyphen", "icebox", "injury", "ivory", "ivy", "jaundice", "jawbreaker", "jaywalk", "jazzy", "jigsaw", "jiujitsu", "jockey", "jovial", "joyful", "juicy", "jumbo", "kazoo", "keyhole", "khaki", "kilobyte", "kiosk", "kiwifruit", "knapsack", "larynx", "luxury", "marquis", "megahertz", "microwave", "mystify", "nightclub", "nowadays", "numbskull", "ovary", "oxidize", "oxygen", "pajama", "peekaboo", "pixel", "pizazz", "pneumonia", "polka", "quartz", "quiz", "quorum", "razzmatazz", "rhubarb", "rickshaw", "schizophrenia", "sphinx", "spritz", "squawk", "subway", "swivel", "topaz", "unknown", "unworthy", "unzip", "uptown", "vaporize", "vixen", "vodka", "vortex", "walkway", "waltz", "wavy", "waxy", "wheezy", "whiskey", "whomever", "wimpy", "wizard", "woozy", "xylophone", "yachtsman", "yippee", "youthful", "zephyr", "zigzag", "zilch", "zodiac", "zombie"};
	private char[] secretWordChar;
	private char[] disguisedWord;
	private char[] guessedArray;
	private boolean solved=false;

	//Find a new secret word, and create the neccesary Char arrays
	public void SetNewGame()
	{ 	System.out.println("Let's Play Hangman!");  
		secretWordChar = (secretWord[((int)(Math.random()*secretWord.length))].toCharArray());
		disguisedWord = new char[secretWordChar.length];
		guessedArray = new char[25];
		int i = 0;
		for (i=0; i<disguisedWord.length; i++)
			disguisedWord[i] = '_';
		solved=false;
		numGuess=0;
		numWrong=0;
		getDisguisedWord();
	}
	
	/*MakeGuess(c) guesses that character c is in the word*/
	public void MakeGuess()
	{	boolean foundGuess=false;
		boolean alreadyGuessed;
		char guessLetter;
		int i;
		System.out.println();
		do {
		alreadyGuessed=false;
		System.out.println("Please guess a letter");
		String guess = keyboard.next();
		char[] guessChar = guess.toCharArray();
		guessLetter = guessChar[0];
		System.out.println();
		i=0;
		while ((alreadyGuessed==false)&&(i<guessedArray.length))
			{if((Character.toUpperCase(guessLetter))==(Character.toUpperCase(guessedArray[i])))
				{alreadyGuessed=true;
				System.out.println("You've already guessed that letter");
				}
				i++;}
		} while (alreadyGuessed==true);
		i=0;
		while (i<secretWordChar.length)
			{if(Character.toUpperCase(guessLetter)== Character.toUpperCase(secretWordChar[i]))
				{foundGuess = true;
				disguisedWord[i] = Character.toUpperCase(guessLetter);}
				i++;
			}
		if(foundGuess==false)
		{	if(numWrong<9)
			System.out.println("Sorry, that letter is not in the secret word, guess again!");
			guessedArray[numGuess] = Character.toUpperCase(guessLetter);
			numGuess+=1;
			numWrong+=1;
			if (numWrong==10)
			{	System.out.println("Sorry you've made too many incorrect guesses, You lose");
				System.out.print("The secret word was: ");
				for(i = 0; i<secretWordChar.length;i++)
				{System.out.print(secretWordChar[i]);}
				System.out.println();
			}
		}
		else 
		{
		if (Solved())
		{	System.out.println("Congratulations! You Win");
			System.out.print("The secret word was: ");
			for(i = 0; i<secretWordChar.length;i++)
			{System.out.print(secretWordChar[i]);}
			System.out.println();
		}
		else
			{System.out.println("Good guess!");
			guessedArray[numGuess] = Character.toUpperCase(guessLetter);
			numGuess+=1;		
			}
		}
	}
	
	/*getDisguisedWord returns a char array containing correctly 
	guessed letters in their correct positions and unknown 
	letters replaced with ?*/
	public void getDisguisedWord()
	{
		System.out.println();
		System.out.print("The Hangman word is: ");
		int i=0; 
		for(i = 0; i<disguisedWord.length;i++)
		{System.out.print(disguisedWord[i]);
		System.out.print(" ");}
		System.out.println();
	}
	
	public void printScore()
	{
	getDisguisedWord();
	System.out.println();
	System.out.print("So far you've guessed: ");
	for(int i = 0; i<guessedArray.length;i++)
		{System.out.print(guessedArray[i]);}
	System.out.println();
	System.out.println("Guess count = "+numGuess);
	System.out.println("Incorrect Guesses = "+ numWrong);
	System.out.println("you have "+ (10-numWrong) +" incorrect guesses left");
	}
	
	/*getGuessCount returns the number of guesses made*/
	public int getGuessCount()
	{
	return numGuess;
	}
	
	/*getWrongCount returns the number of guesses made*/
	public int getWrongCount()
	{
	return numWrong;
	}
	
	/*Solved returns true if the hidden word has been discovered.*/
	public boolean Solved()
	{	boolean equals = true;
		int i=0;
		while (equals && (i<disguisedWord.length))
		{if (Character.toUpperCase(secretWordChar[i])!=disguisedWord[i])
			equals = false;
		i++;}
		solved = equals;
		return solved;
		
	}
	
}//class HangManArray