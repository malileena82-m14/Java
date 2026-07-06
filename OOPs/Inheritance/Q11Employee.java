/*Question 11: Create a base class Employee with attributes name and salary.
Create a child class Manager that adds bonus.
Use super keyword to initialize parent class variables.
Store 2 managers using an array of objects and display total salary.
Asked In Practice Assignment
Description
This program demonstrates how super is used to call the parent constructor.
Array of objects is used to store multiple Manager records.

Input
Enter number of Managers: 2

Enter Name: Raj
Enter Salary: 50000
Enter Bonus: 10000

Enter Name: Simran
Enter Salary: 60000
Enter Bonus: 15000
Output
Name: Raj, Total Salary: 60000
Name: Simran, Total Salary: 75000*/

import java.util.*;
class Employee
{
	String name;
	int salary;
	void setData(String name,int salary)
	{
		this.name = name;
		this.salary = salary;
	}
}
class Manager extends Employee
{
	int bonus;
	void show(String name,int salary,int bonus)
	{
		super.setData(name,salary);
		this.bonus = bonus;
	}
	
	void display()
	{
		System.out.println("Name: "+name+", Total Salary: "+(salary+bonus));
	}
}
class Q11Employee
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number of Managers");
		int num = xyz.nextInt();
		
		Manager a[] = new Manager[num];
		for(int i=0;i<num;i++)
		{
			a[i] = new Manager();
			System.out.println("Enter Name");
			String name = xyz.next();
			
			System.out.println("Enter Salary");
			int salary = xyz.nextInt();
			
			System.out.println("Enter Bonus");
			int bonus = xyz.nextInt();
			
			a[i].show(name,salary,bonus);
		}
		for(int i=0;i<num;i++)
		{
			a[i].display();
		}
	}
}