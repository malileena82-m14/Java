/*Question 64: Create abstract class Parking.
Asked In Practice Question
Abstract method calculateFee().
Subclasses:

CarParking

BikeParking

Input
Hours: 5
Rate: 20
Output
Fee: 100*/

import java.util.*;
abstract class Parking
{
	int hours;
	int rate;
	Parking(int hours,int rate)
	{
		this.hours = hours;
		this.rate = rate;
	}
	abstract void calculateFee();
}
class CarParking extends Parking
{
	CarParking(int hours,int rate)
	{
		super(hours,rate);
	}
	void calculateFee()
	{
		System.out.println("Fee: "+(hours*rate));
	}
}
class BikeParking extends Parking
{
	BikeParking(int hours,int rate)
	{
		super(hours,rate);
	}
	void calculateFee()
	{
		System.out.println("Fee: "+(hours*rate));
	}
}
class Q64Parking
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.CarParking");
		System.out.println("2.BikeParking");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		Parking p;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter hours");
				int hours = xyz.nextInt();
				System.out.println("Enter rate");
				int rate = xyz.nextInt();
				p = new CarParking(hours,rate);
				p.calculateFee();
				break;
				
			case 2:
				System.out.println("Enter hours");
				int hours1 = xyz.nextInt();
				System.out.println("Enter rate");
				int rate1 = xyz.nextInt();
				p = new BikeParking(hours1,rate1);
				p.calculateFee();
				break;
				
			default:
				System.out.println("Wrong Choice");
		}
	}
}
