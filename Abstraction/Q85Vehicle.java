/*Question 85: Abstract Vehicle class with display()method. Create Car class.
Asked In Practice Assignment
Description:
Store car details in array and print using abstraction.

Input:
2
BMW 5000000
Audi 6000000

Output:

Car: BMW Price: 5000000
Car: Audi Price: 6000000*/

import java.util.*;
abstract class Vehicle
{
	abstract void display();
}
class Car extends Vehicle
{
	String name;
	int price;
	Car(String name,int price)
	{
		this.name = name;
		this.price = price;
	}
	void display()
	{
		System.out.println("Car: "+name+ " Price: "+price);
	}
}
class Q85Vehicle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number of Car");
		int n = xyz.nextInt();
		
		Vehicle v[] = new Vehicle[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter car name");
			String name = xyz.next();
			
			System.out.println("Enter Price");
			int price = xyz.nextInt();
			
			v[i] = new Car(name,price);
		}
		for(int i=0;i<n;i++)
		{
			v[i].display();
		}
	}
}