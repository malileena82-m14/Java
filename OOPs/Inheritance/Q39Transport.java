/*Question 39: Create a base class Transport with attribute type.
Create a child class Ride that adds fare.
Create another child class PremiumRide that adds extraCharge.

Use this and super().
Store 3 rides using array and calculate total fare.
Asked In Practice Assignment
Description
Simulates a ride-booking application like Uber/Ola.
Input
Enter number of Rides: 3

Enter Type: Bike
Enter Fare: 100
Enter Extra Charge: 20

Enter Type: Car
Enter Fare: 200
Enter Extra Charge: 50

Enter Type: Auto
Enter Fare: 150
Enter Extra Charge: 30
Output
Type: Bike, Total Fare: 120
Type: Car, Total Fare: 250
Type: Auto, Total Fare: 180*/

import java.util.*;
class Transport
{
	String attributeType;
	Transport(String attributeType)
	{
		this.attributeType = attributeType;
	}
}
class Ride extends Transport
{
	int fare;
	Ride(String attributeType,int fare)
	{
		super(attributeType);
		this.fare = fare;
	}
}
class PremiumRide extends Ride
{
	int extraCharge;
	PremiumRide(String attributeType,int fare,int extraCharge)
	{
		super(attributeType,fare);
		this.extraCharge = extraCharge;
	}
	void show()
	{
		System.out.println("Type: "+attributeType+", Total Fare: "+(fare + extraCharge));
	}
}
class Q39Transport
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Number of Rides");
		int num = xyz.nextInt();
		PremiumRide a[] = new PremiumRide[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter Type");
			String attributeType = xyz.next();
			System.out.println("Enter Fare");
			int fare = xyz.nextInt();
			System.out.println("Enter Extra Charge");
			int extraCharge = xyz.nextInt();
			
			a[i] = new PremiumRide(attributeType,fare,extraCharge);
		}
		for(int i=0;i<num;i++)
		{
			a[i].show();
		}
	}
}