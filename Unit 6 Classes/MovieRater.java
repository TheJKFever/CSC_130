/*Jon Koehmstedt
Unit 6 - Problem 3 
11/27/12
This file Rates movies 
*/
import java.util.Scanner;

public class MovieRater
{
	public static void main (String[] args)
	{
	System.out.println("Let's rate some movies!");
	MovieRatings FirstMovie = new MovieRatings();
	FirstMovie.readInput();
	FirstMovie.addRating();
	FirstMovie.writeOutput();
	System.out.println();
	System.out.println("Let's rate another movie!");
	MovieRatings NewMovie = new MovieRatings();
	NewMovie.readInput();
	NewMovie.addRating();
	NewMovie.writeOutput();
	
	System.out.println();
	System.out.println("You're Awesome!");	
	
	}//main
}//class