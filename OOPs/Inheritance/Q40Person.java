/*Question 40: Create a base class Person with attribute name.
Create a child class Doctor that adds consultationFee.
Create another child class SpecialistDoctor that adds specialFee.

Use this and super().
Store 2 doctors using array and calculate total fee.
Asked In Practice Assignment
Description
Models a hospital billing system.
Input
Enter number of Doctors: 2

Enter Name: Dr. Sharma
Enter Fee: 500
Enter Special Fee: 300

Enter Name: Dr. Mehta
Enter Fee: 600
Enter Special Fee: 400
Output
Doctor: Dr. Sharma, Total Fee: 800
Doctor: Dr. Mehta, Total Fee: 1000*/

import java.util.*;
class Person
{
	String name;
	Person(String name)
	{
		this.name = name;
	}
}
class Doctor extends Person
{
	int consultationFee;
	Doctor(String name,int consultationFee)
	{
		super(name);
		this.consultationFee = consultationFee;
	}
	
}
class SpecialistDoctor extends Doctor
{
	int specialFee;
	SpecialistDoctor(String name,int consultationFee,int specialFee)
	{
		super(name,consultationFee);
		this.specialFee = specialFee;
	}
	void show()
	{
		System.out.println("Doctor: "+name+", Total Fee: "+(consultationFee + specialFee));
	}
}
class Q40Person
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number of Products");
		int num = xyz.nextInt();
		SpecialistDoctor a[] = new SpecialistDoctor[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter Name");
			String name = xyz.next();
			System.out.println("Enter Fee");
			int fee = xyz.nextInt();
			System.out.println("Enter Special Fee");
			int specialFee = xyz.nextInt();
			
			a[i] = new SpecialistDoctor(name,fee,specialFee);
		}
		for(int i=0;i<num;i++)
		{
			a[i].show();
		}
	}
}