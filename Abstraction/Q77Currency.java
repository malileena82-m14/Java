/*Question 77: Create abstract class Currency.
Asked In Practice Question
Abstract method convert().
Subclasses:

INRtoUSD

INRtoEUR

Input
Amount: 1000
Output
Converted Amount: 12 USD*/

import java.util.*;
abstract class Currency
{
	int amount;
	Currency(int amount)
	{
		this.amount = amount;
	}
	abstract void convert();
}
class INRtoUSD extends Currency
{
	INRtoUSD(int amount)
	{
		super(amount);
	}
	void convert()
	{
		double usd = amount/83.0;
		System.out.println("Converted Amount: "+usd);
	}
}
class INRtoEUR extends Currency
{
	INRtoEUR(int amount)
	{
		super(amount);
	}
	void convert()
	{
		double eur = amount/90.0;
		System.out.println("Converted Amount: "+eur);
	}
}
class Q77Currency
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("Enter choice");
		int choice = xyz.nextInt();
		
		Currency c;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Amount");
				int amount = xyz.nextInt();
				c = new INRtoUSD(amount);
				c.convert();
				break;
				
			case 2:
				System.out.println("Enter Amount");
				int amount1 = xyz.nextInt();
				c = new INRtoEUR(amount1);
				c.convert();
				break;
				
			default:
				System.out.println("Wrong choice");
		}
	}
}
