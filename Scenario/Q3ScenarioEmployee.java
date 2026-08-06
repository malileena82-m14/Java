/*3. Employee Payroll Management System
A company wants to automate salary calculation.
Requirements:
•	Create a superclass Employee. 
•	Create child classes Developer, Tester, and Manager. 
•	Every employee has different salary calculation logic. 
•	Every employee must submit a daily work report. 
•	Employee ID cannot be changed after assignment. 
•	Initialize common employee details using the parent constructor. 
•	HR should calculate salaries using a single Employee reference. 
•	Prevent modification of company policy method. 
Implement using:
•	Inheritance 
•	Abstract Class 
•	Interface 
•	Dynamic Polymorphism 
•	Overriding 
•	super() Constructor 
•	final Keyword 
•	Loose Coupling */

import java.util.*;
interface CalculateSalary
{
	void CalculateSalary();
}
abstract class Employee implements CalculateSalary
{
	final int id;
	String name;
	int salary;
	Employee(int id,String name,int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public final void companyPolicy()
    {
        System.out.println("Company Policy : Follow office rules and maintain discipline.");
    }

	public abstract void CalculateSalary();
	public abstract void submitReport();
}
class Developer extends Employee
{
	Developer(int id,String name,int salary)
	{
		super(id,name,salary);
	}
	public void CalculateSalary()
	{
		Scanner xyz = new Scanner(System.in); 
		System.out.println("Employee Id: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Basic Salary: "+salary);
		System.out.println("Bonus");
		int bonus = xyz.nextInt();
		int total = salary+(salary * bonus)/100;
		System.out.println("Calculate Salary: "+total);
	}
	public void submitReport()
	{
		System.out.println("Daily Work Report : Completed module development.");
	}
}
class Tester extends Employee
{
	Tester(int id,String name,int salary)
	{
		super(id,name,salary);
	}
	public void CalculateSalary()
	{
		Scanner xyz = new Scanner(System.in); 
		System.out.println("Employee Id: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Basic Salary: "+salary);
		System.out.println("Bonus");
		int bonus = xyz.nextInt();
		int total = salary+(salary * bonus)/100;
		System.out.println("Calculate Salary: "+total);
	}
	public void submitReport()
	{
		System.out.println("Daily Work Report : Completed testing and reported bugs.");
	}
}
class Manager extends Employee
{
	Manager(int id,String name,int salary)
	{
		super(id,name,salary);
	}
	public void CalculateSalary()
	{
		Scanner xyz = new Scanner(System.in); 
		System.out.println("Employee Id: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Basic Salary: "+salary);
		System.out.println("Bonus");
		int bonus = xyz.nextInt();
		int total = salary+(salary * bonus)/100;
		System.out.println("Calculate Salary: "+total);
	}
	public void submitReport()
	{
		System.out.println("Daily Work Report : Managed team and reviewed project progress.");
	}
}
class Q3ScenarioEmployee
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.Developer");
		System.out.println("2.Tester");
		System.out.println("3.Manager");
		System.out.println("Enter choice");
		int choice = xyz.nextInt();
		
		Employee e;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter Employee Id");
				int id = xyz.nextInt();
				xyz.nextLine();
				
				System.out.println("Enter Employee Name");
				String name = xyz.nextLine();
				
				System.out.println("Enter basic salary");
				int salary = xyz.nextInt();
				
				e = new Developer(id,name,salary);
				e.CalculateSalary();
				e.submitReport();
				e.companyPolicy();
				break;
				
			case 2:
				System.out.println("Enter Employee Id");
				int id1 = xyz.nextInt();
				xyz.nextLine();
				
				System.out.println("Enter Employee Name");
				String name1 = xyz.nextLine();
				
				System.out.println("Enter basic salary");
				int salary1 = xyz.nextInt();
				
				e = new Tester(id1,name1,salary1);
				e.CalculateSalary();
				e.submitReport();
				e.companyPolicy();
				break;
				
			case 3:
				System.out.println("Enter Employee Id");
				int id2 = xyz.nextInt();
				xyz.nextLine();
				
				System.out.println("Enter Employee Name");
				String name2 = xyz.nextLine();
				
				System.out.println("Enter basic salary");
				int salary2 = xyz.nextInt();
				
				e = new Manager(id2,name2,salary2);
				e.CalculateSalary();
				e.submitReport();
				e.companyPolicy();
				break;
				
			default:
				System.out.println("Wrong choice");
		}
	}
}