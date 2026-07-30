/*Question 71: Create abstract class Courier.
Asked In Practice Question
Abstract method deliver().
Subclasses:

SpeedPost

NormalPost

Input
Type: SpeedPost
Output
Delivered via Speed Post*/

import java.util.*;
abstract class Courier
{
	String type;
	Courier(String type)
	{
		this.type = type;
	}
	abstract void deliver();
}
class SpeedPost extends Courier
{
	SpeedPost(String type)
	{
		super(type);
	}
	void deliver()
	{
		System.out.println("Delivered via Speed Post");
	}
}
class NormalPost extends Courier
{
	NormalPost(String type)
	{
		super(type);
	}
	void deliver()
	{
		System.out.println("Delivered via Normal Post");
	}
}
class Q71Courier
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Type");
		String type = xyz.next();
		
		Courier c;
		
		if(type.equalsIgnoreCase("SpeedPost"))
		{
			c = new SpeedPost(type);
			c.deliver();
		}
		else
		{
			c = new NormalPost(type);
			c.deliver();
		}
	}
}