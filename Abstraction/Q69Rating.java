/*Question 69: Create abstract class Rating.
Asked In Practice Question
Abstract method getRating().
Subclasses:

CriticRating

UserRating

Input
Score: 4.5
Output
Rating: Excellent*/

import java.util.*;
abstract class Rating
{
	double score;
	Rating(double score)
	{
		this.score = score;
	}
	abstract void getRating();
}
class CriticRating extends Rating
{
	CriticRating(double score)
	{
		super(score);
	}
	void getRating()
	{
		if(score>=4.5)
		{
			System.out.println("Excellent");
		}
		else if(score>=3.5)
		{
			System.out.println("Good");
		}
		else if(score>=2.5)
		{
			System.out.println("Average");
		}
		else
		{
			System.out.println("Poor");
		}
	}
}
class UserRating extends Rating
{
	UserRating(double score)
	{
		super(score);
	}
	void getRating()
	{
		if(score>=4.5)
		{
			System.out.println("Excellent");
		}
		else if(score>=3.5)
		{
			System.out.println("Good");
		}
		else if(score>=2.5)
		{
			System.out.println("Average");
		}
		else
		{
			System.out.println("Poor");
		}
	}
}
class Q69Rating
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.CriticRating");
		System.out.println("2.UserRating");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Rating r;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Score");
				double score = xyz.nextDouble();
				r = new CriticRating(score);
				r.getRating();
				break;
				
			case 2:
				System.out.println("Enter Score");
				double score1 = xyz.nextDouble();
				r = new UserRating(score1);
				r.getRating();
				break;
				
			default:
				System.out.println("Wrong choice");
		}
	}
}