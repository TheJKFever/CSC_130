/*Author: Jon Koehmstedt
Date: 11/12/12
This program tests why x=10 doesn't work for the third test*/

public class XEquals10 {

public static void main (String[] args){

int x=10;

System.out.println("Test 1" + x * 3 * 2.0);
System.out.println("Test 2" + x * 3 + 2.0);
System.out.println("Test 3" + (x * 3 - 2.0));



}//main
}//XEquals10