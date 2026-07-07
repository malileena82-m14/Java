/*Question 13: Create a base class Consumer with attributes name and units.
Create a child class Bill that adds ratePerUnit.
Use super keyword to initialize parent class variables.
Store 2 consumers using an array of objects and calculate total bill.
Asked In Practice Assignment
Description
This assignment shows how inheritance can be used in utility billing systems.
super helps reuse parent class constructor.

Input
Enter number of Consumers: 2

Enter Name: Ramesh
Enter Units: 100
Enter Rate per Unit: 5

Enter Name: Sita
Enter Units: 150
Enter Rate per Unit: 6
Output
Name: Ramesh, Total Bill: 500
Name: Sita, Total Bill: 900*/

import java.util.*;
class Consumer
{
	String name;
	int unit;
	void setData(String name,int unit)
	{
		this.name = name;
		this.unit = unit;
	}
}
class Bill extends Consumer
{
	int ratePerUnit;
	void display(String name,int unit,int ratePerUnit)
	{
		super.setData(name,unit);
		this.ratePerUnit = ratePerUnit;
	}
	void show()
	{
		System.out.println("Name: "+name+", Total Bill: "+(unit*ratePerUnit));
	}
}
class Q13Consumer
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number of consumers");
		int num = xyz.nextInt();
		
		Bill a[] = new Bill[num];
		for(int i=0;i<num;i++)
		{
			a[i] = new Bill();
			
			System.out.println("Enter Name");
			String name = xyz.next();
			
			System.out.println("Enter Units");
			int unit = xyz.nextInt();
			
			System.out.println("Enter ratePerUnit");
			int ratePerUnit = xyz.nextInt();
			
			a[i].display(name,unit,ratePerUnit);
		}
		for(int i=0;i<num;i++)
		{
			a[i].show();
		}
	}
}