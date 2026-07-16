/*Question 41: Create a base class Plan with attribute planName.
Create a child class Prepaid that adds rechargeAmount.
Create another child class Postpaid that adds billAmount.

Use constructor chaining (super()).
Store 2 plans using array and display details.
Asked In Practice Assignment
Description
Models a telecom system (prepaid vs postpaid).
Input
Enter number of Plans: 2

Enter Plan: Basic
Enter Recharge: 199
Enter Bill: 0

Enter Plan: Premium
Enter Recharge: 0
Enter Bill: 999
Output
Plan: Basic, Recharge: 199
Plan: Premium, Bill: 999*/

import java.util.*;
class Plan
{
	String planName;
	Plan(String planName)
	{
		this.planName = planName;
	}
}
class Prepaid extends Plan
{
	int rechargeAmount;
	Prepaid(String planName,int rechargeAmount)
	{
		super(planName);
		this.rechargeAmount = rechargeAmount;
	}
}
class Postpaid extends Prepaid
{
	int billAmount;
	Postpaid(String planName,int rechargeAmount,int billAmount)
	{
		super(planName,rechargeAmount);
		this.billAmount = billAmount;
	}
	void show()
	{
		System.out.println("Plan: "+planName+", Recharge: "+rechargeAmount);
	}
	void display()
	{
		System.out.println("Plan: "+planName+", Bill: "+billAmount);
	}
	
}
class Q41Plan
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number of Plan");
		int num = xyz.nextInt();
		Postpaid a[] = new Postpaid[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter Plan");
			String planName = xyz.next();
			System.out.println("Enter Recharge");
			int rechargeAmount = xyz.nextInt();
			System.out.println("Enter Bill");
			int billAmount = xyz.nextInt();
			
			a[i] = new Postpaid(planName,rechargeAmount,billAmount);
		}
		for(int i=0;i<num;i++)
		{
			if(a[i].rechargeAmount>0)
			{
				a[i].show();
			}
			else
			{
				a[i].display();
			}
		}
		
	}
}