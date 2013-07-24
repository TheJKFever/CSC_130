public class ArrayPrint
{

public static void main (String[] args)
{
int i;

int[] randomArray = new int[10];
for (i=0;i<randomArray.length;i++)
{randomArray[i] = (int)(Math.random()*100);
}

//print array
System.out.println();
System.out.println("THE RANDOM ARRAY IS:");
System.out.print("[");
for (i=0;i<randomArray.length;i++)
{System.out.print(randomArray[i]);
if (i<(randomArray.length-1))
System.out.print(", ");}
System.out.print("]");
System.out.println();
System.out.println();

//print even indexes
System.out.println("THE EVEN INDEXES ARE:");
for (i=0;i<(randomArray.length/2);i++)
{System.out.println("Index "+i*2+" = "+randomArray[i*2]);}
System.out.println();

//print even elements
System.out.println("THE EVEN ELEMENTS ARE:");
for (i=0;i<randomArray.length;i++)
{if(randomArray[i]%2==0)
	System.out.println("Index " +i+" = "+randomArray[i]);}
System.out.println();

//print elements in reverse order
System.out.println("THE REVERSE ORDER OF ELEMENTS IS");
for (i=9;i>=0;i--)
{System.out.println("Index "+i+" = "+randomArray[i]);}
System.out.println();

//print only the first and last elements
System.out.println("PRINT FIRST AND LAST ELEMENTS");
System.out.println("Index 0 = "+randomArray[0]);
System.out.println("Index "+(randomArray.length-1)+" = "+randomArray[(randomArray.length-1)]);
System.out.println();

//The minimum and maximum element
System.out.println("PRINT THE MIN AND MAX");
double max=0, min=0;
int maxIndex=0, minIndex=0;
for (i=0;i<randomArray.length;i++)
{if (randomArray[i]>max)
{max=randomArray[i];
maxIndex=i;}
if (randomArray[i]<min)
{min=randomArray[i];
minIndex=i;}
}
System.out.println("The maximum element is "+max+" at index: "+maxIndex);
System.out.println("The minimum element is "+max+" at index: "+minIndex);
System.out.println();

//sum all the indexes
System.out.println("PRINT THE SUM OF ALL THE INDEXES");
double sum=0;
for (i=0;i<randomArray.length;i++)
{sum=sum+randomArray[i];}
System.out.println("The sum of all the indexes is: "+sum);
System.out.println();

//alternating sum, even positive, odd negative
System.out.println("PRINT THE ALTERNATING SUM");
double altSum=0;
for (i=0;i<randomArray.length;i++)
{	if (i%2==0)
		altSum=altSum+randomArray[i];
	else
		altSum=altSum-randomArray[i];
}
System.out.println("The alternating sum is: "+altSum);


}//main
}//class ArrayPrint