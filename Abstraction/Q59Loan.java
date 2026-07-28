/*Question 59: Create abstract class Loan.
Asked In Practice Question
Abstract method calculateInterest().
Subclasses:

HomeLoan

CarLoan

Input
Amount: 100000
Rate: 8%
Output
Interest: 8000*/

import java.util.*;
abstract class Loan
{
	int amount;
	int rate;
	Loan(int amount,int rate)
	{
		this.amount = amount;
		this.rate = rate;
	}
	abstract void calculateInterest();
}
class HomeLoan extends Loan
{
	HomeLoan(int amount,int rate)
	{
		super(amount,rate);
	}
	void calculateInterest()
	{
		System.out.println("Interest: "+(amount*rate)/100);
	}
}
class CarLoan extends Loan
{
	CarLoan(int amount,int rate)
	{
		super(amount,rate);
	}
	void calculateInterest()
	{
		System.out.println("Interest: "+(amount*rate)/100);
	}
}
class Q59Loan
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.HomeLoan");
		System.out.println("2.CarLoan");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Loan l;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter amount");
				int amount = xyz.nextInt();
				System.out.println("Enter rate");
				int rate = xyz.nextInt();
				
				l = new HomeLoan(amount,rate);
				l.calculateInterest();
				break;
				
			case 2:
				System.out.println("Enter amount");
				int amount1 = xyz.nextInt();
				System.out.println("Enter rate");
				int rate1 = xyz.nextInt();
				
				l = new HomeLoan(amount1,rate1);
				l.calculateInterest();
				break;
				
			default:
				System.out.println("Wrong choice");
		}
	}
}
