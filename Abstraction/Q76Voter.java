/*Question 76: Create abstract class Voter.
Asked In Practice Question
Abstract method checkEligibility().
Subclasses:

IndianVoter

ForeignVoter

Input
Age: 20
Output
Eligible to Vote*/

import java.util.*;
abstract class Voter
{
	int age;
	Voter(int age)
	{
		this.age = age;
	}
	abstract void checkEligibility();
}
class IndianVoter extends Voter
{
	IndianVoter(int age)
	{
		super(age);
	}
	void checkEligibility()
	{
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("not Eligible to vote");
		}
	}
}
class ForeignVoter extends Voter
{
	ForeignVoter(int age)
	{
		super(age);
	}
	void checkEligibility()
	{
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("not Eligible to vote");
		}
	}
}
class Q76Voter
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.IndianVoter");
		System.out.println("2.ForeignVoter");
		System.out.println("Enter choice");
		int choice = xyz.nextInt();
		
		Voter v;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter age");
				int age = xyz.nextInt();
				v = new IndianVoter(age);
				v.checkEligibility();
				break;
				
			case 2:
				System.out.println("Enter age");
				int age1 = xyz.nextInt();
				v = new ForeignVoter(age1);
				v.checkEligibility();
				break;
				
			default:
				System.out.println("Wrong choice");
		}
	}
}