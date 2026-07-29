/*Question 61: Create abstract class Delivery.
Asked In Practice Question
Abstract method calculateCharges().
Subclasses:

LocalDelivery

InternationalDelivery

Input
Weight: 2kg
Rate: 50
Output
Charges: 100*/

import java.util.*;
abstract class Delivery
{
	int weight;
	int rate;
	Delivery(int weight,int rate)
	{
		this.weight = weight;
		this.rate = rate;
	}
	abstract void calculateCharges();
}
class LocalDelivery extends Delivery
{
	LocalDelivery(int weight,int rate)
	{
		super(weight,rate);
	}
	void calculateCharges()
	{
		System.out.println("Charges: "+(weight*rate));
	}
}
class InternationalDelivery extends Delivery
{
	InternationalDelivery(int weight,int rate)
	{
		super(weight,rate);
	}
	void calculateCharges()
	{
		System.out.println("Charges: "+(weight*rate));
	}
}
class Q61Delivery
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.LocalDelivery");
		System.out.println("2.InternationalDelivery");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Delivery d ;
		
		switch(choice)
		{
			case 1: 
				System.out.println("Enter Weight");
				int weight = xyz.nextInt();
				System.out.println("Enter rate");
				int rate = xyz.nextInt();
				d = new LocalDelivery(weight,rate);
				d.calculateCharges();
				break;
				
			case 2:
				System.out.println("Enter weight");
				int weight1 = xyz.nextInt();
				System.out.println("Enter rate");
				int rate1 = xyz.nextInt();
				d = new InternationalDelivery(weight1,rate1);
				d.calculateCharges();
				break;
				
			default:
				System.out.println("Wrong Choice");
		}
	}
}