/*Question 2: Create a base class Vehicle with attributes brand and speed.
Create a child class Car that adds fuelType.
Display all details using inheritance.
Asked In: Practice Assignment
Description
This program shows how a child class accesses parent properties and adds its own features.
Useful to understand data reuse using inheritance.

Input
Enter Brand: Toyota
Enter Speed: 120
Enter Fuel Type: Petrol

Output
Brand: Toyota
Speed: 120 km/h
Fuel Type: Petrol*/

import java.util.*;
class Vehicle
{
	String brand;
	int speed;
}
class Car extends Vehicle
{
	String fuelType;
	
	void display(String brand,int speed,String fuelType)
	{
		this.brand = brand;
		this.speed = speed;
		this.fuelType = fuelType;
	}
	void show()
	{
		System.out.println("Brand :"+brand);
		System.out.println("Speed :"+speed);
		System.out.println("Fuel Type :"+fuelType);
	}
}
class Q2Vehicle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Brand");
		String brand = xyz.next();
		
		System.out.println("Enter Speed");
		int speed = xyz.nextInt();
		
		System.out.println("Enter Fuel Type");
		String fuelType = xyz.next();
		
		Car c = new Car();
		
		c.display(brand,speed,fuelType);
		c.show();
	}
}