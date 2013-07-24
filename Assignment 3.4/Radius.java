/*Author: Jon Koehmstedt
Date: 11/6/12
Homework Activity 3.4 - Assignment - Designing Programs*/

import java.util.Scanner;

public class Radius {

public static void main (String[] args){

double radius, circleArea, circleCircumference, sphereVol, sphereSurfaceArea; 

Scanner keyboard = new Scanner(System.in);
System.out.print("Enter a radius: ");
radius = keyboard.nextDouble();
circleArea = radius*radius*Math.PI; 
circleCircumference = radius*2*Math.PI;
sphereVol = (4/3)*Math.PI*Math.pow(radius,3);
sphereSurfaceArea = 4*Math.PI*radius*radius;

System.out.println("The area of a circle with a radius of " + radius + " is " + circleArea);
System.out.println("The circumference of a circle with a radius of " + radius + " is " + circleCircumference);
System.out.println("The volume of a sphere with a radius of " + radius + " is " + sphereVol);
System.out.println("The surface area of a sphere with a radius of " + radius + " is " + sphereSurfaceArea);


}//main
}//Radius