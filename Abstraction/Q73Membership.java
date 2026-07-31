/*Question 73: Create abstract class Membership.
Asked In Practice Question
Abstract method getDetails().
Subclasses:

Monthly

Yearly

Input
Type: Monthly
Output
Monthly Membership Active*/

import java.util.*;
abstract class Membership
{
	String type;
	Membership(String type)
	{
		this.type = type; 
	}
	abstract void getDetails();
}
class Monthly extends Membership
{
	Monthly(String type)
	{
		super(type);
	}
	void getDetails()
	{
		System.out.println("Monthly Membership Active");
	}
}
class Yearly extends Membership
{
	Yearly(String type)
	{
		super(type);
	}
	void getDetails()
	{
		System.out.println("Yearly Membership Active");
	}
}
class Q73Membership
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Type");
		String type = xyz.next();
		
		Membership m;
		
		if(type.equalsIgnoreCase("Monthly"))
		{
			m = new Monthly(type);
			m.getDetails();
		}
		else
		{
			m = new Yearly(type);
			m.getDetails();
		}
	}
}