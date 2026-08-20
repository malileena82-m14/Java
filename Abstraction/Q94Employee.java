/*Question 94: Abstract class Employee with method calculateSalary().
Asked In Practice Assignment
Create:
FullTime ? fixed salary
PartTime ? hours * rate
Store in array
Calculate salary dynamically

Input:
2
FullTime 30000
PartTime 100 50

Output:
FullTime Salary: 30000
PartTime Salary: 5000*/

import java.util.*;
abstract class Employee
{
	abstract void calculateSalary();
}
class FullTime extends Employee
{
	int salary;
	FullTime(int salary)
	{
		this.salary = salary;
	}
	void calculateSalary()
	{
		System.out.println("FullTime Salary: "+salary);
	}
}
class PartTime extends Employee
{
	int hours;
	int rate;
	PartTime(int hours,int rate)
	{
		this.hours = hours;
		this.rate = rate;
	}
	void calculateSalary()
	{
		System.out.println("PartTime Salary: "+(hours*rate));
	}
}
class Q94Employee
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Input");
		int n = xyz.nextInt();
		Employee a[] = new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter type");
			String type = xyz.next();
			if(type.equalsIgnoreCase("FullTime"))
			{
				System.out.println("Enter Salary");
				int salary = xyz.nextInt();
				a[i] = new FullTime(salary);
			}
			else if(type.equalsIgnoreCase("PartTime"))
			{
				System.out.println("Enter Hours");
				int hours = xyz.nextInt();
				System.out.println("Enter rate");
				int rate = xyz.nextInt();
				a[i] = new PartTime(hours,rate);
			}
			else
			{
				System.out.println("Invalid");
			}
		}
		for(int i=0;i<n;i++)
		{
			a[i].calculateSalary();
		}
	}
}