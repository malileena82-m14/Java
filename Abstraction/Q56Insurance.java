/*Question 56: Create abstract class Insurance.
Asked In Practice Question
Abstract method calculatePremium().
Subclasses:

LifeInsurance

VehicleInsurance

Input
Type: Life
Amount: 100000
Rate: 5%
Output
Premium: 5000*/

import java.util.*;
abstract class Insurance
{
	int amount;
	int rate;
	Insurance(int amount,int rate)
	{
		this.amount = amount;
		this.rate = rate;
	}
	abstract void calculatePremium();
}
class LifeInsurance extends Insurance
{
	LifeInsurance(int amount,int rate)
	{
		super(amount,rate);
	}
	void calculatePremium()
	{
		System.out.println("Premium: "+(amount*rate)/100);
	}
}
class VehicleInsurance extends Insurance
{
	VehicleInsurance(int amount,int rate)
	{
		super(amount,rate);
	}
	void calculatePremium()
	{
		System.out.println("Premium: "+(amount*rate)/100);
	}
}
class Q56Insurance
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.LifeInsurance");
		System.out.println("2.VehicleInsurance");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Insurance i;
		
		switch(choice)
		{
			case 1: 
				System.out.println("Enter Amount");
				int amount = xyz.nextInt();
				System.out.println("Enter Rate");
				int rate = xyz.nextInt();
				
				i = new LifeInsurance(amount,rate);
				i.calculatePremium();
				break;
				
			case 2:
				System.out.println("Enter Amount");
				int amount1 = xyz.nextInt();
				System.out.println("Enter rate");
				int rate1 = xyz.nextInt();
				
				i = new VehicleInsurance(amount1,rate1);
				i.calculatePremium();
				break;
				
			default:
				System.out.println("Wrong Choice");
		}
	}
}