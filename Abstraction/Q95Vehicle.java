/*Question 95: Abstract class Vehicle with method mileage()
Asked In Practice Assignment
Create Car and Bike classes.
Store in array
Display mileage

Input:
2
Car 15
Bike 40

Output:
Car Mileage: 15 km/l
Bike Mileage: 40 km/l*/

import java.util.*;
abstract class Vehicle
{
	abstract void mileage();
}
class Car extends Vehicle
{
	int distance;
	Car(int distance)
	{
		this.distance = distance;
	}
	void mileage()
	{
		System.out.println("Car Mileage: "+distance+" Km/1");
	}
}
class Bike extends Vehicle
{
	int distance;
	Bike(int distance)
	{
		this.distance = distance;
	}
	void mileage()
	{
		System.out.println("Bike Mileage: "+distance+" Km/1");
	}
}
class Q95Vehicle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter input");
		int n = xyz.nextInt();
		Vehicle a[] = new Vehicle[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter type");
			String type = xyz.next();
			if(type.equalsIgnoreCase("Car"))
			{
				System.out.println("enter Distance");
				int distance = xyz.nextInt();
				a[i] = new Car(distance);
			}
			else if(type.equalsIgnoreCase("Bike"))
			{
				System.out.println("enter Distance");
				int distance = xyz.nextInt();
				a[i] = new Bike(distance);
			}
			else 
			{
				System.out.println("Invalid");
			}
		}
		for(int i=0;i<n;i++)
		{
			a[i].mileage();
		}
	}
}
