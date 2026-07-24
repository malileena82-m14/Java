/*Question 45: Create an abstract class Vehicle to calculate fuel consumption.
Asked In Practice Question
Create abstract class Vehicle with:

Abstract method calculateMileage()

Create subclasses:

Car ? mileage = distance / fuel

Bike ? mileage = distance / fuel

Program should calculate mileage based on input values.

Input
Vehicle: Car
Distance: 150 km
Fuel: 10 liters
Output
Mileage: 15 km/l*/

import java.util.*;
abstract class Vehicle
{
	abstract void calculateMileage();
}
class Car extends Vehicle
{
	int distance;
	int fuel;
	Car(int distance,int fuel)
	{
		this.distance = distance;
		this.fuel = fuel;
	}
	void calculateMileage()
	{
		System.out.println("Mileage: "+(distance/fuel));
	}
}
class Bike extends Vehicle
{
	int distance;
	int fuel;
	Bike(int distance,int fuel)
	{
		this.distance = distance;
		this.fuel = fuel;
	}
	void calculateMileage()
	{
		System.out.println("Mileage: "+(distance/fuel));
	}
}
class Q45Vehicle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1 Car");
		System.out.println("2 Bike");
		System.out.println("Enter Choice");
		int choice = xyz.nextInt();
		
		
		Vehicle v;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Car Distance");
				int distance = xyz.nextInt();
				
				System.out.println("Enter fuel");
				int fuel = xyz.nextInt();
				
				v = new Car(distance,fuel);
				v.calculateMileage();
				break;
				
			case 2:
				System.out.println("Enter Bike Distance");
				int distance1 = xyz.nextInt();
				
				System.out.println("Enter fuel");
				int fuel1 = xyz.nextInt();
				
				v = new Bike(distance1,fuel1);
				v.calculateMileage();
				break;
				
			default:
				System.out.println("Invalid choice");
		}
	}
}