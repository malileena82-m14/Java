/*Question 90: Create abstract class Worker with method incrementSalary().
Asked In Practice Assignment
Create a POJO class Employee with name and salary.
Use constructor for initialization
Store employees in array
Increase salary by 2000
Display updated salary

Input:
2
Ravi 15000
Sita 18000

Output:
Ravi New Salary: 17000
Sita New Salary: 20000*/

import java.util.*;
abstract class Worker
{
	abstract void incrementSalary();
}
class Employee extends Worker
{
	private String name;
	private int salary;
	Employee(String name,int salary)
	{
		this.name = name;
		this.salary = salary;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public int getSalary()
	{
		return salary;
	}
	void incrementSalary()
	{
		int newsalary = salary+2000;
		System.out.println(name+ " New Salary: "+newsalary);
	}
}
class Q90Worker
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Input");
		int n = xyz.nextInt();
		Worker a[] = new Worker[n];
		
		for(int i=0;i<n;i++)
		{
			String name = xyz.next();
			int salary = xyz.nextInt();
			a[i] = new Employee(name,salary);
		}
		for(int i=0;i<n;i++)
		{
			a[i].incrementSalary();
		}
	}
}
