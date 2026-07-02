/*Question 2: Write a Java program to create an Employee class and calculate yearly salary using constructor.

Description: Create Employee class with empId, empName and monthlySalary. Use constructor to initialize values. 
Calculate yearly salary (monthlySalary × 12) and display it.
INPUT:
Enter Employee Id: 201
Enter Employee Name: Amit
Enter Monthly Salary: 25000

OUTPUT:
Employee Name: Amit
Yearly Salary: 300000

EXPLANATION:
Create Employee class with fields empId, empName, monthlySalary. Use constructor public Employee(int empId, String empName, int monthlySalary) 
to initialize. Calculate yearly salary as monthlySalary * 12 in constructor or display method. Display employee name and yearly salary.*/

import java.util.*;
class Employee
{
	int id;
	String name;
	int salary;
	
	Employee(int id, String name,int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void display()
	{
		System.out.println("Employee Name :"+name);
		salary = salary*12;
		System.out.println("Yearly Salary :"+salary);
	}
	
}
class ConstEmployee
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter Employee Id :");
		int id = xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Employee Name :");
		String name = xyz.nextLine();
		System.out.println("Enter Monthly Salary :");
		int salary = xyz.nextInt();
		
		Employee emp = new Employee(id,name,salary);
		emp.display();
	}
}