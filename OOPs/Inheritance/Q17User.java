/*Question 17: Design an electricity billing system with slab rates.
Create a base class User with attributes name and units.
Create a child class Tariff that adds slab calculation logic:

First 100 units ? ?5/unit

Above 100 units ? ?8/unit

Use super keyword to initialize parent data.
Store 3 users using an array of objects and calculate total bill.
Asked In Practice Assignment
Description
This case study demonstrates real-world slab-based billing
logic using inheritance and arrays..
Input
Enter number of Users: 3

Enter Name: Ramesh
Enter Units: 80

Enter Name: Sita
Enter Units: 120

Enter Name: Mohan
Enter Units: 150
Output
Name: Ramesh, Bill: 400
Name: Sita, Bill: 960
Name: Mohan, Bill: 1200*/

import java.util.*;
class User
{
	String name;
	int units;
	void setData(String name,int units)
	{
		this.name = name;
		this.units = units;
	}
}
class Tariff extends User
{
	int slab;
	void display(String name,int units)
	{
		super.setData(name,units);
	}
	void show()
	{
		if(units<=100)
		{
			slab = units*5;
		}
		else
		{
			slab = (100*5) + (units-100)*8;
		}
		System.out.println("Name: "+name+", Bill: "+slab);
	}
}
class Q17User
{
	public static void main(String x[])
	{
		Scanner xyz =  new Scanner(System.in);
		System.out.println("Enter number of Users");
		int num = xyz.nextInt();
		
		Tariff a[] = new Tariff[num];
		
		for(int i=0;i<num;i++)
		{
			a[i] = new Tariff();
			
			System.out.println("Enter Name");
			String name = xyz.next();
			
			System.out.println("Enter Units");
			int units = xyz.nextInt();
			
			a[i].display(name,units);
		}
		for(int i=0;i<num;i++)
		{
			a[i].show();
		}
	}
}