/*Question 19: Design an employee payroll system.
Create a base class Employee with attributes name and basicSalary.
Create a child class Payroll that adds hra and da.
Use super keyword to initialize parent class.
Store 3 employees using an array of objects and calculate gross salary.
Asked In Practice Assignment
Description
This mini project demonstrates a complete academic system with grading
logic using inheritance.
Input
Enter number of Employees: 3

Enter Name: Suresh
Enter Basic Salary: 30000
Enter HRA: 5000
Enter DA: 3000

Enter Name: Meena
Enter Basic Salary: 40000
Enter HRA: 6000
Enter DA: 4000

Enter Name: Kiran
Enter Basic Salary: 35000
Enter HRA: 5500
Enter DA: 3500
Output
Name : Suresh
Basic Salary : 30000.0
HRA : 5000.0
DA : 3000.0
Gross Salary : 38000.0

Name : Meena
Basic Salary : 40000.0
HRA : 6000.0
DA : 4000.0
Gross Salary : 50000.0

Name : Kiran
Basic Salary : 35000.0
HRA : 5500.0
DA : 3500.0
Gross Salary : 44000.0*/

import java.util.*;
class Employee
{
	String name;
	double basicSalary;
	void setData(String name,double basicSalary)
	{
		this.name = name;
		this.basicSalary = basicSalary;
	}
}
class Payroll extends Employee
{
	double hra;
	double da;
	void display(String name,double basicSalary,double hra,double da)
	{
		super.setData(name,basicSalary);
		this.hra = hra;
		this.da = da;
	}
	void show()
	{
		double grossSalary = basicSalary + hra + da;
		System.out.println("Name: "+name);
		System.out.println("Basic Salary: "+basicSalary);
		System.out.println("HRA: "+hra);
		System.out.println("DA: "+da);
		System.out.println("Gross Salary: "+grossSalary);
	}
}
class Q19Employee
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Number of Employees");
		int num = xyz.nextInt();
		
		Payroll a[] = new Payroll[num];
		for(int i=0;i<num;i++)
		{
			a[i] = new Payroll();
			
			System.out.println("Enter Name");
			String name = xyz.next();
			
			System.out.println("Enter Basic Salary");
			double basicSalary = xyz.nextDouble();
			
			System.out.println("Enter HRA");
			double hra = xyz.nextDouble();
			
			System.out.println("Enter DA");
			double da = xyz.nextDouble();
			
			a[i].display(name,basicSalary,hra,da);
		}
		for(int i=0;i<num;i++)
		{
			a[i].show();
		}
	}
}