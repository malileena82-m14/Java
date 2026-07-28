/*Question 60: Create abstract class Room.
Asked In Practice Question
Abstract method calculateCost().
Subclasses:

ACRoom

NonACRoom

Input
Type: AC
Days: 2
Rate: 1500
Output
Total Cost: 3000*/

import java.util.*;
abstract class Room
{
	int days;
	int rate;
	Room(int days,int rate)
	{
		this.days = days;
		this.rate = rate;
	}
	abstract void calculateCost();
}
class ACRoom extends Room
{
	ACRoom(int days,int rate)
	{
		super(days,rate);
	}
	void calculateCost()
	{
		System.out.println("Total Cost: "+(days*rate));
	}
}
class NonACRoom extends Room
{
	NonACRoom(int days,int rate)
	{
		super(days,rate);
	}
	void calculateCost()
	{
		System.out.println("Total Cost: "+(days*rate));
	}
}
class Q60Room
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.ACRoom");
		System.out.println("2.NonACRoom");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Room r;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter days");
				int days = xyz.nextInt();
				System.out.println("Enter rate");
				int rate = xyz.nextInt();
				
				r = new ACRoom(days,rate);
				r.calculateCost();
				break;
				
			case 2:
				System.out.println("Enter days");
				int days1 = xyz.nextInt();
				System.out.println("Enter rate");
				int rate1 = xyz.nextInt();
				
				r = new NonACRoom(days1,rate1);
				r.calculateCost();
				break;
				
			default:
				System.out.println("Wrong choice");
		}
	}
}