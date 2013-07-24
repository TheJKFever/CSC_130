import java.util.Scanner;

public class TestParse
{

public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
String testNum="1";

char a = '?';

while (!testNum.equals("0"))
{ 	testNum = keyboard.next();
	System.out.println(Integer.parseInt(testNum));
}

}//main
}//class