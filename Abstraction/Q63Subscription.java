/*Question 63: Create abstract class Subscription.
Asked In Practice Question
Abstract method getPlan().
Subclasses:

Basic

Premium

Input
Type: Premium
Output
Premium Plan Activated*/

import java.util.*;
abstract class Subscription
{
	String type;
	Subscription(String type)
	{
		this.type = type;
	}
	abstract void getPlan();
}
class Basic extends Subscription
{
	Basic(String type)
	{
		super(type);
	}
	void getPlan()
	{
		System.out.println("Basic Plan Activated");
	}
}
class Premium extends Subscription
{
	Premium(String type)
	{
		super(type);
	}
	void getPlan()
	{
		System.out.println("Premium Plan Activated");
	}
}
class Q63Subscription
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter choice");
		int choice = xyz.nextInt();
		
		Subscription s;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Type");
				String type = xyz.next();
				s = new Basic(type);
				s.getPlan();
				break;
				
			case 2:
				System.out.println("Enter Type");
				String type1 = xyz.next();
				s = new Premium(type1);
				s.getPlan();
				break;
				
			default:
				System.out.println("Wrong choice");
		}
		
	}
}