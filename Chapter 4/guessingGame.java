// Chapter 4 Problem 2
// Michael Petersen
// 11/20/12

import java.util.Scanner;

class guessingGame {
public static void main(String args[]){
Scanner keyboard = new Scanner(System.in);
double amount, interest = 0, total = 100, interestTotal = 0;
int count = 12, trans;

while (count > 0){
System.out.println("Starting Balance: $" + total + ". This program is for withdrawels(1) or desposits(2):");
trans = keyboard.nextInt();
if(trans == 1){
System.out.println("Enter the amount: ");
amount = keyboard.nextDouble();
total = total - amount;
}
if(trans == 2){
System.out.println("Enter the amount: ");
amount = keyboard.nextDouble();
total = total + amount;
}

if(total > 0.0){
interest = (total * .02) / 12;
total = total + interest;
}
else {
System.out.println("Your balance is below $0, no interest this month.");

}
System.out.println("Current Balance: " + total);
interestTotal = interestTotal + interest;
count--;
}
System.out.println("Balance after 12 months: " + total);
System.out.println("You earned " + interestTotal + " in interest this year.");


}


}