/*
what would you like to compare (type in a category of items choose a category)
how many of these items would you like to compare
please enter the first item, sencond, third ...
How many of item one is there, item 2, 3, 4...
print graph
*/

import java.util.Scanner;

public class Graph
{

public static void main (String[] args)
{

Scanner keyboard = new Scanner(System.in);


String tempAnswer;
String category;
int arrayLength=0, i=0, amountPerAst=0;
double max = 0;
String[] categoryArray;
double[] categoryAmount;

do {
System.out.println();
System.out.println("LET'S MAKE A GRAPH!");
System.out.println();
System.out.println("What would you like to compare");
System.out.println("Type in a category of items that you'd like to compare on a graph");
category = keyboard.next();
System.out.println();
System.out.println("How many "+category+" are we going to compare");
arrayLength = keyboard.nextInt();
System.out.println();
categoryArray = new String[arrayLength];

//input category list
for(i=0;i<arrayLength;i++)
	{	if (i==0)
			System.out.println("Please enter the first "+category);
		else
			System.out.println("Please enter the next "+category);
	categoryArray[i] = keyboard.next();
	}
System.out.println();

//input key
System.out.println("What will be compared?");
System.out.println("(what do the forthcoming numbers represent?)");
keyboard.nextLine();
String key = keyboard.nextLine();
System.out.println();

//input category amounts
categoryAmount = new double[arrayLength];
for(i=0;i<arrayLength;i++)
	{System.out.println("Please enter the corresponding number for "+categoryArray[i]);
	categoryAmount[i] = keyboard.nextDouble();
	}

//set max
max=0
for(i=0;i<arrayLength;i++)
	{if (max<categoryAmount[i])
	max = categoryAmount[i];
	}
amountPerAst = (int)(max/40);
	
//set asterict length
for(i=0;i<arrayLength;i++)
	{categoryAmount[i] = (int)((categoryAmount[i]/max)*40);
	}	
	
//Print Graph
System.out.println();
System.out.println("GRAPH OF "+category.toUpperCase());
System.out.println();
for(i=0;i<(arrayLength);i++)
{	System.out.print(categoryArray[i]+"\t\t");
	for (int b=0;b<categoryAmount[i];b++)
	{	System.out.print("*");}
		System.out.println();
}
System.out.println("Key: * = "+key);
System.out.println();

//graph again?
System.out.println("Would you like make another graph?");
tempAnswer = keyboard.next();
while (!tempAnswer.equalsIgnoreCase("yes")&&!tempAnswer.equalsIgnoreCase("no"))
		{	System.out.println("Please only enter yes or no");
			tempAnswer = keyboard.next();}
} while (tempAnswer.equalsIgnoreCase("yes"));

}//main
}//class Graph