/*Question 9: Create a base class Staff with attributes name and salary.
Create a child class TeachingStaff that adds subject.
Store details of 2 staff members using an array of objects and display them.
Asked In Practice Assignment
Description
This assignment demonstrates real-world inheritance (Staff ? TeachingStaff)
and storing multiple records using arrays.

Input
Enter number of Staff: 2

Enter Name: Anil
Enter Salary: 40000
Enter Subject: Math

Enter Name: Sunita
Enter Salary: 45000
Enter Subject: Physics
Output
Name: Anil, Salary: 40000, Subject: Math
Name: Sunita, Salary: 45000, Subject: Physics*/

import java.util.*;
class Staff
{
	String name;
	int salary;
}
class TeachingStaff extends Staff
{
	String subject;
	void setData(String name,int salary,String subject)
	{
		this.name = name;
		this.salary = salary;
		this.subject = subject;
	}
	void display()
	{
		System.out.println("Name: "+name+", Salary:"+salary+", Subject:"+subject);
	}
}
class Q9Staff
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number of Staff");
		int num = xyz.nextInt();
		
		TeachingStaff a[] = new TeachingStaff[num];
		for(int i=0;i<num;i++)
		{
			a[i] = new TeachingStaff();
			
			System.out.println("Enter Name");
			String name = xyz.next();
			
			System.out.println("Enter Salary");
			int salary = xyz.nextInt();
			
			System.out.println("Enter Subject");
			String subject = xyz.next();
			
			a[i].setData(name,salary,subject);
		}
		for(int i=0;i<num;i++)
		{
			a[i].display();
		}
		
	}
}