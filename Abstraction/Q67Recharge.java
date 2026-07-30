/*Question 67: Create abstract class Recharge.
Asked In Practice Question
Abstract method processRecharge().
Subclasses:

Prepaid

Postpaid

Input
Amount: 299
Output
Recharge Successful: 299*/

import java.util.*;
abstract class Recharge
{
	int amount;
	Recharge(int amount)
	{
		this.amount = amount;
	}
	abstract void processRecharge();
}
class Prepaid extends Recharge
{
	Prepaid(int amount)
	{
		super(amount);
	}
	void processRecharge()
	{
		System.out.println("Recharge Successful: "+amount);
	}
}
class Postpaid extends Recharge
{
	
	Postpaid(int amount)
	{
		super(amount);
	}
	void processRecharge()
	{
		System.out.println("Recharge Successful: "+amount);
	}
}
class Q67Recharge
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.Prepaid");
		System.out.println("2.Postpaid");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Recharge r;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter amount");
				int amount = xyz.nextInt();
				r = new Prepaid(amount);
				r.processRecharge();
				break;
				
			 case 2:
				System.out.println("Enter amount");
				int amount1 = xyz.nextInt();
				r = new Postpaid(amount1);
				r.processRecharge();
				break;
				
			default:
				System.out.println("Wrong Choice");
		}
	}
}