/*Question 1: Create a base class Employee with attributes name and salary.
Create a child class Manager that adds bonus.
Calculate total salary using inheritance.
Asked In: Practice Assignment
Description
This program demonstrates single inheritance where Manager inherits from Employee.
The child class extends functionality by adding a bonus and calculating total salary.

Input
Enter Name: Rahul
Enter Salary: 50000
Enter Bonus: 10000

Output
Employee Name: Rahul
Base Salary: 50000
Bonus: 10000
Total Salary: 60000*/

import java.util.*;
class Employee
{
	String name;
	int salary;
	
}
class Manager extends Employee
{
	int bonus;
	void display(String name,int salary,int bonus)
	{
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}
	void show()
	{
		System.out.println("Employee Name :"+name);
		System.out.println("Base Salary :"+salary);
		System.out.println("Bonus :"+bonus);
		int totalSalary = salary + bonus;
		System.out.println("Total Salary :"+totalSalary);
	}
}
class Q1Employee
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = xyz.next();
		
		System.out.println("Enter salary");
		int salary = xyz.nextInt();
		
		System.out.println("Enter Bonus");
		int bonus = xyz.nextInt();
		
		Manager m = new Manager();
		
		m.display(name,salary,bonus);
		m.show();
	}
	
}