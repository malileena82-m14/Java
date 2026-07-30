/*Question 66: Create abstract class Course.
Asked In Practice Question
Abstract method calculateFee().
Subclasses:

OnlineCourse

OfflineCourse

Input
Type: Online
Fee: 5000
Output
Course Fee: 5000*/

import java.util.*;
abstract class Course
{
	int fee;
	Course(int fee)
	{
		this.fee = fee;
	}
	abstract void calculateFee();
}
class OnlineCourse extends Course
{
	OnlineCourse(int fee)
	{
		super(fee);
	}
	void calculateFee()
	{
		System.out.println("Course Fee "+fee);
	}
}
class OfflineCourse extends Course
{
	OfflineCourse(int fee)
	{
		super(fee);
	}
	void calculateFee()
	{
		System.out.println("Course Fee "+fee);
	}
}
class Q66Course
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.OnlineCourse");
		System.out.println("2.OfflineCourse");
		System.out.println("Enter the choice");
		int choice = xyz.nextInt();
		
		Course c;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter fee");
				int fee = xyz.nextInt();
				c = new OnlineCourse(fee);
				c.calculateFee();
				break;
				
			case 2:
				System.out.println("Enter fee");
				int fee1 = xyz.nextInt();
				c = new OnlineCourse(fee1);
				c.calculateFee();
				break;
				
			default:
				System.out.println("Wrong Choice");
		}
	}
}