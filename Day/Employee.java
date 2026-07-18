/*Question 3: Write a Java program to implement Employee Salary Classification.
Create a class Employee with attributes empId, name, and salary.
Determine salary category:
- Salary > 50000 => High Salary
- Salary 20000 to 50000 => Medium Salary
- Salary < 20000 => Low Salary
Input:
Enter Employee Id : 201
Enter Name : Amit
Enter Salary : 45000

Output:
Employee Id : 201
Name : Amit
Salary : 45000
Category : Medium Salary

Explanation:
A class Employee is created with instance variables empId, name, and salary.
An object is created and values are accepted from the user via Scanner.
An if-else ladder is used to classify the salary:
- salary > 50000 prints High Salary
- salary >= 20000 && salary <= 50000 prints Medium Salary
- salary < 20000 prints Low Salary
Since 45000 falls between 20000 and 50000, the category is Medium Salary.
This program teaches multi-condition if-else with class objects.*/

import java.util.*;
class Employee
{
	int id;
	String name;
	int salary;
	
	void display()
	{
		System.out.println("Employee Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		
		if(salary > 50000)
		{
			System.out.println("Category : High Salary");
		}
		else if(salary>=20000 && salary<=50000)
		{
			System.out.println("Category : Medium Salary");
		}
		else if(salary<20000)
		{
			System.out.println("Category : Low Salary");
		}
	}
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("Enter Employee Id ");
		emp.id = xyz.nextInt();
		xyz.nextLine();
		
		System.out.println("Enter Name");
		emp.name = xyz.nextLine();
		
		System.out.println("Enter Salary");
		emp.salary = xyz.nextInt();
		
		emp.display();
	}
}
