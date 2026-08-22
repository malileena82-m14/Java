/*Question 101: Abstract class Employee.
Asked In Practice Assignment
Detailed Description:
Sort employees by salary.
Store in array
Apply sorting
Display sorted list

Input:
3
Ravi 20000
Amit 15000
Sita 25000

Output:
Sita 25000
Ravi 20000
Amit 15000*/

import java.util.*;
abstract class Employee
{
	String name;
	int sal;
	Employee(String name,int sal)
	{
		this.name = name;
		this.sal = sal;
	}
}
class Salary extends Employee
{	
	Salary(String name,int sal)
	{
		super(name,sal);
	}
}
class Q101Employee
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter input");
		int n = xyz.nextInt();
		
		Salary a[] = new Salary[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name");
			String name = xyz.next();
		
			System.out.println("Enter Salary");
			int sal = xyz.nextInt();
			
			a[i] = new Salary(name,sal);
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i].sal<a[j].sal)
				{
					Salary temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i].name+ " " +a[i].sal);
		}
	}
}