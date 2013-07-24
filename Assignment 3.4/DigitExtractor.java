/*Author: Jon Koehmstedt
Date: 11/6/12
Homework Activity 3.4 - Assignment - Designing Programs
This program turns an integer with 5 or less digits into a string 
of characters and then prints each character seperately*/

import java.util.Scanner;

public class DigitExtractor {

public static void main (String[] args){

int input=100000;
Scanner keyboard = new Scanner(System.in);

while(true) {
System.out.print("Enter a positive integer with 5 or less digits: ");
input = keyboard.nextInt();
if (input < 100000) break; 
System.out.println("Error! Please try again");
 }/*This will continue to ask you for a positive integer until you enter an input less than 100000.
 If you enter an integer greater or equal to 100000, it will print an error*/

char[] output = Integer.toString(input).toCharArray();
//This turns the integer input into a string, then turns that string into an array declared as output
int i=0;
while (i<output.length) {
System.out.println(output[i]);
i++;
}// 

}//main
}//DigitExtractor