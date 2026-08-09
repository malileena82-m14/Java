/*Question 83: Create abstract class EmployeeBase with method calculateBonus(). Create POJO Employee.
Asked In Practice Assignment
Description:
Calculate 10% bonus for each employee and display it using array of objects.
Input:
3
101 Raj 20000
102 Simran 30000
103 John 25000

Output:
Raj Bonus: 2000
Simran Bonus: 3000
John Bonus: 2500*/

import java.util.*;
abstract class EmployeeBase
{
	abstract void calculateBonus();
}
class Employee extends EmployeeBase
{
	private int id;
	private String name;
	private int sal;
	
	Employee(int id,String name,int sal)
	{
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setSal(int sal)
	{
		this.sal = sal;
	}
	public int getSal()
	{
		return sal;
	}
	void calculateBonus()
	{
		int bonus = (sal*10)/100;
		System.out.println(getName()+" Bonus :"+bonus);
	}
	
}
class Q83EmployeeBase
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number of Employee");
		int n = xyz.nextInt();
		
		EmployeeBase a[] = new EmployeeBase[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Employee Id");
			int id = xyz.nextInt();
			
			System.out.println("Enter Employee Name");
			String name = xyz.next();
			
			System.out.println("Enter Salary");
			int sal = xyz.nextInt();
			
			a[i] = new Employee(id,name,sal);
		}
		System.out.println("Employee Details");
		for(int i=0;i<n;i++)
		{
			a[i].calculateBonus();
		}
	}
}
