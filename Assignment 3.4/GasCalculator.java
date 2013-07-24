/*Author: Jon Koehmstedt
Date: 11/6/12
Homework Activity 3.4 - Assignment - Designing Programs*/

import java.util.Scanner;

public class GasCalculator {

public static void main (String[] args){

double gallons, fuelEff, gasPrice, cost100, distance; 

Scanner keyboard = new Scanner(System.in);
System.out.print("Enter the amount of gas in gallons: ");
gallons = keyboard.nextDouble();
System.out.print("Enter the fuel effeciency of the vehicle in miles per gallon: ");
fuelEff = keyboard.nextDouble();
System.out.print("Enter the price of gas per gallon: ");
gasPrice = keyboard.nextDouble();

cost100 = (gasPrice/fuelEff)*100;
System.out.println("The cost of gas per 100 miles driven is $" + cost100 + ",");
distance = gallons*fuelEff;
System.out.println("and with " + gallons + " gallons of gas, this vehicle will go " + distance + " miles.");


}//main
}//GasCalculator