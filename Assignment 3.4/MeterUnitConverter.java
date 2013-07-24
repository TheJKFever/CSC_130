/*Author: Jon Koehmstedt
Date: 11/6/12
Homework Activity 3.4 - Assignment - Designing Programs*/

import java.util.Scanner;

public class MeterUnitConverter {

public static void main (String[] args){

double meters, miles, feet, inches;

Scanner keyboard = new Scanner(System.in);
System.out.print("Enter a measurement in meters: ");
meters = keyboard.nextDouble();
miles = meters * 1609.34;
feet = meters * 0.3048;
inches = meters * 0.0254;
System.out.println(meters + " meters equals " + miles + " in miles.");
System.out.println(meters + " meters equals " + feet + " in feet.");
System.out.println(meters + " meters equals " + inches + " in inches.");


}//main
}//MeterUnitConverter