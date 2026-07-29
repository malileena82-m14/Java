/*Question 62: Create abstract class Tax.
Asked In Practice Question
Abstract method calculateTax().
Subclasses:

IncomeTax

GST

Input
Amount: 50000
Tax Rate: 10%
Output
Tax: 5000*/

import java.util.*;
abstract class Tax
{
	int amount;
	int rate;
	Tax(int amount,int rate)
	{
		this.amount = amount;
		this.rate = rate;
	}
	abstract void calculateTax();
}
class IncomeTax extends Tax
{
	IncomeTax(int amount,int rate)
	{
		super(amount,rate);
	}
	void calculateTax()
	{
		System.out.println("Tax: "+(amount*rate)/100);
	}
}
class GST extends Tax
{
	GST(int amount,int rate)
	{
		super(amount,rate);
	}
	void calculateTax()
	{
		System.out.println("Tax: "+(amount*rate)/100);
	}
}
class Q62Tax
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.IncomeTax");
		System.out.println("2.GST");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Tax t;
		switch(choice)
		{
			case 1: 
				System.out.println("Enter Amount");
				int amount = xyz.nextInt();
				System.out.println("Enter Tax Rate");
				int rate = xyz.nextInt();
				t = new IncomeTax(amount,rate);
				t.calculateTax();
				break;
				
			case 2:
				System.out.println("Enter Amount");
				int amount1 = xyz.nextInt();
				System.out.println("Enter Tax Rate");
				int rate1 = xyz.nextInt();
				t = new GST(amount1,rate1);
				t.calculateTax();
				break;
				
			default:
				System.out.println("Wrong Choice");
		}
	}
}